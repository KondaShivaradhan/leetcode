import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.keySet().contains(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> jj : map.entrySet()) {
            q.add(jj);
        }
          for (Map.Entry<Integer,Integer> x : q) {
            // System.err.println(x);
        }
        int[] output = new int[k];
        while (k != 0) {
            // Map.Entry<Integer, Integer> z = q.poll();
            // System.out.println(q.poll().getKey());
            output[k - 1] = q.poll().getKey();
            k--;
            
        }
        for (int x : output) {
            System.err.println(x);
        }
        return output;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.topKFrequent(new int[]{1,1,12,2,3,4}, 2);
    }
}