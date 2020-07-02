class Solution {
    public void reverseString(char[] s) {
        int n= s.length;
        for(int i = 0; i < n/2 ; i++){
            char b = s[n-1-i];
            char a = s[i];
            s[i] = b;
            s[n-1-i] = a;
        }
        return;
    }
}
