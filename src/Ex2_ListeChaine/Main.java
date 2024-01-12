package Ex2_ListeChaine;


public class Main {

	public static void main(String[] args) {// add static
		// TODO Auto-generated method stub
		Liste l1 = new Liste(5, new Liste(6, null));
	
		l1.ajouter(18, l1);
		l1.ajouter(25, l1);
		l1.afficher(l1);
		
		
		
	}

}
