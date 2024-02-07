import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {
          int[] x = {-1, -2};
            ArrayList<Integer> mapp = new ArrayList(); 
            for (int z :nums) {
            	mapp.add(z);
            }
           for (int i = 1; i <=target/2; i++) {
			if(mapp.indexOf(i)!=mapp.indexOf(target-i) && mapp.contains(i) && mapp.contains(target-i)  ) {
			
			return new int[] {mapp.indexOf(i),mapp.indexOf(target-i)};
			};
				}
           return x;
    }
}