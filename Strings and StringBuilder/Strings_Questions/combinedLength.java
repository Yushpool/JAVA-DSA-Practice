import java.util.*;

public class combinedLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];
        int totaLength = 0;

        for(int i = 0; i<size; i++){
            arr[i] = sc.next();
            totaLength += arr[i].length();
        }
        System.out.println(totaLength);
        sc.close();
    }
    
}
