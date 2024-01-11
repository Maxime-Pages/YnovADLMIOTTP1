package Exercice_2;

public class Liste {
    public int contenu;
    private Liste suivant; //On doit mettre un l majuscule car l'attribut est du type de la classe Liste
    
    /*contenu est un attribut de classe de type int
     * et suivant est un attribut d'instance de type Liste
     */
    
    public Liste(int x, Liste a) {
        this.contenu = contenu;
        this.suivant = suivant;
    }

    public static Liste ajouter(int x, Liste a) {//C'est une méthode avec un renvoie static, il manque le return
        return new Liste(x, a);
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
    
    /*
     * Q2 Recherche dans une liste (récursive)
     */
    public static boolean estDansR(int x, Liste a) {
    	if(a.contenu == x) {
    		return true;
    	}else {
    		return estDansR(x,a.suivant);
    	}
    }

    // Suppression de la première occurrence de x
    static Liste supprimer(int x, Liste a) {
        if (a == null)
            return a;
        if (a.contenu == x)// pour vérifier une égalité on écrit == et non pas =
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
        while (a != null) { //Tant que a est diférent de null
            Liste c = a.suivant; // on met la liste suivante dans c
            a.suivant = b; // la liste suivante prend la valeur null
            b = a; // b prends la liste en parametre
            a = c; // a prends la liste suivant de a
        }
        return b;
    }
    /*
     * Q3 
     * Cette méthode renverra la meme liste mais inversée
     */

    // Affiche la liste entre crochets
    public static void afficher(Liste l) {
        System.out.print("[");
        if (l != null) {
            System.out.print(l.contenu);//En java on écrit System.out.print et non pas System.print
            l = l.suivant;
            while (l != null) {
                System.out.print(", " + l.contenu);
                l = l.suivant;
            }
        }
        System.out.println("]");
    }
}

