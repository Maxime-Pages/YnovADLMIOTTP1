public class ArbreBinaire {
    // create the attributes of the class
    private Object value;
    private ArbreBinaire leftChild;
    private ArbreBinaire rightChild;

    public ArbreBinaire(Object value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }
    public ArbreBinaire(Object value, ArbreBinaire leftChild, ArbreBinaire rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Boolean isEmpty() {
        return this.value == null;
    }

    public Boolean isLeaf() {
        return this.leftChild == null && this.rightChild == null;
    }

    public Object getSag() {
        if (this.leftChild == null) {
            return null;
        }
        return this.leftChild.value;
    }

    public Object getSad() {
        if (this.rightChild == null) {
            return null;
        }
        return this.rightChild.value;
    }

    public Object getValue() {
        return this.value;
    }
    public Boolean contains(Object value) {
        if (this.value.equals(value)) {
            return true;
        }
        if (this.leftChild != null && this.leftChild.contains(value)) {
            return true;
        }
        return this.rightChild != null && this.rightChild.contains(value);
    }
    public int getHeight() {
        if (this.isEmpty()) {
            return 0;
        }
        int leftHeight = 0;
        int rightHeight = 0;
        if (this.leftChild != null) {
            leftHeight = this.leftChild.getHeight();
        }
        if (this.rightChild != null) {
            rightHeight = this.rightChild.getHeight();
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
