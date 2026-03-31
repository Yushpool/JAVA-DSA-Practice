public class exercise {

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

    public static boolean checkIfUnivalued(Node root){

        if(root == null){
            return true;
        }
        

        if(root.left != null && root.right != null){

        if(root.data != root.left.data || root.data != root.right.data){
            return false;
        }
    }

      return checkIfUnivalued(root.left) && checkIfUnivalued(root.right);  
    }

    public static Node cutLeaves(Node root, int x){
        
        if(root == null){
            return null;
        }

        root.left = cutLeaves(root.left, x);
        root.right = cutLeaves(root.right, x);

        if(root.left == null && root.right ==  null){
            if(root.data == x){
            // Node cutLeaf = root;
            root = null;
            }
        }
        return root;
    }

      public static void inorder(Node root){
            if(root == null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(4);

        // boolean ans = checkIfUnivalued(root);
        // System.out.println(ans);

        System.out.println("Inorder before cutting leaves: ");
        inorder(root);
        System.out.println();
        System.out.println("After cutting leaves: ");
        cutLeaves(root, 4);
        inorder(root);
    }
}
