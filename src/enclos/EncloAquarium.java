package enclos;

import animaux.Animal;
import interfaces.Nager;

/** 
 * 
 * @author leoch
 * Enclo aquarium qui hérite de la class enclo : uniquement avec l'interface nager 
 * @param <T>
 */
public class EncloAquarium <T extends Nager> extends Enclo {
    private int depth;
    private int cleanlinessWater; // 1 = propre / 2 = état moyen / 3 = sale

    
    public EncloAquarium(String name, int area, int maxAnimal, int depth) {
        super(name, area, maxAnimal);
        this.depth = depth;
        this.cleanlinessWater = 1;
    }
}