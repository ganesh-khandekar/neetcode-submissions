class Solution {
    boolean check (int n,int[] p,int h){
        int count=0;
        for (int i=0;i<p.length;i++){
            if(p[i]<= n){
                count++;
            }else if (p[i]%n==0){
                count=count +(p[i]/n);
            }else{
                count=count +(p[i]/n) ;
                count++; 
            }
        }
        if ( h<count){
            return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int j = Arrays.stream(piles).max().getAsInt(),i=0;
        int mid =0;
        // binary search 
        while(i<j){
            mid = i+((j-i)/2);
            if(check(mid,piles,h)){
                j=mid;
            }else{
                i=mid+1;
            }
        }
        return i;
    }
}
