class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int data) {
        this.data = data;
    }

    public void inorder(BinaryTree root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}


public class Main {
    public static void main(String[] args) {

        BinaryTree root = new BinaryTree(10);

        root.left = new BinaryTree(20);
        root.right = new BinaryTree(30);

        root.left.left = new BinaryTree(40);
        root.left.right = new BinaryTree(50);

        root.right.left = new BinaryTree(60);

        root.inorder(root);
    }
}