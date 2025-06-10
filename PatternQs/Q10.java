//solid rhombus
public class Q10 {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for(int i = 1; i<=n;i++){
            //inner loop -> for space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
