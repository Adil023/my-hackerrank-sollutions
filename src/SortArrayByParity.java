class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0; // 1
        int j = nums.length - 1; // 1
        while (i < j) {
            if (nums[i] % 2 > nums[j] % 2) {
                int temp = nums[i]; // 5
                nums[i] = nums[j]; // 2
                nums[j] = temp; // 5
            }

            if (nums[i] % 2 == 0) i++;
            if (nums[j] % 2 == 1) j--;
        }

        return nums;
    }
}
