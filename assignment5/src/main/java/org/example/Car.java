package org.example;

public class Car {

    public int speed;
    public int noOfGear;


    public void drive(int speed, int noOfGear){
        this.speed = speed;
        this.noOfGear = noOfGear;

    }

    public void display(){
        System.out.println("speed = "+this.speed);
        System.out.println("Number of Gears = "+this.noOfGear);
    }

}
