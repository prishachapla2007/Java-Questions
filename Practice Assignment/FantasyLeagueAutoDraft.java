import java.util.Arrays;

public class FantasyLeagueAutoDraft {
    static class Player implements Comparable<Player> {
        private String name;
        private int matches;
        private double avg;
        private boolean injured;

        public Player(String name, int matches, double avg, boolean injured) {
            this.name = name;
            this.matches = matches;
            this.avg = avg;
            this.injured = injured;
        }

        static boolean isDraftable(int m) {
            return m >= 10;
        }

        static boolean isDraftable(int m, boolean injured) {
            return m >= 5 && !injured;
        }

        public int compareTo(Player p) {
            return Double.compare(p.avg, avg);
        }

        static String draftAndRank(Player[] a) {
            Player[] b = Arrays.stream(a)
                .filter(p -> isDraftable(p.matches) ||
                             isDraftable(p.matches, p.injured))
                .toArray(Player[]::new);

            Arrays.sort(b);

            String s = "";
            for (int i = 0; i < b.length; i++)
                s += (i > 0 ? " | " : "") + (i + 1) + ". " + b[i].name;

            return s;
        }
    }

    public static void main(String[] args) {
        Player[] a = {
            new Player("Virat",15,48,false),
            new Player("Rahul",7,55,false),
            new Player("Sameer",3,60,false),
            new Player("Dev",12,20,true)
        };

        System.out.println(Player.draftAndRank(a));
    }
}