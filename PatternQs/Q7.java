public class Q7 {
    public static void main(String[] args) {
        //outer loop
        int n = 5;
        for(int i=n; i>=1; i--){
            //inner loop
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
