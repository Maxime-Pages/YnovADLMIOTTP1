public class Liste {
    // pour modifier un attribut il faut supprimer privé
    // private int contenu; -> int contenu;
    int contenu;

    // il manquait ici la majuscule à "Liste"
    // liste -> Liste
    private Liste suivant;

    public Liste(int x, Liste a) {
        this.contenu = contenu;
        this.suivant = suivant;
    }

    public Liste ajouter(int x, Liste a) {
        // il manquait le return
        // new Liste(x, a); -> return new Liste(x, a);
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

    // Suppression de la première occurrence de x
    static Liste supprimer(int x, Liste a) {
        if (a == null)
            return a;
        // il fallait mettre == et non =
        // if (a.contenu = x) -> if (a.contenu == x)
        if (a.contenu == x)
            return a.suivant;
        a.suivant = supprimer(x, a.suivant);
        return a;
    }

    // Concaténation de listes (avec copie de a)
    public Liste concat(Liste a, Liste b) {
        if (a == null)
            return b;
        return ajouter(a.contenu, concat(a.suivant, a));
    }

    static Liste Anonyme(Liste a) {
        Liste b = null;
        while (a != null) {
            Liste c = a.suivant;
            a.suivant = b;
            b = a;
            a = c;
        }
        return b;
    }

    // Affiche la liste entre crochets
    public static void afficher(Liste l) {
        System.out.print("[");
        if (l != null) {
            // manque le .out dans System.out.print
            // System.print(l.contenu); -> System.out.print(l.contenu);
            System.out.print(l.contenu);
            l = l.suivant;
            while (l != null) {
                System.out.print(", " + l.contenu);
                l = l.suivant;
            }
        }
        System.out.println("]");
    }
}

