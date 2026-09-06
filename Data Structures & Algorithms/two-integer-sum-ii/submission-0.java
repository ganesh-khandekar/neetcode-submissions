class Solution {
    public int[] twoSum(int[] numbers, int t) {
        int i = 0 , j = numbers.length-1 ;
        Boolean flag =  false; 

        while(i < j){
            int val = numbers[i] + numbers[j];
            if(val == t){
                flag=true;
                // System.out.println("val :"+val+ " , t :"+t+" ,i :"+i+" ,j :"+j+"->1");
                break;
            }else if (val > t){
                // System.out.println("val :"+val+ " , t :"+t+" ,i :"+i+" ,j :"+j+"->2");
                j--;
            }else{
                // System.out.println("val :"+val+ " , t :"+t+" ,i :"+i+" ,j :"+j+"->3");
                i++;
            }
        }
        if(flag){
            int[] n ={i+1,j+1};
            return n;
        }
        int[] n ={};
        return n;
    }
}
