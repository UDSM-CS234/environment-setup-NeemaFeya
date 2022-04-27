package com.company;

public class Main {

    public static void main(String[] args) {
        double gravity = -9.81;
        double initialVelocity = 0;
        double fallingTime = 10;
        double initialPosition = 0;
        double finalPosition;
        finalPosition = 0.5*gravity*fallingTime*fallingTime+initialVelocity*fallingTime+initialPosition;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}
