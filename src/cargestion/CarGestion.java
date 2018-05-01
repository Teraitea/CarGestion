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
import java.util.*;
public class CarGestion {
    
    public static void print(Object o) {
        System.out.println(o);
    }
    // Global
    private static Scanner sc=new Scanner(System.in);
    private static int menuMain0Option = -1; // 0-1-2-3-4.
    private static int menuMain1Option = -1; // 0-1-2-3.
    private static ArrayList<Cars> arrayCar = new ArrayList();
    private static ArrayList<Persons> arrayPerson = new ArrayList();
    
    /** @param args the command line arguments  */
    public static void main(String[] args) {  System.out.println("Welcome !\n");
        
        while(menuMain0Option != 0) {
            
            showMenuMain0();
            System.out.print("-> Entrer votre option : ");
            try {
            menuMain0Option = sc.nextInt();
            } catch (RuntimeException e) {
                sc.next();
            }
//            menuMain0Option = sc.nextInt();
            
            switch(menuMain0Option){
                case 0 : menuMain0Option = 0; break;
                case 1 : System.out.println("\t\tOption "+menuMain0Option+" executed!\n");
                        showMenuMain1();
                        System.out.print("-> Entrer votre option : ");
                        menuMain1Option = sc.nextInt();
                        String typeVoiture = "";
                        Cars car= null;
                        
                                switch(menuMain1Option){               
                                    case 0 : menuMain0Option = -1; 
                                             break;
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
                        
                        int arrCarLength = arrayCar.size();
                        String carId = arrCarLength+"_"+typeVoiture;
                        
                        System.out.print("-> Entrer l'immatriculation de votre "+typeVoiture+" : ");
                        int serial = sc.nextInt();
                        car.setSerial(serial);
                        
                        System.out.print("-> Entrer le nombre d'emplacement passager de votre "+typeVoiture+" : ");
                        int nbPassenger = sc.nextInt();
                        car.setNbPassenger(nbPassenger);
                        
                        System.out.print("-> Entrer le tarif par jour de la "+typeVoiture+" : ");
                        int fee = sc.nextInt();
                        car.setDailyFee(fee);
                        car.setCarType(typeVoiture);
                        arrayCar.add(car);
                        print(Cars.COUNT);
                        int immatriculation = arrayCar.get(arrCarLength).serial;
                        int nbPlacePass = arrayCar.get(arrCarLength).nbPassenger;
                        int feePerDay = arrayCar.get(arrCarLength).dailyFee;
                        String typeCar = arrayCar.get(arrCarLength).carType;
                        
                        System.out.println("\nVotre "+typeCar+" à été enregistré dans le registre."
                                + "\nImmatriculation : "+immatriculation+"\tNombre d'emplacement passager : "+ nbPlacePass+"\tTarif journalier : "+ feePerDay );
                        break;
                        
                case 2 : System.out.println("Option "+menuMain0Option+" executed!\n");
                    showMenuMain2();
                    menuNewVehicle();
                break;
                
                case 3 : System.out.println("Option "+menuMain0Option+" executed!\n");
                    showMenuMain3();
                break;
                
                case 4 : System.out.println("Option "+menuMain0Option+" executed!\n");
                    menuRetrieveVehicle();
                    break;
                default: System.out.println("*** /!\\ L'option l"+menuMain0Option+" n'est pas valide /!\\ ***\n"); break;
            }
        }
    } // end of main
    
    public static void menuRetrieveVehicle() {
        for(int z = 0; z < arrayCar.size(); z++) {
            if(arrayCar.get(z).isAvailable() == false) {
                print("Il y a une " + arrayCar.get(z).carType + " qui a pour immatriculation " + arrayCar.get(z).serial);


            }
        }
        
    }
    
    public static void menuNewVehicle() {
        // déclaration des variables
        
        Persons person= new Persons();
        int arrPersonLength = arrayPerson.size();
        
        // déclaration d'un nouveau client (nom)
        System.out.print("-> Entrer le nom  du client : ");
            sc.nextLine() ;
            String name = sc.nextLine() ;
            person.setName(name);
            
        // déclaration d'un nouveau client (prenom)
        System.out.print("-> Entrer le prenom du client : ");
            String firstname = sc.nextLine();                       
            person.setFirstname(firstname);
            
        // déclaration d'un nouveau client (age)
        System.out.print("-> Entrer l'age du client : ");
            int age = sc.nextInt();
            sc.nextLine() ;
            person.setAge(age);
            
        // déclaration d'un nouveau client (numero permis)
        System.out.print("-> Entrer le numéro de permis du client : ");
            int nCarLicence = sc.nextInt();
            sc.nextLine() ;
            person.setnCarLicense(nCarLicence);
            
        // ajout du client dans le tableau ArrayPerson
        arrayPerson.add(person);
        String nom = arrayPerson.get(arrPersonLength).Name;
        String prenom = arrayPerson.get(arrPersonLength).Firstname;
        int ageClient = arrayPerson.get(arrPersonLength).Age;
        int numeroPermis = arrayPerson.get(arrPersonLength).nCarLicense;
        
        System.out.println("Vous venez d'enregistrer " + nom + " " + prenom + " agé de " + ageClient + " , avec le numéro de permis suivant " + numeroPermis);
    }
    
    public static void showVariable(int theVariableToCheck) {
        System.out.println("The current value of the variable is : "+theVariableToCheck);
    }
    
    public static void showMenuMain0() {
        System.out.println("\n***********************************************************"
                         + "\n***                    Menu Principal                   ***"
                         + "\n***********************************************************");
        System.out.println("\t1. Acquérir voiture\n\t2. Enregistrer nouveau client\n\t3. Louer véhicule\n\t4. Rendre véhicule\n\t0. Quitter");
    }
    
    public static void showMenuMain1() {
        System.out.println("\n*************************************************************"
                                   + "\n*******               Menu Acquérir voiture                *******"
                                   + "\n************************************************************");
        System.out.println("          -  Sélectionner le type de véhicule  -           ");
        System.out.println("\t1. Citadine\n\t2. Berline\n\t3. S.U.V.\n\t0. Retour");
    }
    
    public static void showMenuMain2() {
        System.out.println("\n***********************************************************"
                         + "\n***         Menu Enregistrer un nouveau client          ***"
                         + "\n***********************************************************");
    }
    public static void showMenuMain3() {
        System.out.println("\n***********************************************************"
                         + "\n***               Menu Louer un véhicule                ***"
                         + "\n***********************************************************");
    }
    
    
    public static void optionsMenuGetCar(String typeVoiture) {
        System.out.println("\t\tOption "+menuMain1Option+" selected!\n\t\tmodel type : "+typeVoiture+"\n");
    }
    
}// end of class
