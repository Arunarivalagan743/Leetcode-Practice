//
//3105. Longest Strictly Increasing or Strictly Decreasing Subarray
//        Solved
//Easy
//        Topics
//Companies
//
//You are given an array of integers nums. Return the length of the longest
//of nums which is either or
//
//.
//
//
//
//Example 1:
//
//Input: nums = [1,4,3,3,2]
//
//Output: 2
//
//Explanation:
//
//The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].
//
//The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].
//
//Hence, we return 2.
//
//Example 2:
//
//Input: nums = [3,3,3,3]
//
//Output: 1
//
//Explanation:
//
//The strictly increasing subarrays of nums are [3], [3], [3], and [3].
//
//The strictly decreasing subarrays of nums are [3], [3], [3], and [3].
//
//Hence, we return 1.
//
//Example 3:
//
//Input: nums = [3,2,1]
//
//Output: 3
//
//Explanation:
//
//The strictly increasing subarrays of nums are [3], [2], and [1].
//
//The strictly decreasing subarrays of nums are [3], [2], [1], [3,2], [2,1], and [3,2,1].
//
//Hence, we return 3.
//
//
//
//Constraints:
//
//        1 <= nums.length <= 50
//        1 <= nums[i] <= 50

class StrictIncreasingAndDecreasing {
    public int longestMonotonicSubarray(int[] nums) {
        int len = nums.length;
        int ans = 0, max = 1, min = 1;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                max++;
            } else if (true) {
                if (ans < max)
                    ans = max;
                max = 1;
            }
            if (nums[i] > nums[i + 1]) {
                min++;
            } else if (true) {
                if (ans < min)
                    ans = min;
                min = 1;
            }
        }
        if (ans < min)
            ans = min;
        if (ans < max)
            ans = max;
        return ans;
    }
}
