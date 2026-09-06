class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length()!=t.length()){
            return false;
        }
        int i=0;
        Hashtable<Character,Integer> hs = new Hashtable<>();
        Hashtable<Character,Integer> ht = new Hashtable<>();

        while(i<s.length()){
            if( (hs.get(s.charAt(i))==null) && (ht.get(t.charAt(i))==null)){
                hs.put(s.charAt(i),1);
                ht.put(t.charAt(i),1);
               
            }else if((hs.get(s.charAt(i))==null)){
                hs.put(s.charAt(i),1);
                ht.put(t.charAt(i),ht.get(t.charAt(i))+1);
                
            }else if((ht.get(t.charAt(i))==null)){
                ht.put(t.charAt(i),1);
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
               
            }else{
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
                ht.put(t.charAt(i),ht.get(t.charAt(i))+1);
                
            }
            i++;
        }
          System.out.println(ht);
          System.out.println(hs);
          System.out.println();

        for(Character j : hs.keySet()){
            if(hs.get(j)==null||ht.get(j)==null){
                return false;
            }
            int a= (int) hs.get(j);
            int b= (int) ht.get(j);
          System.out.println("ht : "+a+" , hs : "+b+ " , val :"+j);
            if(a != b){
                return false;
            }
        }

         return true;
    }
}
