package MediumHardQs;

public class removeDuplOpt {

    public static void removeD(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a']) {
            // Character already exists, skip it
            removeD(str, idx + 1, newStr, map);
        } else {
            // Character not seen before, include it
            map[currentChar - 'a'] = true;
            newStr.append(currentChar);
            removeD(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        String str = "marrymebaby";
        removeD(str, 0, new StringBuilder(), new boolean [26]);
       
        
    }
    
}
