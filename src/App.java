public class App {
    public static void main(String[] args) throws Exception {
        ArbreBinaire ab = new ArbreBinaire("A", new ArbreBinaire(null, null, null), new ArbreBinaire("C", null, null));
        System.out.println("la list est vide" + " " + ab.isEmpty());
        System.out.println("la conties une feuille" + " " + ab.isLeaf());
        System.out.println("Sag existe ou pas? " + ab.getSag());
        System.out.println(" existe ou pas? " + ab.contains("z"));

    }
}