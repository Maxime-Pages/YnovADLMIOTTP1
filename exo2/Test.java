public class Test {

    // la fonction doit êtrre static pour être appelée dans le main
    public static void main(String[] arg) {
        Liste l1 = new Liste(5, new Liste(6, null));
        l1 = l1.ajouter(18, l1); // ajouter ne se référence à rien , il faut se référencer à l'objet l1 pour avoir accès a la méthode
        l1 = l1.ajouter(25, l1); // ajouter ne se référence à rien , il faut se référencer à l'objet l1 pour avoir accès a la méthode
        l1.contenu = 31; // contenu est privé, il faut créer un getter et un setter pour y accéder
        Liste.afficher(l1); // il faut utiliser l'objet Liste pour  accéder à la méthode afficher
    }
}
