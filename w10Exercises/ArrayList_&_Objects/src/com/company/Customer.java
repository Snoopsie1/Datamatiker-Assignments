package com.company;

public class Customer
{
    private String firstName;
    private String lastName;
    private String userName;
    private static int instanceCounter = 0;
    private int id;

    Customer (String firstName, String lastName, String userName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        id = instanceCounter;
        instanceCounter++;
    }

    @Override
    public String toString()
    {
        return "Customer Details: " +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nUsername: " + userName +
                "\nUser ID: " + id +"";
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getUserName()
    {
        return userName;
    }

    public int getId()
    {
        return id;
    }
}
