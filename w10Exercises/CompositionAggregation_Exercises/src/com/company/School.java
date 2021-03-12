package com.company;

public class School
{
    Teacher teacher;
    Teacher jesper = new Teacher("Jesper", 29, new Address
            ("Måne Vej", 4, false,
            0,"0",3400,"Danmark"));
    Teacher tess = new Teacher("Tess",31, new Address
            ("Bulldog Vej", 17, true,
            4,"Right",4000,"Danmark"));

    String name = "Cph.Business";
    Semester semester = new Semester("DAT-Forår", jesper, tess);

    School(String name, Semester semester)
    {
        this.name = name;
        this.semester = semester;
    }

}
