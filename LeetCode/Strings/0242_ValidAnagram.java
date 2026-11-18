class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       char[] ch1=s.toCharArray();
       Arrays.sort(ch1);
       String s1=new String(ch1);

       char[] ch2=t.toCharArray();
       Arrays.sort(ch2);
       String t1=new String(ch2);

       return s1.equals(t1);
    }
}