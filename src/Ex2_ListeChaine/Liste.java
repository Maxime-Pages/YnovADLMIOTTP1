package Ex2_ListeChaine;


public class Liste {

	private int contenu;
	private Liste suivant; //Liste au lieu de liste
	
	//utiliser les parametres de la classe
	public Liste(int contenu, Liste suivant) {
	this.contenu = contenu;
	this.suivant = suivant;
	}
	public static Liste ajouter(int x, Liste a) {
	  return new Liste(x, a); //ajouter return 
	} 
   
	// Recherche dans une liste (itérative)
	public static boolean estDansI(int x, Liste a) {
	while (a != null) {
	 if (a.contenu == x)
	 return true;
	 a = a.suivant;
	 }
	return false;
	}
	// Suppression de la première occurrence de x
	static Liste supprimer(int x, Liste a) {
	if (a == null)
	 return a;
     if (a.contenu == x) //   "==" au lieu de "="
	 return a.suivant;
	 a.suivant = supprimer(x, a.suivant);
	return a;
	}
	// Concaténation de listes (avec copie de a)
	static Liste concat(Liste a, Liste b) {
	if (a == null)
	 return b;
	return ajouter(a.contenu, concat(a.suivant, a));
	}
	static Liste Anonyme(Liste a) {
	 Liste b = null;
	while (a != null) {
	 Liste c = a.suivant;
	 a.suivant = b;
	 b = a; a = c;
	 }
	return b;
	}
	// Affiche la liste entre crochets
	public static void afficher(Liste l) {
	 System.out.print("[");
	if(l != null) {
	 System.out.println(l.contenu); //correction de System.oiut.println
	 l = l.suivant;
	 while(l!=null) {
	 System.out.print(", " + l.contenu);
	 l = l.suivant;
	 }
	 }
	 System.out.println("]");
	} 
}
