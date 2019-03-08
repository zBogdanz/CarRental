package ro.jademy.carrental;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.dacia.Duster;
import ro.jademy.carrental.car.dacia.Logan;
import ro.jademy.carrental.shop.Salesman;
import ro.jademy.carrental.shop.Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?
        ArrayList<Car> cars = new ArrayList<> ();
        cars.add (new Logan (2012, new FuelType ("diesel"), "black",
                new Engine (2000, 150, 5), 50));

        cars.add (new Duster (2015, new FuelType ("diesel"), "red",
                new TransmissionType ("automata"),60));

        cars.add (new Logan (2010, new FuelType ("diesel"), "black",
                new Engine (2000, 150, 5), 45));

        ArrayList<Salesman> salesmans = new ArrayList<> ();
        salesmans.add (new Salesman ("Bogdan", "carpass"));
        salesmans.add (new Salesman ("Andrei", "parola"));
        cars.get (0).setAvailable (false);

        Shop shop = new Shop (cars, salesmans);


        //System.out.println (cars.get (2));

        boolean exit = true;
        do {
            boolean logout = true;
            credentiale (shop);
            do {

                Scanner scan = new Scanner (System.in);
                int val = scan.nextInt ();
                switch (val) {
                    case 1:
                        System.out.println ("Avem urmatoarele masini ");
                        shop.listAllCars ();
                        break;
                    case 2:
                        System.out.println ("Urmatoarele masini sunt disponibile ");
                        shop.listAvailableCars();
                        break;
                    case 3:
                        System.out.println ("Urmatoarele masini sunt inchiriate ");
                        shop.listRentedCars();
                        break;
                    case 4:
                        System.out.println ("Venitul pe ziua curenta este " + shop.dailyIncome +" Eur");
                        break;
                    case 5:
                        logout = false;
                        break;
                    case 6:
                        logout = false;
                        exit = false;
                        break;
                }
            } while (logout);
        } while (exit);
    }





    public static void credentiale(Shop shop) {
        boolean test;
        do {
            System.out.println ("Introduceti credentiale:");
            System.out.println ("Nume ");
            Scanner scan = new Scanner (System.in);
            String nume = scan.next ();
            System.out.println ("Parola");
            String pass = scan.next ();
            if (shop.login (nume, pass)) {
                shop.showMenu ();
                test = true;
            } else {
                test = false;
                System.out.println ("Nume sau parola gresite");
            }
        } while (test == false);
    }

}

