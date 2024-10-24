package com.lbg;
import com.lbg.classes.Car;
import com.lbg.classes.Carcolor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");
        Car bartCar = new Car();
        bartCar.setColour(Carcolor.RED);
        bartCar.setModel("BEEP");
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar);
        Car lisaCar = new Car("Blah2");
        bartCar.accelerate();



        Car[] cars = new Car [3];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        cars[2] = new Car();

        for (Car car : cars){
            System.out.println(car);
            System.out.println(car.getColour());
            System.out.println(car.getModel());
        }
    }
}