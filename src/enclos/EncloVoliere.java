package enclos;

import interfaces.Voler;

/** 
 * Enclo volière qui hérite de la class enclo : uniquement avec l'interface Voler 
**/
public class EncloVoliere <T extends Voler> extends Enclo {
	
    private int hauteur;


    public EncloVoliere(String name, int area, int maxAnimal, int hauteur) {
        super(name, area, maxAnimal);
        this.hauteur = hauteur;
    }
}
