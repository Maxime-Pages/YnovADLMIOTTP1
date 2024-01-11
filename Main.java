
class Main {
    public static void main(String[] arg) {
        List l1 = new List(5, new List(6, null));
        l1.append(18);
        l1.append(25);
        l1.content = 31;
        l1.show();
    }
}
