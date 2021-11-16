package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public abstract class Entreprise {
    public static final Double SALAIRE_BASE = 1480.27D;
    public static final Integer NB_CONGES_BASE = 25;
    public static final Double INDICE_MANAGER = 1.3D;
    public static final Double PRIME_MANAGER_PAR_TECHNICIEN = 250.0D;
    public static final Double PRIME_ANCIENNETE = 100.0D;

    public Entreprise() {
    }

    public static Double primeAnnuelleBase() {
        return (double)LocalDate.now().getYear() * 0.5D;
    }
}