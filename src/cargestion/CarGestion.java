/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargestion;

/** @author tktced */
import java.util.*;

public class CarGestion {
    // Global
    private static Scanner sc = new Scanner(System.in);
    
    private static int menuMain0Option = -1; // 0-1-2-3-4.
    private static int menuMain1Option = -1; // 0-1-2-3.
    private static int menuMain2Option = -1;
    private static int menuMain3Option = -1;
    
    private static ArrayList<Cars> arrayCar = new ArrayList();
    private static ArrayList<Persons> arrayPerson = new ArrayList();
    
    /** @param args the command line arguments  */
    public static void main(String[] args) {  System.out.println("Welcome !\n");
        
        while(menuMain0Option != 0) {
            showMenuMain0();
            System.out.print("-> Entrer votre option : ");
            menuMain0Option = sc.nextInt();
            switch(menuMain0Option){
                case 0 : menuMain0Option = 0; break;
                case 1 : System.out.println("\t\tOption "+menuMain0Option+" executed!\n");
                
                        showMenuMain1();
                        System.out.print("-> Entrer votre option : ");
                        menuMain1Option = sc.nextInt();
                        String typeVoiture = "";
                        Cars car = null;
                        switch(menuMain1Option){               
                            case 0 : menuMain0Option = -1;
                            case 1 : typeVoiture = "Citadine"; 
                                     optionsMenuGetCar(typeVoiture); 
                                     car = new Citadine();
                                     break;
                            case 2 : typeVoiture = "Berline";  
                                     optionsMenuGetCar(typeVoiture);  
                                     car = new Berline(); 
                                     break;
                            case 3 : typeVoiture = "S.U.V.";
                                     optionsMenuGetCar(typeVoiture);
                                     car = new SUV();
                                     break;
                            default: System.out.println("*** /!\\ Option "+menuMain0Option+" not valid /!\\ ***\n");
                                     break;
                        }
                        
                        int arrLength = arrayCar.size();
                        car.setModel(typeVoiture);
                        
                        System.out.print("-> Entrer l'immatriculation de votre "+typeVoiture+" : ");
                        int serial = sc.nextInt();
                        car.setSerial(serial);
                        
                        System.out.print("-> Entrer le nombre d'emplacement passager de votre "+typeVoiture+" : ");
                        int nbPassenger = sc.nextInt();
                        car.setNbPassenger(nbPassenger);
                        
                        System.out.print("-> Entrer le tarif par jour de la "+typeVoiture+" : ");
                        int fee = sc.nextInt();
                        car.setDailyFee(fee);
                        
                        arrayCar.add(car);
                        int immatriculation = arrayCar.get(arrLength).serial;
                        int nbPlacePass = arrayCar.get(arrLength).nbPassenger;
                        int feePerDay = arrayCar.get(arrLength).dailyFee;
                        
                        System.out.println("\nVotre " + typeVoiture + " à été enregistré dans le registre."
                                         + "\nImmatriculation : " + immatriculation
                                         + "\nNombre d'emplacement passager : " + nbPlacePass
                                         + "\nTarif journalier : " + feePerDay );
                        break;
                        
                case 2 : System.out.println("Option "+menuMain0Option+" executed!\n");
                
                        showMenuMain2();
                        
                        System.out.print("-> Entrer le Nom du client : ");
                        String lastName = sc.nextLine();
                        lastName = sc.nextLine();
                        System.out.println("Nom : " + lastName);
                        
                        System.out.print("-> Entrer le Prénom du client : ");
                        String firstName = sc.nextLine();
                        System.out.println("Prénom : " + firstName);
                        
                        System.out.print("-> Entrer l'age du client : ");
                        int age = sc.nextInt();
                        System.out.println("Age : " + age);
                        
                        System.out.print("-> Entrer le numéro du permis du client : ");
                        int licence = sc.nextInt();
                        
                        System.out.println("N° de permis : " + licence);
                        
                        
                        Persons customer = new Persons(lastName, firstName, age, licence);
                        arrayPerson.add(customer);
                        
                                
                        int arrPersonLength = arrayPerson.size();
                        arrPersonLength--;
                        String nom = arrayPerson.get(arrPersonLength).lastName;
                        String prenom = arrayPerson.get(arrPersonLength).firstName;
                        int lvl = arrayPerson.get(arrPersonLength).age;
                        int permis = arrayPerson.get(arrPersonLength).licence;
                        
                        System.out.println("\n" + nom + " " + prenom + " à été enregistré dans le registre."
                                         + "\nAge : " + lvl
                                         + "\nN° Permis : " + permis);
                        
                        
                        
                
                break;
                case 3 : System.out.println("Option "+menuMain0Option+" executed!\n"); 
                         // Lister Clients
                         System.out.println("**** Liste des Clients ****");
                         for (int i =0; i<arrayPerson.size(); i++) {
                            String Nom = arrayPerson.get(i).getLastName();
                            String Prenom = arrayPerson.get(i).getFirstName();       
                            System.out.println(i + ". " + Nom + " " + Prenom);
                         }
                         System.out.print("Votre choix : ");
                         int customerId = sc.nextInt();
                         System.out.println(customerId + " a été sélectioné");
                
                         break;
                default: System.out.println("*** /!\\ Option "+menuMain0Option+" not valid /!\\ ***\n"); break;
            }
        }
        
   

        
    }// end of main
    
    public static void showVariable(int theVariableToCheck) {
        System.out.println("The current value of the variable is : "+theVariableToCheck);
    }
    
    public static void showMenuMain0() {
        System.out.println("\n***********************************************************"
                         + "\n***                    Menu Principal                   ***"
                         + "\n***********************************************************");
        System.out.println( "\t1. Acquérir voiture"
                        + "\n\t2. Enregistrer nouveau client"
                        + "\n\t3. Louer véhicule"
                        + "\n\t4. Rendre véhicule"
                        + "\n\t0. Quitter" );
    }
    private static void showMenuMain1() {
        System.out.println("\n***********************************************************"
                         + "\n***               Menu Acquérir voiture                 ***"
                         + "\n***********************************************************");
        System.out.println("          -  Sélectionner le type de véhicule  -           ");
        System.out.println(" \t1. Citadine"
                        + "\n\t2. Berline"
                        + "\n\t3. S.U.V."
                        + "\n\t0. Retour" );
    }
    private static void showMenuMain2() {
        System.out.println("\n***********************************************************"
                         + "\n***         Menu Enregistrer un nouveau client          ***"
                         + "\n***********************************************************");
    }
    private static void showMenuMain3() {
        System.out.println("\n***********************************************************"
                         + "\n***               Menu Louer un véhicule                ***"
                         + "\n***********************************************************");
    }
    
    
    private static void optionsMenuGetCar(String typeVoiture) {
        System.out.println("\t\tOption "+menuMain1Option+" selected!\n\t\tmodel type : "+typeVoiture+"\n");
    }
    

    
    
}// end of class
