import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExcept(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Calculate left products and store in answer array
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Calculate right products and combine with left products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExcept(nums);
        System.out.println(Arrays.toString(result)); // Expected output: [24, 12, 8, 6]
    }
}
