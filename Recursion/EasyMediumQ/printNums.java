package EasyMediumQ;

//print numbers n to 1 (Decresing order)

public class printNums {

    public static int inRev(int n){

        if(n == 1){
            return 1;
        }


        System.out.print(n + " ");
        return inRev(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(inRev(n));
    }

    
}