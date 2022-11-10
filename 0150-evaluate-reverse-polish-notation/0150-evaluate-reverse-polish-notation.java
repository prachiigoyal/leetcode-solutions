class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token=tokens[i];
            if(isNumeric(token)){
                st.push(Integer.parseInt(token));
            }else{
                int val2=st.pop();
                int val1=st.pop();
                
                if(token.equals("+")){
                    st.push(val1+val2);
                }else if(token.equals("-")){
                    st.push(val1-val2);
                }else if(token.equals("*")){
                    st.push(val1*val2);
                }else{
                    st.push(val1/val2);
                }
            }
        }
        return st.pop();
    }
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}