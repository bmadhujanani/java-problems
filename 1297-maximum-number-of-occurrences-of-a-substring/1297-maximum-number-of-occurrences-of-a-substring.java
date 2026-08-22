class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        HashMap<Character, Integer> freq = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // Keep window size = minSize
            if (right - left + 1 > minSize) {
                char remove = s.charAt(left);

                freq.put(remove, freq.get(remove) - 1);

                if (freq.get(remove) == 0) {
                    freq.remove(remove);
                }

                left++;
            }

            // Check valid window
            if (right - left + 1 == minSize &&
                freq.size() <= maxLetters) {

                String sub = s.substring(left, right + 1);

                int count = map.getOrDefault(sub, 0) + 1;
                map.put(sub, count);

                max = Math.max(max, count);
            }
        }

        return max;
    }
}