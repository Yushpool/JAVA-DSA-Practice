import java.util.*;

public class EmailTo_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email:" + " ");
        String email = sc.next();
        String result = "";

        for(int i = 0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                result += email.charAt(i);
            }
        }
        sc.close();
        System.out.println("Your Username: "+ result);
    }
    
}

