class Solution {
    private List<String> res =new ArrayList<>();
    private int stack=0;
    void travel(int n,String s,int num){
        if(num<0||num>stack||n<0){
            return;
        }
        if(num==0&&s.length()==(2*stack)&&!res.contains(s)){
            res.add(s);
        }
        travel((n-1),(s+"("),(num+1));
        travel((n-1),(s+")"),(num-1));
    }
    public List<String> generateParenthesis(int n) {
        stack=n;
        travel((n*2),"",0);
        return res;
    }
}