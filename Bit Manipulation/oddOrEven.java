public class oddOrEven {

    public static void isOddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even number");

        }else{
            System.out.println("Odd number");
        }
    }


    public static void main(String[] args) {
        isOddOrEven(9);
        isOddOrEven(6);
        
    }
}
