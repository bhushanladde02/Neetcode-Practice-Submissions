class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1A = s1.toCharArray();
        char[] s2A = s2.toCharArray();
        Arrays.sort(s1A);

        for(int i = 0 ; i < s2.length(); i++){
            for(int j = i ; j < s2.length(); j++){
                char[] subArray = Arrays.copyOfRange(s2A, i, j+1);
                Arrays.sort(subArray);
                System.out.println(Arrays.toString(s1A) + " " + Arrays.toString(subArray));
                if(Arrays.equals(s1A, subArray)){
                    return true;
                }
            }
        }
        return false;
    }
}
