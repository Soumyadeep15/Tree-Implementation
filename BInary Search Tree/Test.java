public class Test {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.add(50);
        b.add(30);
        b.add(70);
        b.add(60);
        b.add(20);
        b.add(40);
        b.add(80);

        // b.levelOrderTraverse();
        // b.preOrderTraverse();
        // b.postOrderTraverse();
        b.inOrderTraverse();
    }
}
