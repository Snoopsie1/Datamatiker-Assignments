package com.company;


import java.util.ArrayList;

public class Dog
{
    String name;
    String owner;
    boolean isHungry;
    boolean isNeutered;
    ArrayList<String> offSpring = new ArrayList<String>();

    Dog (String name, boolean isHungry, boolean isNeutered)
    {
        this.name = name;
        this.isHungry = isHungry;
        this.isNeutered = isNeutered;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getOwner()
    {
        return owner;
    }

    public String feedDog()
    {
        String msg = "";
        if (isHungry)
        {
            msg = name+" is now fed";
            isHungry = false;
            return msg;
        }
        else
        {
            msg = name+" is still hungry";
            isHungry = true;
            return msg;
        }
    }

    public void setOffSpring(String offSpringName)
    {
       offSpring.add(offSpringName);
    }

    public String getOffSpring()
    {
        for (int i = 0; i < offSpring.size(); i++)
        {
            return offSpring.get(i);
        }

        return null;
    }
}
