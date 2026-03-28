
public class BinarySearchTree {

    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node buildTree(Node root, int value){

        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data > value){
            root.left = buildTree(root.left, value);
        } else{
            root.right = buildTree(root.right, value);
        }

        return root;

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int [] values = {5, 3,1,4,6,2};
        Node root = null;

        for(int i = 0; i<values.length; i++){
            root =  buildTree(root, values[i]);
        }

        inorder(root);

    }
}