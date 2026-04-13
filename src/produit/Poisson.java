package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String nom, String unite, String date) {
		super(nom, unite);
		this.nom = "poisson";
		this.unite = "piece";
		this.date = date;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String decrireProduit();
}
