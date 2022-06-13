package main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import animaux.Loup;
import animaux.Tigre;
import enclos.Enclo;
import zoo.Employe;
import zoo.Zoo;
import enclos.Enclo;

public class App {
	
	public static void main(String arg[]) {
		System.out.println("------------------ Bienvenue sur l'application Zoo ! ------------------");
		lancerSimulation();
	};
	
	/** Methode permettant de choisir l'employe **/
    private static String choisirEmplpoye(String numEmploye) {
    	 
		if(numEmploye == "1") {
			return "Antoine";
		} else if(numEmploye == "2") {
			return "Thibault";
		} else {
			return "Mathis";
		} 
	}

    /** 
     * Lancement de l'application
     */
    public static void lancerSimulation() {
    	
    	System.out.println("Contexte : Nous allons embauché une personne pour s'occuper d'un loup qui ne se sent pas bien, vous devez le former.");
		
    	// Entrées clavier
		Scanner sc = new Scanner(System.in);
		
		// Création de l'employé
		System.out.println("Choisissez l'employé à embaucher : \n 1 : Antoine \n 2 : Thibault \n 3 : Mathis");
		String numEmploye = sc.nextLine();
		String nomEmplpoye = choisirEmplpoye(numEmploye);
    	Employe employe = Employe.getEmploye().initEmployee(nomEmplpoye, 'm', 39);
    	
    	// Création du Zoo
        Zoo zoo = Zoo.getZoo().initZoo("Zoo de g4", employe, 5);        
        
        // Création de l'enclo des loups
        Enclo<Loup> enclos = new Enclo("Enclo des loups", 100, 10);
        
        // Création de l'enclo des loups malades
        Enclo<Loup> enclosMalade = new Enclo("Enclo des loups malade", 20, 5);
        zoo.addEclos(enclos);
        zoo.addEclos(enclosMalade);
        
        // Création des loups
        Loup loup = new Loup("wolf", 'H', 12, 142, 4, false, false, 100);
        Loup loup2 = new Loup("wolf2", 'H', 12, 142, 4, false, false, 100);
        Loup loup3 = new Loup("wolf3", 'H', 12, 142, 4, false, false, 100);
        Loup loup4 = new Loup("wolf5", 'H', 12, 142, 4, false, false, 100);
        Loup loupMalade = new Loup("wolfMalade", 'H', 12, 142, 4, true, false, 24);
        
        // On ajout les loups dans les enclos
        enclos.ajouterAnimal(loup);
        enclos.ajouterAnimal(loup2);
        enclos.ajouterAnimal(loup3);
        enclos.ajouterAnimal(loup4);
        enclos.ajouterAnimal(loupMalade);
        
    	System.out.println("\nBonjour ! le loup " + loupMalade.getNom() + " ne possède plus que " + loupMalade.getSante() + " / 100 de vie qu'aller vous faire ?");
    	System.out.println("  1 : Le changer d'enclo \n  2 : Le nourir");

    	String choix = sc.nextLine();
    	switch(choix) {
    		case "1":
	    		System.out.println("\n--------- Changement d'enclo en cours ! ---------");
	    		
	    		// Afficher les animaux
	    		enclos.afficherAnimaux();
	    		
	    		// Déplacer loup malade de enclos à enclosMalade
	    		employe.deplacerAnimalEnclo(loupMalade, enclos, enclosMalade);
	    		System.out.println("\nEnclo des animaux malades");	    
	    		
	    		// On réaffiche les animaux
	    		enclosMalade.afficherAnimaux();
	    		break;
    		case "2":
	    		System.out.println("\n Les animaux de l'enclos des malade vas être nourrit");
	    		
	    		// Si le loumalade à faim
	    		if(loupMalade.isaFaim()) {
	    			// On le nourrit
	    			employe.nourrirAnimauxEnclo(enclosMalade);	    			
	    		} else {
	    			System.out.println("\n L'animal n'a pas faim");
	    		};
	    		System.out.println("\n Oh ! L'animal à un petit peu récupérer grace à la nourriture !");
	    		
	    		// Augmentation de la santé du loup malade
	    		loupMalade.setSante(80);
	    		System.out.println(loupMalade.getNom() + " : " + loupMalade.getSante());
	    		break;
    		default :
    		System.out.println("On ne fait rien, le loup est mort. Bravo");
    	}
	}
}
