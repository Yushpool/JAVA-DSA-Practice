package MediumHardQs;

public class tilesProblem {

    public static int tileWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // Place a tile vertically
        int vertical = tileWays(n - 1);
        
        // Place a tile horizontally (requires two tiles)
        int horizontal = (n >= 2) ? tileWays(n - 2) : 0;

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4; // Length of the floor
        System.out.println(tileWays(n));
    }
    
}
