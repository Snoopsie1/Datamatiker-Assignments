package com.company;

public class Main {

    Account[] myAccounts = new Account[3];
    public static void main(String[] args)
    {
        Account GouyaAccount = new Account
                ("1/3/09 14:44","Product1",1200,
                        "Visa","4593781145107322","Gouya",
                        "Echuca","Victoria","Australia","9/25/05 21:13",
                        "1/3/09 14:22","-36.1333333","144.75");

        Account JanetAccount = new Account
                ("1/5/09 11:37","Product1",1200,
                "Visa","4234120954489197","Janet",
                        "Ottawa","Ontario","Canada","1/5/09 9:35",
                        "1/5/09 19:24","45.4166667","-75.7");

        Account JamesAccount = new Account
                ("1/5/09 20:00","Product2",3600,
                "Visa","4904344348439820","James",
                "Burpengary","Queensland","Australia","12/10/08 19:53",
                "1/8/09 17:58","-27.1666667","152.95");

        Account MehmetAccount = new Account
                ("1/3/09 13:24","Product1",1200,
                "Visa","4737470823565213","Mehmet Fatih",
                "Helsingor","Frederiksborg","Denmark","1/3/09 12:47",
                "1/9/09 11:14","56.0333333","12.6166667");

        System.out.println("Is Gouya's account number eligible?");
        System.out.println(GouyaAccount.luhnCheck(GouyaAccount.cardNumber));
        System.out.println("Is Janet's account number eligible?");
        System.out.println(JanetAccount.luhnCheck(JanetAccount.cardNumber));
        System.out.println("Is James' account number eligible?");
        System.out.println(JamesAccount.luhnCheck(JamesAccount.cardNumber));
        System.out.println("Is Mehmet's account number eligible?");
        System.out.println(MehmetAccount.luhnCheck(MehmetAccount.cardNumber));

        System.out.println(MehmetAccount.toString());
    }

}
