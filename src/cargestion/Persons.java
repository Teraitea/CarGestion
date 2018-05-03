/*c
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargestion;

/** @author tktced */
public class Persons {
    protected String Name;
    protected String Firstname;
    protected int Age;
    protected int nCarLicense;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getnCarLicense() {
        return nCarLicense;
    }

    public void setnCarLicense(int nCarLicense) {
        this.nCarLicense = nCarLicense;
    }

    public Persons(String Name, String Firstname, int Age, int nCarLicense) {
        this.Name = Name;
        this.Firstname = Firstname;
        this.Age = Age;
        this.nCarLicense = nCarLicense;
    }

    public Persons() {
    }
    
    public static void initPerson(String nom, String prenom, int age, int numeroPermis) {
        
    }
    
}