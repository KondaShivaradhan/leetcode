import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
      char[] Arrs = s.toCharArray();
	        char[] Arry = t.toCharArray();
	        Arrays.sort(Arrs);
	        Arrays.sort(Arry);
	        if(Arrays.equals(Arrs,Arry)) {
	        	return true;
	        }
	        	return false;	
	        
    }
}