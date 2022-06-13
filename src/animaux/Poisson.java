package animaux;

import interfaces.Nager;
import types.Mammifere;

public class Poisson extends Mammifere implements Nager{

	static final int DEFAULT_DUREE_GESTATION = 9;
	
	public Poisson(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emmettreSon() {
		return "Le poisson blopblop !!!";
	}

	@Override
	public void nage() {
		System.out.println("Le poisson nage !!!");
	}

}
