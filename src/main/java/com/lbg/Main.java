package com.lbg;
import com.lbg.classes.Car;
import com.lbg.classes.Carcolor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");
        Car bartCar = new Car();
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar);
        bartCar.setMake("Vaxhaul");
        bartCar.setModel("Corsa");
        bartCar.setColour(Carcolor.RED);
        System.out.println(bartCar.getMake());
        System.out.println(bartCar.getModel());
        System.out.println(bartCar.getColour());

        System.out.println(bartCar.getSpeed());
        bartCar.accelerate(60);
        System.out.println(bartCar.getSpeed());
        bartCar.decelerate(30);
        System.out.println(bartCar.getSpeed());

        Car lisaCar = new Car("Ford");
        lisaCar.accelerate(312);
        System.out.println(lisaCar.getSpeed());

        Car[] cars = new Car[3];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        cars[2] = new Car();

        for (Car car : cars) {
            System.out.println(car);
            System.out.println(car.getColour());
            System.out.println(car.getModel());
        }
    }
}