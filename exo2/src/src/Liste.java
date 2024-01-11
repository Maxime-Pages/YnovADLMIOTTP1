public class Liste {
    int contenu;
    private Liste suivant; // La liste faire référence a la classe liste, il nous faut donc rajouter un L majuscule pour y faire référence

    public Liste(int x, Liste a) {
        this.contenu = contenu;
        this.suivant = suivant;
    }

    public static Liste ajouter(int x, Liste a) {
        return new Liste(x, a); // la ligne suivante ne retourne rien la ou la foncttion attends un objet de type Liste
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
        if (a.contenu == x) // En java le statement = n'éxiste pas, il faut donc mettre == pour comparer
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
            b = a;
            a = c;
        }
        return b;
    }

    // Affiche la liste entre crochets
    public static void afficher(Liste l) {
        System.out.print("[");
        if (l != null) {
            System.out.println(l.contenu); // System.print n'éxiste pas en java, il faut donc mettre System.out.print
            l = l.suivant;
            while (l != null) {
                System.out.print(", " + l.contenu);
                l = l.suivant;
            }
        }
        System.out.println("]");
    }
}

