class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1A = new int[26];
        s1.chars().forEach(n->s1A[n-'a']++);

        for(int i = 0 ; i < s2.length(); i++){
            for(int j = i ; j < s2.length(); j++){
                int[] s2A = new int[26];
                String subString = s2.substring(i, j+1);
                subString.chars().forEach(n->s2A[n-'a']++);
                if(Arrays.equals(s1A, s2A)){
                    return true;
                }
            }
        }
        return false;
    }
}
