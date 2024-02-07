import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
	    	for(int i =0; i<nums.length;i++) {
	    		if(s.contains(nums[i])) {
                    System.gc();
	    			return true;

	    		}
	    		s.add(nums[i]);
	    	}
	    	if(nums.length == s.size())
	    			return false;
	    	return true;

    }
}