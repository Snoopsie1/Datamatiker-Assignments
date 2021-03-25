package com.company;

import java.util.ArrayList;

public class Garage
{
    ArrayList<Bil> garage = new ArrayList<Bil>();
    String owner;

    Garage (String owner)
    {
        this.owner = owner;
    }

    public String getOwner()
    {
        return owner;
    }

    public void tilføjBil(Bil bil)
    {
        garage.add(bil);
    }

    @Override
    public String toString()
    {
        System.out.println("Her er alle bilerne i "+ getOwner() + "'s garage: ");

        for (int i = 0; i < garage.size(); i++)
        {
            System.out.println(garage.get(i).mærke + " - " + garage.get(i).model + " - " + garage.get(i).årgang);
        }
        return "";
    }

    public void beregnGrønAfgiftForBilPark()
    {
        double regningSum = 0;

        for (int i = 0; i < garage.size(); i++)
        {
            regningSum += garage.get(i).beregnGrønEjerafgift
                    (garage.get(i));
        }

        System.out.println("/ / / / / / / / / / / / / / / / / / / /");
        System.out.println("Samlede Grøn Ejerafgift beløb for alle dine biler : " + regningSum + "kr.");
    }
}
