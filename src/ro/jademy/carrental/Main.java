package ro.jademy.carrental;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?
        ArrayList<Car> cars = new ArrayList<> ();
        cars.add(new Car("Bmw","3series",2012,new CarType ("sedan"),new FuelType ("diesel"),
                4,"black", new TransmissionType ("automatic"),
                 new Engine (2000,150,5),50));
        cars.add(new Car("Mercedes","Vito",2014,new CarType ("van"),new FuelType ("diesel"),
                4,"blue", new TransmissionType ("manual"),
                new Engine (2400,180,8),90));
        cars.add(new Car("Volkswagen","Golf",2014,new CarType ("hatchback"),new FuelType ("electric"),
                4,"white", new TransmissionType ("automatic"),
                new Engine (2400,180,8),90));

        System.out.println (cars.get (2));


        System.out.println ("Introduceti credentiale:");
        System.out.println ("Nume ");
        Scanner scan = new Scanner (System.in);
        String name = scan.next ();
        System.out.println ("Parola");
        String pass = scan.next ();
        Shop start = new Shop ();
        if (start.login (name,pass)) {
            start.showMenu ();
        }else {
            System.out.println ("Nume sau parola gresite");
        }
        }
    }

