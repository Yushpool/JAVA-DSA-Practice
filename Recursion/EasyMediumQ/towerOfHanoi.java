package EasyMediumQ;

public class towerOfHanoi {

    public static void transferDisks(int n, String src, String helper, String dest){
        if(n == 1){
            System.err.println("Transfer disk " + n + " from " + src + " to "+ dest);
            return;
        }
        transferDisks(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to "+ dest);
        transferDisks(n-1, src, dest, helper);

    }

    public static void main(String[] args) {
        int n = 3;
        transferDisks(n, "S", "H", "D");
    }
    
}
