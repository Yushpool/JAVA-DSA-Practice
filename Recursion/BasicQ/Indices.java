package BasicQ;

public class Indices {

    public static int index(int x, int n){
        if(n == 0){
            return 1;
        }

        return x * index(x, n-1);
    }

    public static void main(String[] args) {
        int x = 7;
        int n = 2;

        System.out.println(index(x, n));
    }
    
}
