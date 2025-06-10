import java.util.*;

public class sumO {

    public static void sumOdd(int n){
        int temp = 0;
        for(int i = 1; i<=n; i++){

            if(i%2 == 0){
               temp = temp+0;
            }else{
                temp = temp + i;
            }


        }
        System.out.println("The sum is "+temp);
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumOdd(n);

        sc.close();




    }
    
}
