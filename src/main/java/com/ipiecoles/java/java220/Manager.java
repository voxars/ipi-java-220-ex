package com.ipiecoles.java.java220;

import exceptions.TechnicienException;
import org.joda.time.LocalDate;

import java.util.HashSet;

public class Manager extends Employe{
    private HashSet<Technicien> equipe = new HashSet<>();

    public Manager() {

    }

    public Manager(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
    }

    public HashSet<Technicien> getEquipe() {
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe) {
        this.equipe = equipe;
    }

    public void ajoutTechnicienEquipe(Technicien technicien){
        equipe.add(technicien);
    }



    @Override
    public void setSalaire(Double salaire){
        super.setSalaire(salaire* Entreprise.INDICE_MANAGER + salaire * equipe.size()*0.1);
    }

    public Double getPrimeAnnuelle(){
        return Entreprise.primeAnnuelleBase() + equipe.size() * Entreprise.PRIME_MANAGER_PAR_TECHNICIEN;
    }

    public void ajoutTechnicienEquipe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Integer grade) throws TechnicienException {
        this.ajoutTechnicienEquipe(new Technicien(nom,prenom, matricule, dateEmbauche, salaire, grade));
    }

    public void augmenterSalaire(Double pourcentage) throws Exception{
        super.augmenterSalaire(pourcentage);
        this.augmenterSalaireEquipe(pourcentage);

    }

    private void augmenterSalaireEquipe(Double pourcentage) throws Exception{
        for (Technicien technicien : this.equipe){
            technicien.augmenterSalaire(pourcentage);
        }
    }
}
