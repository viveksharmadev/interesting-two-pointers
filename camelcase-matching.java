// https://leetcode.com/problems/camelcase-matching/
class camelcase-matching {
    //I think, tc -> m(queries)*n(query) + k(pattern), sc-> m(queries)
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new LinkedList<>();
        for(String query : queries){
            boolean isMatch = doesMatch(query, pattern);
            res.add(isMatch);
        }
        return res;
    }
    
    private boolean doesMatch(String query, String pattern){
        int j = 0;
        for(int i=0; i<query.length(); i++){
            if(j<pattern.length() && query.charAt(i)==pattern.charAt(j)){
                j++;
            }else if(Character.isUpperCase(query.charAt(i))){
                return false;
            }
        }
        return j==pattern.length();
    }
}
