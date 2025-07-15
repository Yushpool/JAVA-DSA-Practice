package BasicQ;

public class factorial {

    public static int printFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        return  n * printFactorial(n-1);


    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));
        
    }
    
}
