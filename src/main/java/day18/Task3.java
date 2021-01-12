package day18;

public class Task3 {
    public static void main(String[] args) {
        BST b = new BST();
        BNode v = new BNode(20);
        b.add(14);
        b.add(11);
        b.add(5);
        b.add(8);
        b.add(16);
        b.add(15);
        b.add(18);

        b.add(23);
        b.add(27);
        b.add(24);
        b.add(150);
        b.add(22);


        b.inorder(BST.root);


    }
}