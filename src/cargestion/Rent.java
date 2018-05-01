/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargestion;

/**
 *
 * @author eleve8
 */
public class Rent  {
    
    protected String client;
    protected String carType;
    protected String car;
    protected int numLocation = Cars.COUNT;

    public Rent() {
    }

    public Rent(String client, String carType, String car) {
        this.client = client;
        this.carType = carType;
        this.car = car;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getNumLocation() {
        return numLocation;
    }

    public void setNumLocation(int numLocation) {
        this.numLocation = numLocation;
    }

    
    
}
