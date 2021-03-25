package com.company;

public class Dieselbil extends Bil
{
    boolean harPartikelfilter;
    float kmPrL;

    Dieselbil (String regNr, String mærke, String model, int årgang, int antaldøre,
               boolean harPartikelfilter, float kmPrL)
    {
        super(regNr, mærke, model, årgang, antaldøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString()
    {
        return "Dieselbil" + '\n' +
                "Har den partikelflter? : " + harPartikelfilter + '\n' +
                "kmPrL : " + kmPrL + '\n' +
                "regNr : " + regNr + '\n' +
                "mærke : " + mærke + '\n' +
                "model : " + model + '\n' +
                "årgang : " + årgang + '\n' +
                "Antal døre :" + antaldøre +"";
    }

    //Getters
    public float getKmPrL()
    {
        return kmPrL;
    }

    //Setters
    public void setHarPartikelfilter(boolean harPartikelfilter)
    {
        this.harPartikelfilter = harPartikelfilter;
    }

    public void setKmPrL(float kmPrL)
    {
        this.kmPrL = kmPrL;
    }
}
