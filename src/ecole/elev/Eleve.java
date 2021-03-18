package ecole.elev;

public class Eleve {
	private String id;
	private String prenom;
	private String nom;
	public Eleve() {
	}
	public Eleve(String id, String prenom, String nom) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
	
		return "[Iditifiant :"+ this.id+"\t Prenom : "+this.prenom+"\t Nom : "+this.nom+"\n]";
	}
	

}
