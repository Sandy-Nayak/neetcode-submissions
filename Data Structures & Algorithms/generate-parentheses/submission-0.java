class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        gp(n,0,0,result, new StringBuilder());

        return result;
    }

    private static void gp(int n, int open, int close, List<String> result, StringBuilder sb){
        if(sb.length() == 2*n){
            result.add(sb.toString());
            return;
        }

        if(open < n){
            sb.append('(');
            gp(n, open+1, close, result, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(close < open){
            sb.append(')');
             gp(n, open, close+1, result, sb);
             sb.deleteCharAt(sb.length() - 1);
        }
    }
}
