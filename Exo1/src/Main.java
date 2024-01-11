import Exercice_1.ArbreBinaire;

public class Main {

	public static void main(String[] args) {
		ArbreBinaire d = new ArbreBinaire(null,null,null);
		ArbreBinaire b = new ArbreBinaire(2,d,d);
		ArbreBinaire c = new ArbreBinaire(3,d,d);
		ArbreBinaire a = new ArbreBinaire(1,b,c);
		
		System.out.println(d.isEmpty());
		System.out.println(a.isEmpty());
		
		System.out.println("----------------------------------");
		
		System.out.println(d.isLeaf());
		System.out.println(a.isLeaf());
		System.out.println("----------------------------------");
		
		System.out.println(a.getSag());
		System.out.println(a.getSad());
		
		System.out.println("----------------------------------");
		
		System.out.println(a.contains(2));
		System.out.println(a.contains(5));
		
		System.out.println("----------------------------------");
		
		System.out.println(a.getHeight());
		System.out.println(b.getHeight());
	}

}
