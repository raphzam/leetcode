package strings;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();

        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (seen.containsKey(ch)) {
                count = 0;
                i = seen.get(ch) + 1;
                ch = s.charAt(i);
                seen.clear();
            }
            seen.put(ch, i);
            count++;

            if (max < count) max = count;
        }
        return max;
    }
}
