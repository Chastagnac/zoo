package zoo;

import animaux.Animal;
import enclos.Enclo;

/**
 *  Design Pattern : Singleton
 * @author leoch
 *
 */
public final class Employe {
    private String nom;
    private char sexe;
    private int age;
    private static Employe EMPLOYE = new Employe();

    public static Employe getEmploye() {
        return EMPLOYE;
    }

    public Employe initEmployee(String nom, char sexe, int age) {
    	EMPLOYE.setNom(nom);
        EMPLOYE.setSex(sexe);
        EMPLOYE.setAge(age);
        return EMPLOYE;
    }

    private Employe() {}

    /**
     *  Permet d'examiner l'enclo
     * @param enclo
     */
    public void examinerEnclo(Enclo enclo) {
    	enclo.getInfos();
    }

    /**
     * Permet de nettoyer l'enclo
     * @param enclo
     */
    public void nettoyerEnclo(Enclo enclo) {
    	enclo.nettoyer();
        System.out.println(this.nom + " a nettoy� l'enclos " + enclo.getNom());
    }

    /**
     *  Permet de nourrir les animaux
     * @param enclo
     */
    public void nourrirAnimauxEnclo(Enclo enclo) {
    	enclo.nourrirAnimaux();
        System.out.println(this.nom + " a nourri tous les animaux de l'enclos " + enclo.getNom());
    }

    /**
     *  Déplace un animal d'un enclo à l'autre
     * @param animal
     * @param enclosure1
     * @param enclosure2
     */
    public void deplacerAnimalEnclo(Animal animal, Enclo enclosure1, Enclo enclosure2) {
        if(enclosure1.retirerAnimal(animal)) {
            if(enclosure2.ajouterAnimal(animal)) {
                System.out.println(this.nom + " a déplacer l'animal " + animal.getNom() + " de l'enclos " + enclosure1.getNom() + " a l'enclos " + enclosure2.getNom());
            } else {
                enclosure1.ajouterAnimal(animal);
            }
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSex(char sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }
}