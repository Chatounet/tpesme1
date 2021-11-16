import java.util.Scanner;

public class Client {

	public APP2 app2;
	String Nom;
	String Prenom;
	
	public String getNom() {
		return Nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public static void main(String[] args) {
	APP2 e;
	e = new APP2("John","DEUF",200,10000,50000);
	System.out.println("Nom: " +e.getNom());
	System.out.println("Prenom: "+e.getPrenom());
	System.out.println("Solde Max: "+e.getSoldeMax());
	
	Scanner entree_utilisateur = new Scanner(System.in);
	System.out.println("Ajout d'argent ? (o/n)");
	String rep = entree_utilisateur.nextLine();
	if(rep == "o") {
		System.out.println("Combien voulez vous ajouter ?");
		String solde_ajoute = entree_utilisateur.nextLine();
		int resultat = Integer.parseInt(solde_ajoute);
		e.setSolde(resultat);
	}
	
	Scanner.close();
	}
}
