package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ){

        Scanner scan = new Scanner(System.in);

        Car car = new Car();

        Car sportcar = new SportCar();

        System.out.println("enter car speed");
        car.speed = scan.nextInt();

        System.out.println("enter the number of gears for the car");
        car.noOfGear = scan.nextInt();

        System.out.println("enter sport car speed");
        sportcar.speed = scan.nextInt();

        System.out.println("enter the number of gears for the sport car");
        sportcar.noOfGear = scan.nextInt();

        System.out.println("display? 1---> Car    2--->SportCar");
        int choice = scan.nextInt();
        if(choice==1){
            invokeDisplay(car);
        }  else if(choice==2) {
            invokeDisplay(sportcar);
        }else{
            System.out.println("Invalid option");
        }


    }

    public static void  invokeDisplay(Car car){

        car.display();

    }
}
