class countnode {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class trees{
        static int idx = -1;
        public static Node buildtree(int Nodes[]){
            idx++;
            if(Nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(Nodes[idx]);
            newnode.left = buildtree(Nodes);
            newnode.right = buildtree(Nodes);

            return newnode;
        }
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int leftNode = count(root.left);
        int rightNode = count(root.right);

        return leftNode + rightNode + 1;
    }
    
    public static void main(String[] args) {
        int Nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        trees tree = new trees();
        Node root = tree.buildtree(Nodes);
        System.out.println(count(root));
    }
}
