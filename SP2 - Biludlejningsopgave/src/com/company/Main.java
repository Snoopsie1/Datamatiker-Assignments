package com.company;

public class Main {

    public static void main(String[] args)
    {
        Garage srGarage = new Garage("Slick Rick");

        Bil roxanne = new Benzinbil("AD42695", "Toyota","MR2",
                1986,3, 100, 13.5f);
        Bil jeeves = new Elbil("YV77742", "Tesla", "Model S",
                2020, 5, 85, 646.95f, 200);
        Bil clyde = new Dieselbil("WH44447", "Jeep", "Wrangler",
                2020, 5, true, 6.6f);

        srGarage.tilføjBil(roxanne);
        srGarage.tilføjBil(jeeves);
        srGarage.tilføjBil(clyde);

        System.out.println(srGarage.toString());

        srGarage.beregnGrønAfgiftForBilPark();
    }
}
