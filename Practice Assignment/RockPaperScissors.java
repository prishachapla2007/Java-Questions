public class RockPaperScissors {

    static String check(String p, String c) {
        if (p.equals(c))
            return "Draw";

        if ((p.equals("Rock") && c.equals("Scissors")) ||
            (p.equals("Paper") && c.equals("Rock")) ||
            (p.equals("Scissors") && c.equals("Paper")))
            return "Player Wins";

        return "Computer Wins";
    }

    public static void main(String[] args) {
        String[] player = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        String[] computer = {"Scissors", "Rock", "Rock", "Rock", "Scissors"};

        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < 5; i++) {
            String result = check(player[i], computer[i]);
            System.out.println(result);

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
    }
}