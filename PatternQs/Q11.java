public class Q11 {

    //outer loop
    int n = 5;{

    for(int i = 1; i<=n; i++){
        //inner loop -> space
        for(int j = 1; j<=n-i; j++){
            System.out.print(" ");
        }
        //inner loop -> star
        for(int j = 1; j<=i; j++){
            System.out.print("*");

        }
        System.out.println();
        if(i==2){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
        }
    }
    }
}}
