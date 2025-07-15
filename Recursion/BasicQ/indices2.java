package BasicQ;

public class indices2 {

    public static int calcpower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n % 2 == 0){
            return calcpower(x, n/2) * calcpower(x, n/2);
        }
        else{
            return calcpower(x, n/2) * calcpower(x, n/2)*x;
        }
    }

    public static void main(String[] args) {
        int x = 3;
        int n = 3;
        System.out.println(calcpower(x, n));
    }
    
}
