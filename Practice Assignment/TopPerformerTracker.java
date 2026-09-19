public class TopPerformerTracker {
    static String findMinMaxSpread(int[] a) {
        int min = a[0], max = a[0];

        for (int n : a) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return "Min: " + min + " | Max: " + max +
               " | Spread: " + (max - min);
    }

    public static void main(String[] args) {
        System.out.println(findMinMaxSpread(
            new int[]{45, 82, 79, 90, 33, 90, 61}));
    }
}