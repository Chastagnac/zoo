package animaux;

import interfaces.Nager;
import types.Mammifere;

public class Baleine extends Mammifere implements Nager{

	static final int DEFAULT_DUREE_GESTATION = 9;
	
	public Baleine(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emmettreSon() {
		return "La baleine chante !!!";
	}

	@Override
	public void nage() {
		System.out.println("La baleine nage !!!");
	}

}
