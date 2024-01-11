public class ListUsingStatic {
    public int content;
    private ListUsingStatic next;

    public ListUsingStatic(int x, ListUsingStatic a) {
        this.content = x;
        this.next = a;
    }

    public static ListUsingStatic append(int x, ListUsingStatic a) {
        return new ListUsingStatic(x, a);
    }

    // Recherche dans une liste (itérative)
    public static boolean estDansI(int x, ListUsingStatic a) {
        while (a != null) {
            if (a.content == x)
                return true;
            a = a.next;
        }
        return false;
    }

    public Boolean contains(int x) {
        if (this.content == x)
            return true;
        if (this.next == null)
            return false;
        return this.next.contains(x);
    }
    
    // Suppression de la première occurrence de x
    static ListUsingStatic supprimer(int x, ListUsingStatic a) {
        if (a == null)
            return a;
        if (a.content == x)
            return a.next;
        a.next = supprimer(x, a.next);
        return a;
    }

    // Concaténation de listes (avec copie de a)
    static ListUsingStatic concat(ListUsingStatic a, ListUsingStatic b) {
        if (a == null)
            return b;
        return new ListUsingStatic(a.content, concat(a.next, b));
    }

    static ListUsingStatic Anonyme(ListUsingStatic a) {
        ListUsingStatic b = null;
        while (a != null) {
            ListUsingStatic c = a.next;
            a.next = b;
            b = a;
            a = c;
        }
        return b;
    }

    // Affiche la liste entre crochets
    public static void show(ListUsingStatic a) {
        System.out.print("[");
        if (a != null) {
            System.out.print(a.content);
            a = a.next;
            while (a != null) {
                System.out.print(", " + a.content);
                a = a.next;
            }
        }
        System.out.println("]");
    }
}

class Main {
    public static void main(String[] arg) {
        ListUsingStatic l1 = new ListUsingStatic(5, new ListUsingStatic(6, null));
        l1 = ListUsingStatic.append(18, l1);
        l1 = ListUsingStatic.append(25, l1);
        l1.content = 31;
        ListUsingStatic.show(l1);
        ListUsingStatic.Anonyme(l1);
        ListUsingStatic.show(l1);
    }
}