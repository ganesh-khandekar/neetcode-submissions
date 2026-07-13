class Solution {
    public int hammingWeight(int n) {
        byte c =0;
        while(n!=0){
            n=n&(n-1);
            c++;
        }
        return c;
    }
}
