package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;

	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", "kg");
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public String decrireProduit() {
		StringBuilder chaine = new StringBuilder();
		chaine.append(getNom() + " de " + poids + " " + unite);
		chaine.append(" chassé par " + chasseur.getNom());
		return chaine.toString();
	}
}
