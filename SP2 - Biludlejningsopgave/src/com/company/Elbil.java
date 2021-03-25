package com.company;

public class Elbil extends Bil
{
    int batterikapacitetKWh;
    float maxKm;
    float whPrKm;

    Elbil (String regNr, String mærke, String model, int årgang, int antaldøre, int batterikapacitetKWh, float maxKm, float whPrKm)
    {
        super(regNr, mærke, model, årgang, antaldøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString()
    {
        return "Elbil" + '\n' +
                "Batteri Kapacitet  : " + batterikapacitetKWh + " KWh" + '\n' +
                "Max antal km på én ladning : " + maxKm + '\n' +
                "Watt Pr.Km : " + whPrKm + '\n' +
                "regNr : " + regNr + '\n' +
                "mærke : " + mærke + '\n' +
                "model : " + model + '\n' +
                "årgang : " + årgang + '\n' +
                "Antal døre :" + antaldøre +"";
    }

    //Getters
    public int getBatterikapacitetKWh()
    {
        return batterikapacitetKWh;
    }

    public float getMaxKm()
    {
        return maxKm;
    }

    public float getWhPrKm()
    {
        return whPrKm;
    }

    //Setters

    public void setBatterikapacitetKWh(int batterikapacitetKWh)
    {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public void setMaxKm(float maxKm)
    {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(float whPrKm)
    {
        this.whPrKm = whPrKm;
    }
}
