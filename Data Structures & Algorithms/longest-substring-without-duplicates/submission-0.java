class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Sliding Window ...
        int n = s.length();

        Set<Character> set = new HashSet<>();

        int i = 0;
        int ans = 0;

        for(int j=0; j<n; j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;           //Window Shrink Step ....
            }

            set.add(s.charAt(j));
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}
