package animaux;

import interfaces.Voler;
import types.Autre;

public class Aigle extends Autre implements Voler{

	static final int DEFAULT_DUREE_GESTATION = 9;
	static final int DEFAULT_DUREE_INCUBATION = 4;
	
	public Aigle(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante, int dureeGestation) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emmettreSon() {
		System.out.println("L'aigle glatti !!!");
		return null;
	}

	@Override
	public void vole() {
		System.out.println("L'aigle vole !!");	
	}

}
