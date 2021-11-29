package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args){
        cadre a = new cadre("mars","Miller","a56v",new LocalDate(2019,12,15),15.0,true,"male",3.6);
        a.getNbConges();
        a.getPrimeAnnuelle();
    }
}
