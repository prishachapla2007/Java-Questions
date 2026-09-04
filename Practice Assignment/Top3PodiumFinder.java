import java.util.Arrays;

public class Top3PodiumFinder {

    static int[] findTopThreeScores(int[] scores) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int n : scores) {
            if (n >= first) {
                third = second;
                second = first;
                first = n;
            } else if (n >= second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }

        return new int[]{first, second, third};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            findTopThreeScores(new int[]{45, 82, 79, 90, 33, 90, 61})
        ));
    }
}