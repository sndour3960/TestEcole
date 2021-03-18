package ecole.scolar;

import java.util.HashSet;
import java.util.Set;

import ecole.elev.Eleve;

public class GestionEleve {

	public static void main(String[] args) {
		Eleve el1= new Eleve("AD12","Serigne","NDOUR");
		Eleve el2= new Eleve("AD13","Sadio","DIOP");
		Eleve el3= new Eleve("AD14","Fatou","SENE");
		Eleve el4= new Eleve("AD15","Aby","SALL");
		Set<Eleve> eleves= new HashSet<Eleve>();
		eleves.add(el1);eleves.add(el2);
		eleves.add(el3);eleves.add(el4);
		System.out.println("Identifiant\tPrenom\tNom");
		for (Eleve eleve : eleves) {
			System.out.println(eleve.toString());
			System.out.println("Bonjour");
			
		}
		

	}

}
