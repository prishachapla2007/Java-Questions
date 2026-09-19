import java.util.Arrays;

public class FantasyTeamScoreMultiplier {
    static void applyMultipliers(double[] a, int c, int v) {
        a[c] *= 2;
        a[v] *= 1.5;
    }

    public static void main(String[] args) {
        double[] a = {40, 55, 30, 62};
        applyMultipliers(a, 1, 3);
        System.out.println(Arrays.toString(a));
    }
}