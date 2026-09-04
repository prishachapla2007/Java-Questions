import java.util.Arrays;

public class RotateArray {
    public static int[] rotateArray(int[] nums, int k) {
        k %= nums.length;
        int[] r = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            r[(i + k) % nums.length] = nums[i];

        return r;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)
        ));
    }
}