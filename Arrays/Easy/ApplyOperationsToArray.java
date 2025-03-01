import java.util.Arrays;

public class ApplyOperationsToArray {
    public static void main(String[] args) {
        int[] numsArray = {1, 2, 2, 1, 1, 0};
        System.out.println(Arrays.toString(applyOperations(numsArray)));
    }

    public static int[] applyOperations(int[] nums) {
        // Step 1: Apply the doubling operation
        for (int i = 0; i < nums.length - 1; i++) {  // Fix: Prevent out-of-bounds
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Move non-zero elements forward
        int index = 0; // Position to place non-zero elements
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[index++] = nums[j];
            }
        }

        // Step 3: Fill the remaining positions with zero
        while (index < nums.length) {
            nums[index++] = 0;
        }

        return nums;
    }
}
