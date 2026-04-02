
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

    public static boolean searchNode(Node root, int key){

        if(root ==  null){
            return false;
        }

        if(root.data == key){
            return true;
        } 
        
        if(root.data > key){
           return searchNode(root.left, key);
        }
        else {
            return searchNode(root.right, key);
        }
    }
    

    // DELETE NODE IN BST
    public static Node delete(Node root, int val){

        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }

        else{
            //case 1 leaf nodes
            if(root.right == null && root.left == null){
                return null;
            }

            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3 both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
           
        }
         return root;
    }

    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int [] values = {5, 3,1,4,6,2};
        Node root = null;

        for(int i = 0; i<values.length; i++){
            root =  buildTree(root, values[i]);
        }

        inorder(root);
        System.out.println();

        // if(searchNode(root, 8)){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not Found");
        // }

        delete(root, 1);
        inorder(root);


    }
}