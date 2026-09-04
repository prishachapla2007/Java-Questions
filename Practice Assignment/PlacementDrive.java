import java.util.Arrays;

public class PlacementDrive {
    static class Candidate implements Comparable<Candidate> {
        String name; double cgpa; int score;

        Candidate(String n, double c, int s) {
            name = n; cgpa = c; score = s;
        }

        static boolean isEligible(double c) {
            return c >= 7.5;
        }

        static boolean isEligible(double c, int s) {
            return c >= 6.5 && s >= 60;
        }

        public int compareTo(Candidate x) {
            return Double.compare(
                x.cgpa * 10 + x.score * .5,
                cgpa * 10 + score * .5);
        }

        static String shortlistAndRank(Candidate[] a) {
            Candidate[] b = new Candidate[a.length];
            int n = 0;

            for (Candidate c : a)
                if (isEligible(c.cgpa) || isEligible(c.cgpa,c.score))
                    b[n++] = c;

            b = Arrays.copyOf(b,n);
            Arrays.sort(b);

            String s = "";
            for (int i = 0; i < n; i++) {
                if (i > 0) s += " | ";
                s += (i+1) + ". " + b[i].name + " (" +
                     (b[i].cgpa*10+b[i].score*.5) + ")";
            }
            return s;
        }
    }

    public static void main(String[] args) {
        Candidate[] a = {
            new Candidate("Aisha",8.2,40),
            new Candidate("Rohit",6.8,65),
            new Candidate("Meena",6.0,90),
            new Candidate("Karan",7.5,20)
        };
        System.out.println(Candidate.shortlistAndRank(a));
    }
}