package zoo;

import animaux.Animal;
import zoo.Employe;

import java.util.ArrayList;
import enclos.Enclo;


/**
 *  Classe zoo ttern : Singleton
 * @author leoch
 *
 */
public final class Zoo {
    private String nom;
    private Employe employe;
    private int maxEnclo;
    private ArrayList<Enclo> enclos;
    private static Zoo ZOO = new Zoo();

    public static Zoo getZoo() {
        return ZOO;
    }

    /**
     *  Constructeur
     * @param nom
     * @param employee
     * @param maxEnclosure
     * @return
     */
    public Zoo initZoo(String nom, Employe employee, int maxEnclosure) {
        ZOO.setName(nom);
        ZOO.setEmploye(employe);
        ZOO.setMaxEnclo(maxEnclosure);
        ZOO.setEnclos(new ArrayList<Enclo>());
        return ZOO;
    }

    private Zoo() { }

    
    /**
     *  Ajoute un enclo
     * @param enclosure
     */
    public void addEclos(Enclo enclosure) {
        this.enclos.add(enclosure);
        System.out.println("L'enclos " + enclosure.getNom() + " a été ajouté au Zoo " + this.nom);
    }

    /**
     *  Affiche le nb d'animaux
     */
    public void afficherNbAnimaux() {
        int nbAnimals = 0;
        for(Enclo enclo : this.enclos) {
            nbAnimals += enclo.getNbAnimal();
        }
        System.out.println("Le zoo " + this.nom + " a " + nbAnimals + " animaux");
    }

    /**
     *  Affiche tous les animaux du zoo
     */
    public void afficherAnimaux() {
        System.out.println("=== Tous les animaux du zoo " + this.nom + " ===");
        for(Enclo enclo : this.enclos) {
            System.out.println("Animaux de l'enclos " +  enclo.getNom() +  " : " + enclo.getAnimaux());
        }
    }

    public void setName(String nom) {
        this.nom = nom;
    }

    public void setMaxEnclo(int maxEnclo) {
        this.maxEnclo = maxEnclo;
    }

    public void setEnclos(ArrayList<Enclo> enclos) {
        this.enclos = enclos;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}