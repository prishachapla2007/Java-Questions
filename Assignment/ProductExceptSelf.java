import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];
        int left = 1, right = 1;

        for (int i = 0; i < nums.length; i++) {
            r[i] = left;
            left *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            r[i] *= right;
            right *= nums[i];
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            productExceptSelf(new int[]{1, 2, 3, 4})
        ));
    }
}