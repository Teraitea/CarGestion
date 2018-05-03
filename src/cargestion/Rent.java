/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargestion;

/**
 *
 * @author eleve5
 */
public class Rent {

    protected String Client;
    protected String CarType;
    protected int Car;
    protected int Time;
    public static int Location = 0;
    protected int dureeParJourDeLocation;
    protected Cars voiture;
    protected int prixTarif;

    public int getPrixTarif() {
        return prixTarif;
    }

    public void setPrixTarif(int prixTarif) {
        this.prixTarif = prixTarif;
    }

    
    public int getDureeParJourDeLocation() {
        return dureeParJourDeLocation;
    }

    public void setDureeParJourDeLocation(int dureeParJourDeLocation) {
        this.dureeParJourDeLocation = dureeParJourDeLocation;
    }
    
    public String getClient() {
        return Client;
    }

    public void setClient(String Client) {
        this.Client = Client;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String CarType) {
        this.CarType = CarType;
    }

    public int getCar() {
        return Car;
    }

    public void setCar(int Car) {
        this.Car = Car;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public int getLocation() {
        return Location;
    }

    public void setLocation(int Location) {
        this.Location = Location;
    }

    public Cars getVoiture() {
        return voiture;
    }

    public void setVoiture(Cars voiture) {
        this.voiture = voiture;
    }

    public Rent(String Client, String CarType, int Car, int Time, Cars voiture, int dureeParJourDeLocation,int prixTarif) {
        this.Client = Client;
        this.CarType = CarType;
        this.Car = Car;
        this.Time = Time;
        this.voiture = voiture;
        this.dureeParJourDeLocation = dureeParJourDeLocation;
        this.prixTarif = prixTarif;
    }

    public Rent() {
        Location++;
    }

    
   
   
}
