/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargestion;

/**
 *
 * @author tktced
 */
public class Cars {

    static boolean isAvailable;
/** Attributes */    
    protected int serial;
    protected int fuelCapacity;
    protected String color;
    protected int numberOfWheel;
    protected int numberOfDoor;
    protected int horsePower;
    protected int price;
    protected boolean available;
    protected int dailyFee;
    protected int timesRented;
    protected int nbPassenger;
    protected int kilometrage;
    protected String model;
    public static int COUNT = 0;
    protected String carType;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


    
    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(int dailyFee) {
        this.dailyFee = dailyFee;
    }

    public int getTimesRented() {
        return timesRented;
    }

    public void setTimesRented(int timesRented) {
        this.timesRented = timesRented;
    }

    public int getNbPassenger() {
        return nbPassenger;
    }

    public void setNbPassenger(int nbPassenger) {
        this.nbPassenger = nbPassenger;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Cars() {
        COUNT++;
    }
    
    public Cars(int serial, int fuelCapacity, String color, int numberOfWheel, int numberOfDoor, int horsePower, int price, boolean available, int dailyFee, int timesRented, int nbPassenger, int kilometrage, String model) {
        this();
        this.serial = serial;
        this.fuelCapacity = fuelCapacity;
        this.color = color;
        this.numberOfWheel = numberOfWheel;
        this.numberOfDoor = numberOfDoor;
        this.horsePower = horsePower;
        this.price = price;
        this.available = available;
        this.dailyFee = dailyFee;
        this.timesRented = timesRented;
        this.nbPassenger = nbPassenger;
        this.kilometrage = kilometrage;
        this.model = model;
    }


/** Methods */
    public void horn() {
        
    }
    
    public void run() {
        this.fuelCapacity -= 5;
    }
}
