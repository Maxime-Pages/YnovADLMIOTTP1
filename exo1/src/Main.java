public class Main {
    public static void main(String[] args) {
        ArbreBinaire arbre = new ArbreBinaire("A", new ArbreBinaire("B", new ArbreBinaire("D", null, null), new ArbreBinaire("E", null, null)), new ArbreBinaire("C", new ArbreBinaire("F", null, null), new ArbreBinaire("G", null, null)));
        System.out.println(arbre);

        System.out.println("Est-ce que l'arbre est vide : " + arbre.isEmpty());

        System.out.println("Est-ce que l'arbre est une feuille : " + arbre.isLeaf());

        System.out.println("Le sous arbre gauche existe t'il : " + arbre.getSag().toString());

        System.out.println("Le sous arbre droit existe t'il : " + arbre.getSad().toString());

        System.out.println("La valeur de l'arbre est : " + arbre.getValue().toString());

        System.out.println("Est-ce que l'arbre contient la valeur : " + arbre.contains("A"));

        System.out.println("Est-ce que l'arbre contient la valeur : " + arbre.contains("U"));

        System.out.println("Quelle est la hauteur de l'arbre : " + arbre.getHeigth());
    }
}