package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String date) {
		super("poisson", "piece");
		this.date = date;
	}


	@Override
	public String decrireProduit() {
		StringBuilder chaine = new StringBuilder();
		chaine.append(getNom() + " pêchés " + date);
		return chaine.toString();
	}
}
