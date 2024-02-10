import java.util.Arrays;

// concept is to do recursion
class Solution {

  public int[] productExceptSelf(int[] nums) {
    int numsLength = nums.length;
    int prefixProduct = 1;
    int suffixProduct = 1;
    int[] result = new int[numsLength];
    int[] prefixArray = new int[numsLength];
    for (int i = 0; i < nums.length; i++) {
      prefixArray[i] = prefixProduct * nums[i];
      prefixProduct = prefixArray[i];
    }

    // printHorizontal(prefixArray);
    int[] PostFixArray = new int[numsLength];

    for (int i = numsLength - 1; i >= 0; i--) {
      PostFixArray[i] = suffixProduct * nums[i];
      suffixProduct = PostFixArray[i];
    }
    // printHorizontal(PostFixArray);
    for (int i = 0; i < result.length - 1; i++) {
      if (i == 0) {
        result[i] = 1 * PostFixArray[i + 1];
      } else {
        result[i] = prefixArray[i - 1] * PostFixArray[1 + i];
      }
    }
    result[numsLength - 1] = prefixArray[numsLength - 1 - 1] * 1;
    System.gc();
    return result;
  }

  public static void printHorizontal(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(", "); // Add a comma and space if not the last element
      }
    }
    System.out.println(); // Move to the next line after printing the array
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    printHorizontal(s.productExceptSelf(new int[] { 1, 2, 3, 4 }));
  }
}
