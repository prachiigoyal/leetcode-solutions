class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp=new boolean[p.length()+1][s.length()+1];
        for(int i=0;i<=p.length();i++){
            for(int j=0;j<=s.length();j++){
                if(i==0 && j==0){
                    dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=false;
                }else if(j==0){
                    // boolean flag=true;
                    // for(int ii=0;ii<i;ii++){
                    //     if(p.charAt(ii)!='*'){
                    //         flag=false;
                    //         break;
                    //     }
                    // }
                    // dp[i][j]=flag;
                    if(i>=1 && p.charAt(i-1)=='*'){
                        dp[i][j]=dp[i-1][j];
                    }else{
                        dp[i][j]=false;
                    }
                }else{
                    char pc=p.charAt(i-1);
                    char sc=s.charAt(j-1);
                    
                    if(pc==sc || pc=='?'){
                        dp[i][j]=dp[i-1][j-1];
                    }else if(pc=='*'){
                        dp[i][j]=dp[i-1][j] || dp[i][j-1];
                    }else{
                        dp[i][j]=false;
                    }
                }
            }
        }
        return dp[p.length()][s.length()];
    }
}