class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.size()==0){
                    st.push(i);
                }else{
                    int len=i-st.peek();
                    max=Math.max(len,max);
                }
            }
        }
        return max;
    }
}