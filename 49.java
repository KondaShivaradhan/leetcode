import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
	      Map<String,List<String>> bucet = new HashMap<String,List<String>>();
	        for( String s : strs) {
	        	char[] sa = s.toCharArray();
	        	Arrays.sort(sa);
	        	if(!bucet.containsKey(new String(sa)))
	        		bucet.put(new String(sa), new ArrayList<>());
	        	bucet.get(new String(sa)).add(s);
	        }
	        return new ArrayList<>(bucet.values());
	    }
}