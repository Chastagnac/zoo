package animaux;

import interfaces.Nager;
import interfaces.Vagabonder;
import interfaces.Voler;
import types.Autre;

public class Pingouin extends Autre implements Nager, Vagabonder, Voler{

	static final int DEFAULT_DUREE_GESTATION = 9;
	static final int DEFAULT_DUREE_INCUBATION = 4;
	
	public Pingouin(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emmettreSon() {
		return "Le pingouin braille !!!";
	}

	@Override
	public void vagabonde() {
		System.out.println("Le pingouin vagabone !!!");
	}

	@Override
	public void nage() {
		System.out.println("Le pingouin Nage aussi !!!");
	}

	@Override
	public void vole() {
		System.out.println("Le pingouin vole également, mais quel homme !!!");
	}

}
