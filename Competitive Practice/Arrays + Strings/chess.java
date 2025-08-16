//Above is the standard representation of a chessboard.

// This could be imagined as a 2D cartesian plane, with the x axis being represented by the alphabets and y axis by the numbers.

// Given coordinates in the form of string, print if that cell is white or black.

// Input Format
// First line contains a string s.

// Output Format
// White or Black.

import java.util.Scanner;

public class chess {

    public static String determineColor(String s) {
        // Write your logic here to determine the color based on the string s.
        // Return "Black" or "White" based on the problem statement.

        char letter = Character.toLowerCase(s.charAt(0));
        char num = s.charAt(1);

        int rank = num - '0';
        int file = (letter - 'a')+1;

        int sum = rank + file;

        if(sum % 2 == 0){
            return "Black";
        }else{
            return "White";
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);

        scanner.close();
    }
}

    

