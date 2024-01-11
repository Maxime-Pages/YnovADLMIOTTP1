public class Test {
    public void main(String[] arg) {
        Liste l1 = new Liste(5, new Liste(6, null));
        l1 = Liste.ajouter(18, l1); // Pour les lignes 70 - 71 et 73 il faut rajouter Liste a la place de l1 car il ne peut pas se redéclarer a chaque fois en s'utilisant soit même
        l1 = Liste.ajouter(25, l1);
        l1.contenu = 31; // La variable contenu est privée dans la classe Liste, elle n'est donc pas accessible dans Test
        Liste.afficher(l1);
    }
}
