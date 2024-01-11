public class BinaryTree {
    private Object value;
    private BinaryTree leftSon;
    private BinaryTree rightSon;

    public BinaryTree(BinaryTree leftSon, BinaryTree rightSon, Object value){
        this.value = value;
        this.leftSon = leftSon;
        this.rightSon = rightSon;
    }

    public boolean isEmpty(){
        return (value == null && this.isLeaf());
    }

    public boolean isLeaf(){
        return (this.leftSon == null && this.rightSon == null);
    }

    public BinaryTree getLeftSon(){
        return this.leftSon;
    }

    public BinaryTree getRightSon(){
        return this.rightSon;
    }

    public Object getValue(){
        return this.value;
    }

    public boolean contains(Object obj){
        if (this.value == obj)
            return true;
        return (this.leftSon.contains(obj) || this.rightSon.contains(obj));
    }

    public int height(){
        int i = 1;
        int leftHeight = 0;
        int rightHeight = 0;

        if(this.leftSon != null) {
            leftHeight = this.leftSon.height();
        }
        if(this.rightSon != null) {
            rightHeight = this.rightSon.height();
        }

        i += Integer.max(rightHeight, leftHeight);

        return i;
    }
}
