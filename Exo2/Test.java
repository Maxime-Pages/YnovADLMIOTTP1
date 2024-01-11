package Exercice_2;

//On ne doit pas mettre 2 classes dans le meme fichier
public class Test {
    public static void main(String[] arg) {
        Liste l1 = new Liste(5, new Liste(6, null));
        l1 = Liste.ajouter(18, l1);
        l1 = Liste.ajouter(25, l1);
        l1.contenu = 31;//contenu en privé donc on ne peut pas y accéder, il faut le mettre en public par exemple
        Liste.afficher(l1);
    }
} 