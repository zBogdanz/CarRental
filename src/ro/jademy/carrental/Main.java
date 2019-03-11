package ro.jademy.carrental;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.dacia.Duster;
import ro.jademy.carrental.car.dacia.Logan;
import ro.jademy.carrental.car.volkswagen.Golf;
import ro.jademy.carrental.car.volkswagen.Passat;
import ro.jademy.carrental.shop.Salesman;
import ro.jademy.carrental.shop.Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?
        ArrayList<Car> cars = new ArrayList<> ();
        cars.add (new Logan (2012, FuelType.DIESEL , "black",
                new Engine (2000, 150, 5), 50));

        cars.add (new Duster (2015,FuelType.DIESEL, "red",60));

        cars.add (new Logan (2010,FuelType.GASOLINE, "black",
                new Engine (2000, 150, 5), 45));
        cars.add (new Golf (2015,"black",new Engine (1600,110,4),35));
        cars.add (new Passat (2018,FuelType.DIESEL,"blue",new Engine (2000,170,6),55));
        ArrayList<Salesman> salesmans = new ArrayList<> ();
        salesmans.add (new Salesman ("Bogdan", "carpass"));
        salesmans.add (new Salesman ("Andrei", "parola"));
        //cars.get (0).setAvailable (false);
        //cars.get (3).setAvailable (false);

        Shop shop = new Shop (cars, salesmans);

        //FuelType t = FuelType.DIESEL;
        //System.out.println (t.getName ());
       // FuelType[] vals = FuelType.values (); //ne va baga in lista toate valorile din FuelType

        //System.out.println (cars.get (2));

        boolean exit = true;
        do {
            boolean logout = true;
            credentiale (shop);
            do {
                shop.showMenu ();
                Scanner scan = new Scanner (System.in);
                int val = scan.nextInt ();
                switch (val) {
                    case 1:
                        int i = 0;
                        do {
                            shop.showListMenuOptions ();
                            i = scan.nextInt ();
                            switch(i) {
                                case 1:
                                    System.out.println ("Introduceti marca dorita");
                                    String marca = scan.next ();
                                    System.out.println ("Avem urmatoarele masini de tipul "+marca);
                                    shop.listCarsMake (marca);
                                    break;
                                case 2:
                                    System.out.println ("Introduceti modelul dorit");
                                    String model = scan.next ();
                                    System.out.println ("Avem urmatoarele masini de tipul "+model);
                                    shop.listCarsModel(model);
                                    break;
                                case 3:
                                    System.out.println ("Introduceti bugetul maxim ");
                                    int buget = scan.nextInt ();
                                    System.out.println ("Avem urmatoarele masini ");
                                    shop.listCarsBudget (buget);
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    System.out.println ("Avem urmatoarele masini ");
                                    shop.listAllCars ();
                                    break;
                            }
                        } while(i!=4);
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
                        shop.dailyIncome ();
                        break;
                    case 5:
                        System.out.println ("Avem urmatoarele masini disponibile ");
                        shop.listAvailableCars ();
                        System.out.println ("Alegeti indexul masinii pe care doriti sa o inchiriati ");
                        int ind = scan.nextInt ();
                        shop.rentCar (ind-1);
                        System.out.println ("Felicitari, ati inchiriat masina "+cars.get (ind-1).getMake ()+" "
                                             +cars.get (ind-1).getModel ()+" pentru suma de "+
                                              cars.get (ind-1).getBasePrice ()+" EUR pe zi");
                        break;
                    case 6:
                        logout = false;
                        break;
                    case 7:
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
                test = true;
            } else {
                test = false;
                System.out.println ("Nume sau parola gresite");
            }
        } while (test == false);
    }

}

