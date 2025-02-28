import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }
    public static int[] twoSum(int[] nums, int target) {
        int i = 0, j = 1;
        int[] index = new int[2];
        while((nums[i] + nums[j]) != target) {
            if (j != nums.length - 1) {
                j++;
            } else {
                i++;
                j = i + 1;
            }
        }
        index[0] = i;
        index[1] = j;
        return index;
    }
}