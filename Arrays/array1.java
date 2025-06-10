import java.util.*;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size  = sc.nextInt();
        float attr[] = new float[Size];
        
        for(int i = 0; i<Size; i++){
            System.out.println(attr[i]);
        }
        sc.close();
    }
}
