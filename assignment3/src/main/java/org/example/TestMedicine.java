package org.example;


import java.util.Random;

public class TestMedicine
{
    public static void main( String[] args )
    {

        Medicine[] medicines = new Medicine[10];


        Random random = new Random();

        int randomInt = random.nextInt(3) + 1;

        switch (randomInt){

            case 1: new Tablet().displayLabel();
            break;
            case 2: new Syrup().displayLabel();
            break;
            case 3: new Ointment().displayLabel();
            break;

            default: System.out.println("something went wrong");
        }

    }
}
