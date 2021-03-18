package com.company;

public class Account
{
    String transactionDate;
    String product;
    double price;
    String paymentType;
    String cardNumber;
    String name;
    String city;
    String state;
    String country;
    String accountCreated;
    String lastLogin;
    String lat;
    String latLong;

    public Account
            (String transactionDate, String product, double price,
             String paymentType, String cardNumber, String name, String city, String state,
             String country, String accountCreated,
             String lastLogin, String lat, String latLong)
    {
        this.transactionDate = transactionDate;
        this.product = product;
        this.price = price;
        this.paymentType = paymentType;
        this.cardNumber = cardNumber;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.accountCreated = accountCreated;
        this.lastLogin = lastLogin;
        this.lat = lat;
        this.latLong = latLong;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public static boolean luhnCheck(String ccNumber)
    {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--)
        {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate)
            {
                n *= 2;
                if (n > 9)
                {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    @Override
    public String toString() {
        return  "----------------------------" + '\n' +
                "Account: " + '\n' +
                "transactionDate : '" + transactionDate + '\n' +
                "- product : '" + product + '\n' +
                "- price : " + price + '\n' +
                "- paymentType : " + paymentType + '\n' +
                "- cardNumber : " + cardNumber + '\n' +
                "- name : " + name + '\n' +
                "- city : " + city + '\n' +
                "- state : " + state + '\n' +
                "- country : " + country + '\n' +
                "- accountCreated : " + accountCreated + '\n' +
                "- lastLogin : " + lastLogin + '\n' +
                "- lat : " + lat + '\n' +
                "- latLong : " + latLong + '\n' +
                "----------------------------";
    }
}
