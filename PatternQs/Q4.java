//Inverted half pyramid
public class Q4 {
    public static void main(String[] args) {
        //outer loop
        int n = 4;
        for(int i = n; i>=1; i--){
            //inner loop
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
