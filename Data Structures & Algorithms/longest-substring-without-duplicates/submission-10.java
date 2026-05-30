class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0;
        int length = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i))+1); 
            }
            
            length = Math.max(length, (i-left) +1);
            map.put(s.charAt(i), i);;
        }

        return  length;
    }
}
