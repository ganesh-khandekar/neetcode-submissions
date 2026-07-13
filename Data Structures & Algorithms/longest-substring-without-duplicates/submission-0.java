class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer> table= new HashMap<>();
      int i=0,j=0,max=1;
      while (j!=s.length()){
        if(table.containsKey(s.charAt(j))){
            table.remove(s.charAt(i));
            i++;
        }else {
            
            table.put(s.charAt(j),1);
            j++;
            if(max<(j-i)){
                max=j-i;
            }
        }
      }
      return max;
    }
}
