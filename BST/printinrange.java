class printinrange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void range(Node root, int x, int y){
        if(root == null){
            return;
        }

        if(root.data >= x && root.data <= y){
            range(root.left, x, y);
            System.out.print(root.data + " ");
            range(root.right, x, y);
        }

        else if(root.data >= y){
            range(root.left, x, y);
        } else {
            range(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int values[] = { 3, 4, 6, 7, 1, 2, 5, 8 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        range(root, 4, 7);
    }
}