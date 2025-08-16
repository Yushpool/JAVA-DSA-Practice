// Problem Statement
// You wish to help Ashish, who possesses a collection of N strings, some of which may be duplicated, and has been assigned the task of finding the kth unique string.

// If the number of unique strings is less than k, he needs to display -1. Considering you are Ashish's best friend can you assist him with this challenge?

// Input Format
// The first line contains an integer N denoting the number of strings.

// The next N lines contain strings.

// The next line contains an integer k.

// Output Format
// The output contains the kth distinct string. If there are less than k unique string display -1.

// From the way it’s described, the problem is essentially:

// “K-th Unique String”

// Some platforms might phrase it slightly differently, like:

// Find the K-th distinct string

// K-th non-repeating string
// K-th distinct element in an array of strings
// But the core idea is always the same: given N strings, return the K-th string that appears exactly once (distinct), or -1 if fewer than K exist.

import java.util.*;

public class kthUniqueStr {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();

        }

        int k = sc.nextInt();

        HashMap<String, Integer> mp = new HashMap<>();
        for(String str : arr){
            mp.put(str, mp.getOrDefault(str, 0)+1);
        }

        ArrayList<String> uniquelist = new ArrayList<>();
        for(String str : arr){
            if(mp.get(str) == 1){
                uniquelist.add(str);
            }
        }

        if(uniquelist.size() >= k){
            System.out.println(uniquelist.get(k-1));
        }else{
            System.out.println(-1);
        }



    }

}
