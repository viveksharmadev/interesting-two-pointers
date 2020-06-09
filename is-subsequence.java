// https://leetcode.com/problems/is-subsequence/
class is-subsequence {
    // tc -> n, sc-> 1
    public boolean isSubsequence(String s, String t) {
        if(s==null || s.length()==0) return true;
        int i = 0, j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                if(s.length()==i) return true;
            }
            j++;
        }
        return false;
    }
}
