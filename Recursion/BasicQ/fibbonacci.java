package BasicQ;

public class fibbonacci {
    public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a +b;
        System.out.println(c);
        printFib(b, c, n-1);

    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 7;
        System.out.println(0);
        System.out.println(1);
        printFib(a, b, n-2);


    }
    
}
