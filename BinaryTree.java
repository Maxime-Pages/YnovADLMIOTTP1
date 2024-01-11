public class BinaryTree {
        private Object value;
        private BinaryTree left;
        private BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            this.left = this.right = null;
        }

        
    public Boolean isEmpty() {
        return value == null;
    }

    public Boolean isLeaf() {
        return left == null && right == null;
    }

    public BinaryTree getSag() {
        if (left != null) {
            return left;
        }
        return null;
    }

    public BinaryTree getSad() {
        if (right != null) {
            return right;
        }
        return null;
    }

    public Object getValue() {
        return value;
    }

    public Boolean contains(Object value) {
        if (this.value == value) {
            return true;
        }
        if (left != null) {
            if (left.contains(value)) {
                return true;
            }
        }
        if (right != null) {
            if (right.contains(value)) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        if (isLeaf()) {
            return 0;
        }
        int leftHeight = 0;
        int rightHeight = 0;
        if (left != null) {
            leftHeight = left.getHeight();
        }
        if (right != null) {
            rightHeight = right.getHeight();
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
