import java.util.*;

public class reverseString{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        String result = "";

        for(int i = 0; i<inp.length(); i++){
            result += inp.charAt(inp.length()-i-1);
        }
        System.out.println(result);
        sc.close();
    }
}
