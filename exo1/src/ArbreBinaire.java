public class ArbreBinaire {
    private ArbreBinaire gauche;
    private ArbreBinaire droit;
    private Object obj;

    @Override
    public String toString() {
        return "ArbreBinaire{" + "obj=" + obj + ", gauche= " + gauche + ", droit=" + droit + '}';
    }

    public ArbreBinaire(Object obj, ArbreBinaire gauche, ArbreBinaire droit) {
        this.obj = obj;
        this.gauche = gauche;
        this.droit = droit;
    }

    public boolean isEmpty() {
        return this.obj == null;
    }

    public boolean isLeaf() {
        return this.gauche == null && this.droit == null;
    }

    public Object getSag() {
        if (this.gauche == null) {
            throw new NullPointerException("Le sous arbre gauche n'existe pas");
        } else {
            return this.gauche.obj;
        }
    }

    public Object getSad() {
        if (this.droit == null) {
            throw new NullPointerException("Le sous arbre droit n'existe pas");
        } else {
            return this.droit.obj;
        }
    }

    public Object getValue() {
        return this.obj;
    }

    public boolean contains(Object obj) {
        if (this.obj.equals(obj)) {
            return true;
        } else {
            if (this.gauche != null) {
                return this.gauche.contains(obj);
            }
            if (this.droit != null) {
                return this.droit.contains(obj);
            }
            return false;
        }
    }

    public int getHeigth() {
        if (this.isEmpty()) {
            return 0;
        } else {
            if (this.gauche != null && this.droit != null) {
                return 1 + Math.max(this.gauche.getHeigth(), this.droit.getHeigth());
            } else if (this.gauche != null) {
                return 1 + this.gauche.getHeigth();
            } else if (this.droit != null) {
                return 1 + this.droit.getHeigth();
            } else {
                return 1;
            }
        }
    }
}

