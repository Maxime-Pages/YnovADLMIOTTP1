class App{
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(null, null, "test");
        BinaryTree tmp = new BinaryTree(bt, null, "a");
        bt = tmp;
        System.out.println(bt.isLeaf());
        System.out.println(bt.contains("test"));
        System.out.println(bt.height());
    }
}