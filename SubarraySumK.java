public class SubarraySumK {
    public static void findSubarrayWithSum(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int currentSum = 0;

        for (end = 0; end < nums.length; end++) {
            currentSum += nums[end];

            while (currentSum > k && start <= end) {
                currentSum -= nums[start];
                start++;
            }

            if (currentSum == k) {
                System.out.println("Subarray with sum " + k + " is found between indices " + start + " and " + end);
                return;
            }
        }

        System.out.println("No subarray found with sum " + k);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 10;
        findSubarrayWithSum(nums, k);
    }
}
