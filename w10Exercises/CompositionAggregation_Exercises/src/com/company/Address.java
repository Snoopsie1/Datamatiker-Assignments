package com.company;

public class Address
{
    String streetName;
    int houseNumber;
    boolean apartment = false;
    int floorNumber;
    String floorSide;
    int zipCode;
    String country;

    Address(String streetName, int houseNumber,boolean apartment,
            int floorNumber, String floorSide, int zipCode, String country)
    {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this. apartment = apartment;
        this.floorNumber = floorNumber;
        this.floorSide = floorSide;
        this.zipCode = zipCode;
        this.country = country;
    }

}
