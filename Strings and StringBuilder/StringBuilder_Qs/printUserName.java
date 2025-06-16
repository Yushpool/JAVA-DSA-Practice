// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

import java.util.*;

public class printUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        StringBuilder sb = new StringBuilder(sc.next());

        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) == '@'){
                sb.delete(i, sb.length());
            }
        }
        System.out.println(sb);
        sc.close();


        
    }
    
}
