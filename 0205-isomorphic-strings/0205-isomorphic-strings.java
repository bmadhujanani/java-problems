import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> list1 = new HashMap<>();
        HashMap<Character, Character> list2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (list1.containsKey(ch1)) {
                if (list1.get(ch1) != ch2) {
                    return false;
                }
            } 
            else {
                list1.put(ch1, ch2);
            }

            if (list2.containsKey(ch2)) {
                if (list2.get(ch2) != ch1) {
                    return false;
                }
            } 
            else {
                list2.put(ch2, ch1);
            }
        }

        return true;
    }
}