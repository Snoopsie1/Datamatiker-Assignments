package com.company;

public class Benzinbil extends Bil
{
    int oktantal;
    float kmPrL;

    Benzinbil (String regNr, String mærke, String model, int årgang, int antaldøre, int oktanttal, float kmPrL)
    {
        super(regNr, mærke, model, årgang, antaldøre);
        this.oktantal = oktanttal;
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString()
    {
        return "Benzinbil" + '\n' +
                "oktantal : " + oktantal + '\n' +
                "kmPrL : " + kmPrL + '\n' +
                "regNr : " + regNr + '\n' +
                "mærke : " + mærke + '\n' +
                "model : " + model + '\n' +
                "årgang : " + årgang + '\n' +
                "Antal døre :" + antaldøre +"";
    }

    //Getters
    public int getOktantal()
    {
        return oktantal;
    }

    public float getKmPrL()
    {
        return kmPrL;
    }

    //Setters
    public void setOktantal(int oktantal)
    {
        this.oktantal = oktantal;
    }

    public void setKmPrL(float kmPrL)
    {
        this.kmPrL = kmPrL;
    }
}
