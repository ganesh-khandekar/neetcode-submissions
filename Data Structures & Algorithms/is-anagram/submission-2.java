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
            if( (hs.get(s.charAt(i))==null) && (ht.get(t.charAt(i))==null)){
                hs.put(s.charAt(i),1);
                ht.put(t.charAt(i),1);
                // System.out.println(hs +"  1");
                // System.out.println(ht +"  1");
                // System.out.println();
            }else if((hs.get(s.charAt(i))==null)){
                hs.put(s.charAt(i),1);
                // System.out.println(hs +"  2");
                // System.out.println(ht +"  2");
                // System.out.println();
            }else if((ht.get(t.charAt(i))==null)){
                ht.put(t.charAt(i),1);
                // System.out.println(hs +"  3");
                // System.out.println(ht +"  3");
                // System.out.println();
            }else{
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
                ht.put(t.charAt(i),ht.get(t.charAt(i))+1);
                // System.out.println(hs +"  4");
                // System.out.println(ht +"  4");
                // System.out.println();

            }
            i++;
        }
        // System.out.println(ht);
        // System.out.println(hs);

        for(Character j : hs.keySet()){
            if(ht.get(j)!=hs.get(j)){
                return false;
            }
        }

         return true;

    }
}
