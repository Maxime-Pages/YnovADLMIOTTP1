package Ex1_ArbreBinaire;

import Ex1_ArbreBinaire.ArbreBinaire;

public class Main {

	public static void main(String[] args) {
       ArbreBinaire arbre = new ArbreBinaire( "A", new ArbreBinaire("D", null, null), new ArbreBinaire("E", null, null));
       //ArbreBinaire arbre=new ArbreBinaire(null, null, null);
        
        System.out.println("L'arbre est vide : " + arbre.isEmty());
        System.out.println("L'arbre est une feuille : " + arbre.isLeaf());
        System.out.println("L'arbre contient la valeur : " + arbre.contains("D"));
        System.out.println("La hauteur de l'arbre est : " + arbre.getHeight());


	}

}
