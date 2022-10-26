package personnages;

public class Humain {
	private String nom;
	private String BoissonFav;
	private int argent;

	public Humain(String nom, String BoissonFav, int argent) {
		this.nom = nom;
		this.BoissonFav = BoissonFav;
		this.argent = argent;
	}

	public String getnom() {
		return this.nom;
	}

	public int getargent() {
		return this.argent;
	}

	private void Parler(String Texte) {
		System.out.println(Texte);
	}

	public void direBonjour() {
		this.Parler("Bonjour ! Je m'appelle " + this.getnom() + " et j'aime boire du" + this.BoissonFav);

	}

	public void boire() {
		this.Parler("Mmmm, un bon verre de " + this.BoissonFav + "! GOULPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix <= this.argent) {
			this.Parler("J'ai " + this.getargent() + " sous en poche. je vais pouvoir m'offrir " + bien + " a " + prix
					+ " sous");
		} else {
			this.Parler("Je n'ai plus que " + this.getargent() + " sous en poche. Je ne peux meme pas m'offrir " + bien
					+ " a " + prix + " sous");
		}
	}
//	public int perdreArgent(int perte){
//		if (this.argent - perte < 0) {
//			
//		}
//	}

}
