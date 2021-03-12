package com.company;

import java.util.ArrayList;

public class Semester
{
    String name;
    Address address;
    Teacher teacher1;
    Teacher teacher2;
    ArrayList<Student> studentlist = new ArrayList<>();

    Semester (String name, Teacher teacher1, Teacher teacher2)
    {
        this.name = name;
        this.teacher1 = teacher1;
        this.teacher2 = teacher2;
    }



}
