public class Main {
    public static void main(String[] args) {
        // Création d'un arbre binaire avec des nœuds et des feuilles
        ArbreBinaire feuille1 = new ArbreBinaire("Feuille 1");
        ArbreBinaire feuille2 = new ArbreBinaire("Feuille 2");
        ArbreBinaire arbre1 = new ArbreBinaire("Racine", feuille1, feuille2);

        // Création d'un arbre binaire vide
        ArbreBinaire arbre2 = new ArbreBinaire(null);

        // Test de la méthode isEmpty()
        System.out.println("Arbre 1 est vide ? " + arbre1.isEmpty()); // Doit renvoyer false
        System.out.println("Arbre 2 est vide ? " + arbre2.isEmpty()); // Doit renvoyer true

        // Test de la méthode isLeaf()
        System.out.println("Feuille 1 est une feuille ? " + feuille1.isLeaf()); // Doit renvoyer true
        System.out.println("Arbre 1 est une feuille ? " + arbre1.isLeaf()); // Doit renvoyer false

        // Test de la méthode getSag() et getSad()
        System.out.println("Sous-arbre gauche de la racine de l'arbre 1 : " + arbre1.getSag()); // Doit renvoyer "Feuille 1"
        System.out.println("Sous-arbre droit de la racine de l'arbre 1 : " + arbre1.getSad()); // Doit renvoyer "Feuille 2"

        // Test de la méthode getValue()
        System.out.println("Valeur de la racine de l'arbre 1 : " + arbre1.getValue()); // Doit renvoyer "Racine"

        // Test de la méthode contains()
        System.out.println("Arbre 1 contient 'Feuille 1' ? " + arbre1.contains("Feuille 1")); // Doit renvoyer true
        System.out.println("Arbre 1 contient 'Feuille 3' ? " + arbre1.contains("Feuille 3")); // Doit renvoyer false

        // Test de la méthode getHeight()
        System.out.println("Hauteur de l'arbre 1 : " + arbre1.getHeight()); // Doit renvoyer 2
        System.out.println("Hauteur de l'arbre 2 : " + arbre2.getHeight()); // Doit renvoyer 0
    }
}
