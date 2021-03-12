package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main(String[] args)
    {
       customers.add(new Customer("Oliver","Rasoli","RazzMaTazz"));
       customers.add(new Customer("Arne","Jensen","MokaiMorten69"));
       customers.add(new Customer("Gunnar", "Henriksen","Numba1Gunna"));
       customers.add(new Customer("Biver","Biversen","hungryRedBird"));
       customers.add(new Customer("Lone","Lisbethsen","KatteDame44"));
       customers.add(new Customer("X-AE-AXII","Musk","RoboKiddo"));

       // printCustomers();
        System.out.println(findCustomer(2));


    }

    public static void printCustomers()
    {
        for (Customer c : customers)
        {
            System.out.println("//////////////////////////////////");
            System.out.println(c.toString());
        }
    }

    public static Customer findCustomer(int id)
    {
        Customer tempCus = new Customer("1","1","1");
        for (int i = 0; i < customers.size(); i++)
        {
            if(customers.get(i).getId() == id)
            {
                tempCus = customers.get(i);
            }
        }
        return tempCus;
    }
}
