class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        Hashtable<Character,Integer> hs = new Hashtable<>();
        Hashtable<Character,Integer> ht = new Hashtable<>();
        int i=0;
        System.out.println(hs.get('a'));
        while(i<s.length()){
            if( (hs.get(s.charAt(i))==null) && (ht.get(s.charAt(i))==null)){
                hs.put(s.charAt(i),1);
                ht.put(t.charAt(i),1);
            }else if((hs.get(s.charAt(i))==null)){
                hs.put(s.charAt(i),1);
            }else if((ht.get(t.charAt(i))==null)){
                ht.put(t.charAt(i),1);
            }else{
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
                ht.put(t.charAt(i),ht.get(t.charAt(i))+1);

            }
            i++;
        }
        for(Character j : hs.keySet()){
            if(ht.get(j)!=hs.get(j)){
                return false;
            }
        }

         return true;

    }
}
