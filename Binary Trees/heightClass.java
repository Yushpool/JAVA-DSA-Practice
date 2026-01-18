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

    //Diameter of Tree 
    //Approach 1 O(N^2)
    public static int diameter(Node root) {

        if(root == null){
            return 0;
        }

        int ld = diameter(root.left);
        int lheight = height(root.left);
        int rd = diameter(root.right);
        int rheight = height(root.right);

        int selfDiameter = lheight + rheight + 1;

        return Math.max(selfDiameter, Math.max(ld, rd));
    
        
    }

    public static class info {
        int height;
        int diameter;

        info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static info diameter2(Node root){
        if(root == null){
            return new info(0,0);
        }

        info leftinfo = diameter2(root.left);
        info rightinfo = diameter2(root.right);

        int height = Math.max(leftinfo.height, rightinfo.height) + 1;

        int diam1 = leftinfo.diameter;
        int diam2 = rightinfo.diameter;
        int diam3 = leftinfo.height + rightinfo.height + 1;

        int diameter = Math.max(diam3, Math.max(diam1, diam2));

        return new info(height, diameter);
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
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diameter);
    }
}
