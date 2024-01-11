public class ArbreBinaire {

    private Object value;
    private ArbreBinaire sag;
    private ArbreBinaire sad;

    public ArbreBinaire(Object value, ArbreBinaire sag, ArbreBinaire sad) {
        this.value = value;
        this.sag = sag;
        this.sad = sad;
    }

    public boolean isEmpty() {
        return value == null && sag == null && sad == null;
    }

    public boolean isLeaf() {
        return value != null && sag != null && sad != null;
    }

    public ArbreBinaire getSag() {
        return sag;
    }

    public ArbreBinaire getSad() {
        return sad;
    }

    public Object getValue() {
        return value;
    }

    public boolean contains(Object object) {

        if (isEmpty()) {
            return false;
        }

        if (value != null && value.equals(object)) {
            return true;
        }
        boolean sagContains = sag != null && sag.contains(object);
        boolean sadContains = sad != null && sad.contains(object);

        return sagContains || sadContains;
    }

    public ArbreBinaire getHeight() {
        return Math.max(sad, sag);
    }
}
