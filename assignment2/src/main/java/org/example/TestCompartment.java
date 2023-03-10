package org.example;

import java.lang.instrument.Instrumentation;
import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {

        Random random = new Random();

        Compartment[] compartments = new Compartment[10];

        int randomInt = random.nextInt(4)+1;



        switch(randomInt){

            case 1 :  new FirstClass().notice();
            break;
            case 2 :  new Ladies().notice();
            break;
            case 3 :  new Luggage().notice();
            break;
            case 4 :  new General().notice();
            break;

            default:
                System.out.println("Something went wrong");
        }

    }
}
