class Solution {
    //idx -> digits ke letters ko traverse kar rha hai
    HashMap<Character, String> map = new HashMap<>();

    private void solve(String digits, int idx, StringBuilder temp, List<String> ans){
        int n = digits.length();
        
        if(idx >= n){
           ans.add(temp.toString());
           return;
        }

        char ch = digits.charAt(idx);
        String str = map.get(ch);

        for(int i=0; i<str.length(); i++){
            temp.append(str.charAt(i));
            solve(digits, idx + 1, temp, ans);
            temp.deleteCharAt(temp.length() - 1);
        }
    
    }

    public List<String> letterCombinations(String digits) {
        int  n = digits.length();
        if(n == 0)         return new ArrayList<>();

        List<String> ans = new ArrayList<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve(digits, 0, new StringBuilder(""), ans);
        return ans;
    }
}