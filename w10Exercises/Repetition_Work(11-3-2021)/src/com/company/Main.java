package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static Scanner sc = new Scanner (System.in);
    public static int[] numbers = {31,22,91,200,66,20,41,10};
    public static int[] compare1 = {4,19,8,43,19,12};
    public static int[] compare2 = {5,20,9,44,20,13};

    public static void main(String[] args)
    {


//        System.out.println(min(-1, 8, -9));
//        System.out.println(mathMin(8, 41, 91));
//        printEvenNumbers(24);
//        System.out.println(smallestAbsVal(-8, 9, -12));
//        System.out.println(sumDigits(124));
//        reverseVertical("laptop");
//        processName(sc);
//        System.out.println(repeat("Banana"));
//        shortestName(sc, 4);
//        randomNumbers();
//        maxMin();
//        printMultiple(5);
//        System.out.println(biggestInt(numbers));
        System.out.println(allLess(compare1, compare2));
    }
    // Task 1. My 'if' method.
    public static int min (int num1, int num2, int num3)
    {
        System.out.println("-------------------- Task 1 --------------------");
        int smallestNumber = 0;
        if (num1 <= num2 && num1<= num3)
        {
            smallestNumber = num1;
        }
        else if (num2 <= num1 && num2 <= num3)
        {
            smallestNumber = num2;
        }
        else
        {
            smallestNumber = num3;
        }

        return smallestNumber;
    }
    // Task 1. same method, but using Math.Min instead of If-Loops
    public static int mathMin (int num1, int num2, int num3)
    {
        System.out.println("-------------------- Task 1.2 --------------------");
        int smallestNumber;

        smallestNumber = Math.min(num1, Math.min(num2,num3));

        return smallestNumber;
    }
    // Task 2.
    public static void printEvenNumbers(int max)
    {
        System.out.println("-------------------- Task 2 --------------------");
        for (int i = 2; i <= max; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print("{"+i+"}");
            }
        }
        System.out.println("");

    }
    // Task 3.
    public static int smallestAbsVal(int num1, int num2, int num3)
    {
        System.out.println("-------------------- Task 3 --------------------");
        int smallestNumber;

        smallestNumber = Math.abs(Math.min(num1, Math.abs(Math.min(num2,num3))));

        return smallestNumber;
    }
    // Task 4.
    public static int sumDigits(int digit)
    {
        System.out.println("-------------------- Task 4 --------------------");
        int digitSum = 0;
        int newDigit = 0;

        while (digit > 0)
        {
            newDigit = digit % 10;
            digitSum = digitSum + newDigit;
            digit = digit / 10;
        }
        return digitSum;
    }
    // Task 5.
    public static void reverseVertical(String word)
    {
        System.out.println("-------------------- Task 5 --------------------");
        for (int i = word.length() - 1; i >= 0; i--)
        {
            System.out.print(word.charAt(i)+"\n");
        }
    }
    // Task 6.
    public static void processName (Scanner sc)
    {
        System.out.println("-------------------- Task 6 --------------------");
        System.out.println("Please enter your name :");
        String name = sc.nextLine();
        System.out.println("I will now shout your name at you");
        System.out.println(name.toUpperCase());
    }
    // Task 7.
    public static String repeat (String word)
    {
        System.out.println("-------------------- Task 7 --------------------");
        String newWord = "";
        for (int i = 0; i <= word.length(); i++)
        {
            newWord += word;
        }
        return newWord;
    }
    // Task 8.
    public static void shortestName(Scanner sc, int n)
    {
        System.out.println("-------------------- Task 8 --------------------");
        ArrayList<String> names = new ArrayList<String>();
        // Input loop
        for (int i = 1; i <= n; i++)
        {
            System.out.println("Name"+i+"#?");
            names.add(sc.nextLine());
        }
        // Shortest word checker.
        String shortest = names.get(0);

        for(String str : names)
        {
            if (str.length() < shortest.length())
            {
                shortest = str;
            }
        }
        System.out.println("The shortest name is: " + shortest);
    }
    // Task 9.
    public static void randomNumbers()
    {
        System.out.println("-------------------- Task 9 --------------------");
        int number = 0;
        Random random = new Random();

        do {
            number = random.nextInt(1000);
            System.out.println(number);
        } while(number < 900);
    }
    // Task 10.
    public static void maxMin()
    {
        System.out.println("-------------------- Task 10 --------------------");
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (!numbers.contains(-1))
        {
            System.out.println("Write a number (or -1 to exit)");
            numbers.add(sc.nextInt());
        }

        //Removing the -1 value from the numbers array.
        if (numbers.contains(-1))
        {
            numbers.remove(Integer.valueOf(-1));
        }

        // Smallest number checker.
        int smallest = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++)
        {
            if (numbers.get(i) < smallest)
            {
                smallest = numbers.get(i);
            }
        }

        // Biggest number checker.
        int biggest = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++)
        {
            if (numbers.get(i) > biggest)
            {
                biggest = numbers.get(i);
            }
        }
        System.out.println("The biggest number was: "+biggest);
        System.out.println("The smallest number was: "+smallest);
    }

    // Task 11.
    public static void printMultiple(int para)
    {
        System.out.println("-------------------- Task 11 --------------------");
        int n = para;
        for(int i = 1; i <= 9; i++)
        {
            System.out.print(para*i+" and ");
        }
        System.out.print((para*10));
    }

    // Task 12
    public static int biggestInt(int[] number)
    {
        System.out.println("-------------------- Task 12 --------------------");
        int biggestNumber = 0;

        for (int i = 0; i <= number.length; i++)
        {
            if (numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
            }
        }
        return biggestNumber;
    }

    // Task 13
    public static boolean allLess (int[] num1, int[] num2)
    {
        boolean isLess = false;
        if (num1.length == num2.length)
        {
            for (int i = 0; i < num1.length; i++)
            {
                if (num1[i] < num2[i])
                {
                    isLess = true;
                }
            }
        }
        else
        {
            isLess = false;
        }
        return isLess;
    }
}
