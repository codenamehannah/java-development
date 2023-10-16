package com.pluralsight;

public class Car {
    private String color;
    private String make;
    private int year;

    private String model;
    private double odometer;
    private int speed;

    //the private is an attribute.
    // no one outside  will be able to access this.

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int Car(String colorFromTheUser, int yearFromTheUser,
                   String makeFromTheYear, String modelFromTheUser,
                   double odometerFromTheUser){
        this.color = colorFromTheUser;
        this.year = yearFromTheUser;
        this.make = makeFromTheYear;
        this.model = modelFromTheUser;
        this.odometer = odometerFromTheUser;
        this.speed = 0;




        //gonna use this by going to our main method. ->

        //to make private stuff retrievalble
        //create a method to get the color without breaking the encapsulation

public int getSpeed() {
    return speed;
        }
        public void accelerate(int extraSpeed){
    this.speed += extraSpeed;

    public void brake(int minusSpeed);
    this.speed -= minusSpeed;

    if(this.speed - minusSpeed >0){
        }
    }//Generate getters by right clicking or Alt plus Insert
}
