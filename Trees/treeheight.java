import org.w3c.dom.Node;

class treeheight {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class trees {
        static int idx = -1;

        public static Node buildtree(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }

            Node newnode = new Node(Nodes[idx]);
            newnode.left = buildtree(Nodes);
            newnode.right = buildtree(Nodes);

            return newnode;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int myheight = Math.max(leftheight, rightheight) + 1;

        return myheight;
    }

    public static void main(String[] args) {
        int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        trees tree = new trees();
        Node root = tree.buildtree(Nodes);
        System.out.println(height(root));
    }
}
