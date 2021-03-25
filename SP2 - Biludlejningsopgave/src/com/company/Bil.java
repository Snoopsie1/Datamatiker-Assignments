package com.company;

import java.sql.SQLOutput;

public abstract class Bil
{
    String regNr;
    String mærke;
    String model;
    int årgang;
    int antaldøre;

    Bil (String regNr, String mærke, String model, int årgang, int antaldøre)
    {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antaldøre = antaldøre;
    }

    public static double beregnGrønEjerafgift(Bil bil)
    {
        double grønEjerafgift = 0;
        double udligningsAfgift = 0;
        int partikelUdleningsAfgift = 0;

        //Benz Dyt
        if (bil instanceof Benzinbil)
        {
            if (((Benzinbil) bil).kmPrL >= 20
                    && ((Benzinbil) bil).kmPrL <= 50)
            {
                grønEjerafgift = 330;
            }

            if (((Benzinbil) bil).kmPrL >= 15
                    && ((Benzinbil) bil).kmPrL <= 20)
            {
                grønEjerafgift = 1050;
            }

            if (((Benzinbil) bil).kmPrL >= 10
                    && ((Benzinbil) bil).kmPrL <= 15)
            {
                grønEjerafgift = 2340;
            }

            if (((Benzinbil) bil).kmPrL >= 5
                    && ((Benzinbil) bil).kmPrL <= 10)
            {
                grønEjerafgift = 5500;
            }

            if (((Benzinbil) bil).kmPrL < 5)
            {
                grønEjerafgift = 10470;
            }

            System.out.println("/ / / / / / / / / / Benzin Bil / / / / / / / / / /");
            System.out.println("Din bil er en Benzin Bil");
            System.out.println("Dens km pr liter er : "+ ((Benzinbil) bil).kmPrL);
            System.out.println(" - - - - - REGNING - - - - - ");
            System.out.println("Du skal betale følgende afgifter :" + '\n' +
                    "Grøn Ejerafgift : " +grønEjerafgift+ '\n' +
                    "I alt : " + grønEjerafgift + "kr.");
        }

        //El Dyt
        if (bil instanceof Elbil)
        {
            double WhToL = ((Elbil) bil).whPrKm / 91.25;
            double kmL = 100 / WhToL;

            if (kmL >= 20
                    && kmL <= 50)
            {
                grønEjerafgift = 330;
            }

            if (kmL >= 15
                    && kmL <= 20)
            {
                grønEjerafgift = 1050;
            }

            if (kmL >= 10
                    && kmL <= 15)
            {
                grønEjerafgift = 2340;
            }

            if (kmL >= 5
                    && kmL <= 10)
            {
                grønEjerafgift = 5500;
            }

            if (kmL < 5)
            {
                grønEjerafgift = 10470;
            }

            System.out.println("/ / / / / / / / / / El Bil / / / / / / / / / /");
            System.out.println("Din bil er en El Bil");
            System.out.println("Dens watt pr kilometer er : "+ ((Elbil) bil).whPrKm);
            System.out.println("Din afgifter er beregnet via denne algoritme : ");
            System.out.println("BenzinPr100km = Wh/km ÷ 91,25Wh/l)");
            System.out.println("Km/l = 100 / BenzinPr100km");

            System.out.println(" - - - - - REGNING - - - - - ");
            System.out.println("Du skal betale følgende afgifter :" + '\n' +
                    "Grøn Ejerafgift : " +grønEjerafgift+ '\n' +
                    "I alt : " + grønEjerafgift + "kr.");
        }

        // Diesel Dyt
        if (bil instanceof Dieselbil)
        {
            if (((Dieselbil) bil).kmPrL >= 20
                    && ((Dieselbil) bil).kmPrL <= 50)
            {
                grønEjerafgift = 330;
                udligningsAfgift = 130;

                grønEjerafgift += udligningsAfgift;
            }

            if (((Dieselbil) bil).kmPrL >= 15
                    && ((Dieselbil) bil).kmPrL <= 20)
            {
                grønEjerafgift = 1050;
                udligningsAfgift = 1390;

                grønEjerafgift += udligningsAfgift;
            }

            if (((Dieselbil) bil).kmPrL >= 10
                    && ((Dieselbil) bil).kmPrL <= 15)
            {
                grønEjerafgift = 2340;
                udligningsAfgift = 1850;

                grønEjerafgift += udligningsAfgift;
            }

            if (((Dieselbil) bil).kmPrL >= 5
                    && ((Dieselbil) bil).kmPrL <= 10)
            {
                grønEjerafgift = 5500;
                udligningsAfgift = 2770;

                grønEjerafgift += udligningsAfgift;
            }

            if (((Dieselbil) bil).kmPrL < 5)
            {
                grønEjerafgift = 10470;
                udligningsAfgift = 15260;

                grønEjerafgift += udligningsAfgift;
            }

            System.out.println("/ / / / / / / / / / Diesel Bil / / / / / / / / / /");
            System.out.println("Din bil er en Diesel Bil");
            System.out.println("Dens km pr liter er : "+ ((Dieselbil) bil).kmPrL);
            if(((Dieselbil) bil).harPartikelfilter == false)
            {
                partikelUdleningsAfgift = 1000;
                grønEjerafgift += partikelUdleningsAfgift;
            }
            System.out.println(" - - - - - REGNING - - - - - ");
            System.out.println("Du skal betale følgende afgifter :" + '\n' +
                    "Udligningsafgift : " +udligningsAfgift+ '\n' +
                    "Partikeludleningsafgift : " +partikelUdleningsAfgift+ '\n' +
                    "Grøn Ejerafgift : " +grønEjerafgift+ '\n' +
                    "I alt : " + (udligningsAfgift + partikelUdleningsAfgift + grønEjerafgift)+ "kr.");
        }

        return grønEjerafgift;
    }

    //Getters
    public String getRegNr()
    {
        return regNr;
    }

    public String getMærke()
    {
        return mærke;
    }

    public String getModel()
    {
        return model;
    }

    public int getÅrgang()
    {
        return årgang;
    }

    public int getAntaldøre()
    {
        return antaldøre;
    }

    //Setters
    public void setRegNr(String regNr)
    {
        this.regNr = regNr;
    }

    public void setMærke(String mærke)
    {
        this.mærke = mærke;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setÅrgang(int årgang)
    {
        this.årgang = årgang;
    }

    public void setAntaldøre(int antaldøre)
    {
        this.antaldøre = antaldøre;
    }
}
