package Exercice_1;

public class ArbreBinaire {
	private Object noeud;
	private ArbreBinaire arbreDroit;
	private ArbreBinaire arbreGauche;
	
	public ArbreBinaire(Object n, ArbreBinaire gauche, ArbreBinaire droit) {
		this.noeud = n;
		this.arbreGauche = gauche;
		this.arbreDroit = droit;
	}
	
	public boolean isEmpty(){
		if(getValue() == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isLeaf() {
		if(this.arbreDroit == null && this.arbreGauche == null) {
			return true;
		}else{
			return false;
		}
	}
	
	public Object getSag() {
		return this.arbreGauche.getValue();
	}
	
	public Object getSad() {
		return this.arbreDroit.getValue();
	}
	
	public Object getValue() {
		return this.noeud;
	}
	
	public boolean contains(Object o) {
		if(this.noeud.equals(o)) {
			return true;
		}else if(!this.arbreDroit.isEmpty() && this.arbreDroit.contains(o)){
			return true;
		}else if(!this.arbreGauche.isEmpty() && this.arbreGauche.contains(o)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getHeight() {
		if(this.isEmpty()) {
			return 0;
		}else {
			return 1 + Math.max(this.arbreGauche.getHeight(),this.arbreDroit.getHeight());
		}
	}
}
