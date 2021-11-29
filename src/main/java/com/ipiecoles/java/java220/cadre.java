package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class cadre extends Employe{
    private Double coefficient = 1.0;

    public cadre(Double coefficient) {
        this.coefficient = coefficient;
    }

    public cadre(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double coefficient) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.coefficient = coefficient;
    }

    public cadre(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, boolean tempsPartiel, String sexe, Double coefficient) {
        super(nom, prenom, matricule, dateEmbauche, salaire, tempsPartiel, sexe);
        this.coefficient = coefficient;
    }

    public cadre() {

    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof cadre)) return false;
        if (!super.equals(o)) return false;
        cadre cadre = (cadre) o;
        return Objects.equals(getCoefficient(), cadre.getCoefficient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCoefficient());
    }

    @Override
    public String toString() {
        return "cadre{" +
                "coefficient=" + coefficient +
                '}';
    }

    public Double getPrimeAnnuelle(){
        //System.out.println( Entreprise.primeAnnuelleBase()* this.coefficient);
        return Entreprise.primeAnnuelleBase()* this.coefficient;
    }

    public Integer getNbConges() {
        int i= (int) Math.round(this.coefficient) +  Entreprise.NB_CONGES_BASE;
        //System.out.println(i);
        return i;

    }
}
