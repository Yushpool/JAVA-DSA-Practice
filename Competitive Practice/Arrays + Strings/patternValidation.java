// Problem Statement
// A printing press in DiceCity uses a special machine to print colors on blank sheets of paper. The machine operates on pairs of neighboring sheets and can print in one of two color combinations:

// "BR": Changes two neighboring blank sheets to blue (B) and red (R).
// "RB": Changes two neighboring blank sheets to red (R) and blue (B).
// Each operation of the machine modifies the colors of the two adjacent sheets beneath it.

// Input Format
// The first line of the input contains a single integer T denoting the number of test cases.

// The first line of each test case contains an integer N denoting the length of the sequence that is to be printed.

// The second line of each test case contains a string s denoting the sequence of colors that is to be printed on the sheets. It is guaranteed that the length of s is N and that s only consists of the characters W, R, and B.

// Output Format
// For each test case, output a single line containing "YES" if the target sequence can be printed, or "NO" if it cannot be.

// Constraints
// 1 ≤ T ≤ 10^4
// 1 ≤ N ≤ 10^5

// Sample Testcase 0
// Testcase Input
// 2
// 3
// RBR
// 1
// B
// Testcase Output
// YES
// NO

import java.util.Scanner;

public class patternValidation {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            String str = sc.next();
            if (str.length() != N) {
                System.out.println("NO");
                continue;
            }

            if (str.length() >= 2) {
                String[] segments = str.split("W");

                boolean valid = true;

                for (String seg : segments) {
                    if (seg.length() == 0)
                        continue;

                    boolean hasR = seg.contains("R");
                    boolean hasB = seg.contains("B");

                    if (!(hasR && hasB)) {
                        valid = false;
                        break;
                    }
                }

                if (valid)
                    System.out.println("YES");
                else
                    System.out.println("NO");

            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

}
