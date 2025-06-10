//Hollow rectangle

public class Q2 {
    public static void main(String[] args) {
        //outer loop
    for(int i = 1; i<=4; i++){
        //inner loop
        for(int j = 1; j<=5; j++){
            if (i == 1 || j == 1 || i == 4 || j == 5) {
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
        //to go on next line
        System.out.println();
    }
}
}
