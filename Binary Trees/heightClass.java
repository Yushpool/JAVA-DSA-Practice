public class heightClass {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Height of the Tree
    public static int height(Node root){

        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
        
    }



    //Count Nodes in Tree
    public static int countN(Node root){
        if(root == null){
            return 0;

        }

        int leftCount = countN(root.left);
        int rightCount = countN(root.right);

        return leftCount + rightCount + 1;
    }

    //Sum of all nodes
    public static int sumN(Node root){
        if(root == null){
            return 0;
        }

        int ls = sumN(root.left);
        int rs = sumN(root.right);

        return ls + rs + root.data;
    }



    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.left.left.left = new Node(10);

        System.out.println(height(root));
        System.out.println(countN(root));
        System.out.println(sumN(root));
    }
}
