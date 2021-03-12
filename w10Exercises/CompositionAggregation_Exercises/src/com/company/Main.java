package com.company;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Teacher jesper = new Teacher("Jesper", 29, new Address
                ("Måne Vej", 4, false,
                        0,"0",3400,"Danmark"));

        Teacher tess = new Teacher("Tess",31, new Address
                ("Bulldog Vej", 17, true,
                        4,"Right",4000,"Denmark"));

        Semester firstSemester = new Semester("First Semester DAT Spring", jesper, tess);


        firstSemester.studentlist.add(new Student(
                "Jarl", 22, new Address("JarlVej",4,
                false, 0,"0", 3800,"Denmark")));
        firstSemester.studentlist.add(new Student(
                "Børge",89, new Address("BørgeVej",420,
                true, 88, "Right", 9900,"Dubai")));
        firstSemester.studentlist.add(new Student(
                "Katrine",42, new Address("JarlVej",5,
                false, 0, "0", 3800,"Denmark")));

	    School school = new School("cph.business", firstSemester);
        for (Student s : firstSemester.studentlist)
        {
            System.out.println("Student name: "+s.name);
            System.out.println("Student age: "+s.age);
            System.out.println("Student address: "+s.address.streetName+" "+s.address.houseNumber);
            System.out.println("-----------------------------------");
        }


    }
}
