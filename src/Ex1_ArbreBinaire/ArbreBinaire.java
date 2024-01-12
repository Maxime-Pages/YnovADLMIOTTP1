package Ex1_ArbreBinaire;

import java.util.Objects;

public class ArbreBinaire {
	private Object value;
	private ArbreBinaire  gauche;
	private ArbreBinaire droite;
	
	public ArbreBinaire(Object value, ArbreBinaire gauche, ArbreBinaire droite) {
		super();
		this.value = value;
		this.gauche = gauche;
		this.droite = droite;
	}
	
	public boolean isEmty() {
		return value == null && gauche == null && droite == null ;
		
	}
	public boolean isLeaf() {
		return value != null && gauche != null && droite != null;
	}

	public ArbreBinaire getSag() {
		return gauche;
	}

	
	public ArbreBinaire getSad() {
		return droite;
	}

    public Object getValue() {
    	return value;
    }
  
    public boolean contains(Object obj) {
        if (isEmty()) {
            return false;
        }
        if (Objects.equals(value, obj)) {
            return true;
        }
        if (gauche != null && droite.contains(obj)) {
            return true;
        }
        if (droite != null && gauche.contains(obj)) {
            return true;
        }
        return false;
    }
    public int getHeight() {
        if (isEmty()) {
            return 0;
        }
        int heightSag = gauche == null ? 0 : gauche.getHeight();
        int heightSad = droite == null ? 0 : droite.getHeight();
        return 1 + Math.max(heightSag, heightSad);
    }
    
}
