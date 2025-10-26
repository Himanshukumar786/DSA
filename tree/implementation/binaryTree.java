package tree.implementation;

public class binaryTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        root.left = a;
        root.right = b;
        System.out.println(root.data);
    }
}
