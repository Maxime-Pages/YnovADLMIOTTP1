public class List {
    public int content;
    private List next;

    public List(int x, List a) {
        this.content = x;
        this.next = a;
    }

    public void append(int x) {
        this.next = new List(this.content, this.next);
        this.content = x;
    }

    // Recherche dans une liste (itérative)
    public static boolean estDansI(int x, List a) {
        while (a != null) {
            if (a.content == x)
                return true;
            a = a.next;
        }
        return false;
    }

    // Suppression de la première occurrence de x
    static List supprimer(int x, List a) {
        if (a == null)
            return a;
        if (a.content == x)
            return a.next;
        a.next = supprimer(x, a.next);
        return a;
    }

    // Concaténation de listes (avec copie de a)
    static List concat(List a, List b) {
        if (a == null)
            return b;
        return new List(a.content, concat(a.next, b));
    }

    static List Anonyme(List a) {
        List b = null;
        while (a != null) {
            List c = a.next;
            a.next = b;
            b = a;
            a = c;
        }
        return b;
    }

    // Affiche la liste entre crochets
    public void show() {
        System.out.print("[");
        if (this != null) {
            System.out.print(this.content);
            List lt  = this.next;
            while (lt != null) {
                System.out.print(", " + lt.content);
                lt = lt.next;
            }
        }
        System.out.println("]");
    }
}