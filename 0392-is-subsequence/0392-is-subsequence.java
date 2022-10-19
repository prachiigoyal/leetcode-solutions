class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }else if(t.length()<s.length()){
            return false;
        }
        int i=0;
        int j=0;
        while(j<t.length()){
            char ch=t.charAt(j);
            if(ch==s.charAt(i)){
                i++;
                if(i==s.length()){
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}