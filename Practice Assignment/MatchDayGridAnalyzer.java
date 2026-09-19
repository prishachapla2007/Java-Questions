public class MatchDayGridAnalyzer {
    static double rowAverage(int[] a) {
        int s = 0;
        for (int n : a) s += n;
        return (double)s / a.length;
    }

    static String classifyMatches(int[][] a, int t) {
        String s = "";
        for (int i = 0; i < a.length; i++)
            s += (i > 0 ? " | " : "") + "Match " + i + ": " +
                 (rowAverage(a[i]) >= t ? "Power Surge" : "Normal");
        return s;
    }

    public static void main(String[] args) {
        int[][] a = {{4,6,8},{10,12,14},{2,3,1}};
        System.out.println(classifyMatches(a, 8));
    }
}