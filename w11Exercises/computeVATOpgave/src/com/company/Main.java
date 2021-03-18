/*
 * FORMÅL:
 * At omskrive en procesorienteret løsning til en objektorienteret løsning
 *
 * OPGAVE:
 * Du skal forbedre denne kode ved at flytte de forskellige metoder
 * ud i passende klasser
 *
 * Fremgangsmåden er altså flg:
 * 1) kopier eksisterende kode
 * 2) gem hver metode i en klasse med passende naven (doDiag bliver til Dialog)
 * 3) åbn hver fil og sørg for passende "inventar" (fields, constructor and method)
 * 4) sørg for at lave en Main som kun rummer flg:
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.runController();
    }
    *
    * TEST kørsel:
    * Indtast varens pris:
345,6
Du betaler 86,40 Kr i MOMS
*  5) Dokumenter programmet med et klassediagram - brug PlantUML
 *
 */


package com.company;

import java.util.Scanner;
class Main {
    final static int PRCVAT = 25;
    final static String MSG = "MOMS";
    final static String CURRENCY = "Kr";


    public static void main(String[] args)
    {
        Controller controller = new Controller();
        controller.runController();

    }

}
