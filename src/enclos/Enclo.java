package enclos;

import animaux.Animal;

import java.util.ArrayList;

public class Enclo <T> {
    private String nom;
    private int superficie;
    private int maxAnimal; // nombre maximums d'animaux
    private int nbAnimal; // nombre d'animaux en temps réel
    private ArrayList<T> animaux;
    private int degretProprete; // 3 = propre / 2 = état moyen / 1 = sale

    public Enclo(String nom, int superficie, int maxAnimal) {
        this.nom = nom;
        this.superficie = superficie;
        this.maxAnimal = maxAnimal;
        this.nbAnimal = 0;
        this.animaux = new ArrayList<T>();
        this.degretProprete = 1;
    }
    
    
    /** Récupère les infos de l'enclo
     * 
     */
    public void getInfos() {
        System.out.println("Enclos : "+ this.nom);
        System.out.println("Superficie " + this.superficie);
        System.out.println("Nombre max d'animaux : " + this.maxAnimal);
        System.out.println("Nombre actuels d'animaux : " + this.nbAnimal);
        System.out.println("Niveau de propreté : " + this.degretProprete + "/3");
        for(T animal : animaux) {
            System.out.println(animal); // TODO: permettre de voir le type d'animal (Wolf, Tiger etc...)
        }
    }

    /** 
     * Permet d'ajouter un animal
     */
    public boolean ajouterAnimal(T animal) {
        if(this.nbAnimal + 1 <= this.maxAnimal) {
            if(!this.animaux.contains(animal)) {
                this.animaux.add(animal);
                ++this.nbAnimal;
                System.out.println(((Animal) animal).getNom() + " a été ajouté à l'enclos " + this.nom + " ("+ this.nbAnimal +"/"+ this.maxAnimal +")");
            } else {
                System.out.println(((Animal) animal).getNom() + " est déjà dans l'enclos " + this.nom);
                return false;
            }
        } else {
            System.out.println("Nombre maximal d'animaux atteint pour l'enclos " + this.nom + " !");
            return false;
        }
        return true;
    }

    /** 
     * Permet de retirer un animal d'un enclo
     */
    public boolean retirerAnimal(T animal) {
        if(this.animaux.contains(animal)) {
            this.animaux.remove(animal);
            --this.nbAnimal;
           System.out.println(((Animal) animal).getNom() + " a été enlevé à l'enclos " + this.nom);
        } else {
            System.out.println("L'animal n'est pas dans l'enclos " + this.nom);
            return false;
        }
        return true;
    }

    /** 
     * Permet de nourir tous les animaux
     */
    public void nourrirAnimaux() {
        for(T animal : animaux) {
            ((Animal) animal).manger();
        }
        System.out.println("Tous les animaux de l'enclos " + this.nom + " ont été nourris");
    }

    /** 
     * Permet de nettoyer l'enclos
     */
    public void nettoyer() {
        this.degretProprete = 1;
        System.out.println("L'enclos " + this.nom + " est maintenant propre");
    }

    /** 
     * Permet d'afficher tous les animaux
     */
    public void afficherAnimaux() {
    	System.out.println("Voici les animaux de l\'enclo : ");
        for(T animal : animaux) {
            System.out.println(((Animal) animal).getNom());
        }
    }

    public String getNom() {
        return nom;
    }

    public int getNbAnimal() {
        return nbAnimal;
    }

    public ArrayList<T> getAnimaux() {
        return animaux;
    }
}