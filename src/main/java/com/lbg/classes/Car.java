package com.lbg.classes;

public class Car {
    private int speed;
    private String make;
    private Carcolor colour;
    private String model;


    public Car(String model) {
        this.setModel(model);
    }

    public Car(){
        this.make = "Unknown";
        this.model = "Unknown";
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getMake() {
        return this.make;
    }

    public Carcolor getColour() {
        return this.colour;
    }

    public void setColour(Carcolor colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String model) {this.make = model; }

    public void accelerate(int deltaV) {
        if (deltaV > 0) {
            this.speed += deltaV;
        }
    }
        public void decelerate(int deltaV){
            if (deltaV > 0) {
                this.speed += deltaV;
            }
        }
    }
