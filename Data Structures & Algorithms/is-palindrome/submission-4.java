class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0; 
        int j = s.length()-1;

        while(i<=j){
            while( i< s.length() && !(('A'<=s.charAt(i) && s.charAt(i)<='Z') || ('a'<=s.charAt(i) && s.charAt(i)<='z') || ('0'<=s.charAt(i) && s.charAt(i)<='9'))){
                i++;
            }

            while(j>=0 && !(('A'<=s.charAt(j) && s.charAt(j)<='Z') || ('a'<=s.charAt(j) && s.charAt(j)<='z') || ('0'<=s.charAt(j) && s.charAt(j)<='9'))){
                j--;
            }
            if(i< s.length() && j>=0 && s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                break;
            }
            
        }

        return i>=j;    
    }
}
