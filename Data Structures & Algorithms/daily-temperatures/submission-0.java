class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int i=0,j=1;
        int[] arr = new int[temperatures.length];
        while(i<temperatures.length){
            if(j==temperatures.length){
                arr[i]=0;
                i++;
            }else if(temperatures[i]<temperatures[j]){
                arr[i]=j-i;
                i++;
                j=i+1;
            }else{
                j++;
            }
        }
        return arr;
    }
}
