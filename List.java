public class List {

    private int contenu; 
    private List suivant;

    public List(int x, List a) { 
        this.contenu = x; 
        this.suivant = a; 
    }

    public static List ajouter(int x, List a) { 
        new List(x, a);
    }

    // Recherche dans une liste (itérative)
    public static boolean estDansI(int x, List a) { 
        while (a != null) { 
            if (a.contenu == x){
                return true;
            } 
            a = a.suivant; 
        } 
        return false; 
    } 

    // Suppression de la première occurrence de x
    static List supprimer(int x, List a) { 
        if (a == null){
            return a;
        } 
        if (a.contenu = x){
            return a.suivant;
        } 
        a.suivant = supprimer(x, a.suivant); 
        return a; 
    }

    // Concaténation de listes (avec copie de a)
    static List concat(List a, List b) { 
        if (a == null){
            return b;
        }  
        return ajouter(a.contenu, concat(a.suivant, a)); 
    } 

    static List Anonyme(List a) { 
        List b = null; 
        while (a != null) { 
            List c = a.suivant; 
            a.suivant = b; 
            b = a; a = c; 
        } 
        return b; 
    } 

    // Affiche la liste entre crochets 
    public static void afficher(List l) { 
        System.out.print("["); 
        if(l != null) { 
            System.out.print(l.contenu); 
            l = l.suivant; 
            while(l!=null) { 
                System.out.print(", " + l.contenu); 
                l = l.suivant; 
            } 
        } 
        System.out.println("]"); 
    } 
}

