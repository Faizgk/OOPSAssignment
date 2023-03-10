package org.example;

public class SportCar extends Car{

    int initialSpeed = 0;
    int gearStatus = 1;
    public void AirBallonType(){
        System.out.println("Initial Speed = "+initialSpeed);
        System.out.println("Gear Status : "+gearStatus);
    }


    @Override
    public void display(){
        super.display();
        System.out.println("Initial Speed = "+initialSpeed);
        System.out.println("Gear Status : "+gearStatus);

    }
}
