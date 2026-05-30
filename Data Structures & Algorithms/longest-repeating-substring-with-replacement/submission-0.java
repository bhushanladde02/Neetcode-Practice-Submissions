class Solution {
    public int characterReplacement(String s, int k) {
        int[] cache = new int[26];
        int l = 0, r = 0, max = 0, maxOcc = 0;
        for(r=0; r<s.length(); r++){
            cache[s.charAt(r)-'A']++;
            maxOcc = Math.max(maxOcc, cache[s.charAt(r)-'A']);
            if((r-l+1)-maxOcc > k){
                cache[s.charAt(l)-'A']--;
                l++;
            }
            max = Math.max(r-l+1, max);
        }
        return max;
    }
}
