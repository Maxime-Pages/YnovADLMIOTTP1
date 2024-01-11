public class ChainedList {
    private int content;
    private ChainedList next;
    
    public ChainedList(int x, ChainedList a) {
        this.content = x;
        this.next = a;
    }

    public static ChainedList append(int x, ChainedList a) {
        //new ChainedList(x, a);
        return new ChainedList(x, a);
    }

    public int getContent(){
        return content;
    }

    public void setContent(int x){
        this.content = x;
    }

    // Recherche dans une ChainedList (itérative)
    public static boolean isInListI(int x, ChainedList a) {
        while (a != null) {
            if (a.content == x)
                return true;
            a = a.next;
        }
        return false;
    }

    // Recherche dans une liste (recursive)
    public static boolean isInListR(int x, ChainedList a) {
        System.out.println(a.content);
        if(a.content == x) return true;
        if(a.next != null) return isInListR(x, a.next);
        return false;
    }

    // Suppression de la première occurrence de x
    static ChainedList remove(int x, ChainedList a) {
        if (a == null)
            return a;
        if (a.content == x)
            return a.next;
        a.next = remove(x, a.next);
        return a;
    }

    // Concaténation de Lists (avec copie de a)
    static ChainedList concat(ChainedList a, ChainedList b) {
        if (a == null)
            return b;
        return append(a.content, concat(a.next, a));
    }

    static ChainedList Anonymous(ChainedList a) {
        ChainedList b = null;
        while (a != null) {
            ChainedList c = a.next;
            a.next = b;
            b = a; a = c;
        }
        return b;
    }

    // Affiche la ChainedList entre crochets
    public static void printList(ChainedList l) {
        System.out.print("[");
        if(l != null) {
            //System.print(l.content);
            System.out.print(l.content);
            l = l.next;
            while(l!=null) {
                System.out.print(", " + l.content);
                l = l.next;
            }
        }
        System.out.println("]");
    }
}

class Main {
    public static void main(String[] arg) {
        ChainedList l1 = new ChainedList(5, new ChainedList(6, null));
        l1 = ChainedList.append(18, l1);
        l1 = ChainedList.append(25, l1);
        System.out.println(ChainedList.isInListR(18, l1));
        l1.setContent(31);
        ChainedList.printList(l1);
    }
}