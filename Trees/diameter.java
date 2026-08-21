class diameter {
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

    // public static int height(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }

    //     int leftheight = height(root.left);
    //     int rightheight = height(root.right);

    //     int myheight = Math.max(leftheight, rightheight) + 1;

    //     return myheight;
    // }

    // public static int diameters(Node root){
    //      if(root == null){
    //         return 0;
    //      }

    //      int dia1 = diameters(root.left);
    //      int dia2 = diameters(root.right);
    //      int dia3 = height(root.left) + height(root.right) + 1;

    //      int mydia = Math.max(dia3, Math.max(dia1, dia2));

    //      return mydia;
    // }

    static class Treeinfo{
        int ht;
        int dia;

        Treeinfo(int ht, int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static Treeinfo diameter2(Node root){
        if(root == null){
            return new Treeinfo(0, 0);
        }

        Treeinfo left = diameter2(root.left);
        Treeinfo right = diameter2(root.right);

        int myheight = Math.max(left.ht, right.ht) + 1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht + 1;

        int mydia = Math.max(Math.max(dia1, dia2), dia3);

        Treeinfo myInfo = new Treeinfo(myheight, mydia);

        return myInfo;
    }

    public static void main(String[] args) {
        int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        trees tree = new trees();
        Node root = tree.buildtree(Nodes);
        System.out.println(diameter2(root).dia);
    }
}

