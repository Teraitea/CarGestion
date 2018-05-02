/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargestion;

/** @author tktced */
public class Persons {
/** Attributes */     
    protected String name;
    protected int balance;
    protected Cars car;

    
    protected String lastName;
    protected String firstName;
    protected int age;
    protected int licence;
    
/** Getters and Setters */     
    public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
    public int getBalance() { return balance; }
        public void setBalance(int balance) { this.balance = balance; }
        
    public Cars getCar() { return car; }
        public void setCar(Cars car) { this.car = car; }
        
    public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }

    public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

    public int getLicence() { return licence; }
        public void setLicence(int licence) { this.licence = licence; }
        
/** Constructors */
    public Persons(){ }
    
    public Persons(String lastName, String firstName, int age, int licence) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.licence = licence;
    }
    
    public Persons(String name, int balance, Cars car) {
        this.name = name;
        this.balance = balance;
        this.car = car;
    }
/** Methods */
    public void crediter(int amount) { this.balance += amount; }
    public void debiter (int amount) { this.balance -= amount; } 
    
    public boolean pay(int amount) {
        if(this.balance >= amount){
            System.out.println("You have "+amount+" to pay");
            debiter(amount);
            return true;
        } else {
            while(this.balance < amount){
                System.out.println("Work slave! You have a due of "+amount);
                work();
            }
            debiter(amount);
            return false;
        }
    }
    public void work(){
        System.out.println("working in progress ...\nalright here your money!");
        crediter(300);
        System.out.println("You now have "+this.balance+" in your account\n");
    }
    
    
    
    
    
    
}
