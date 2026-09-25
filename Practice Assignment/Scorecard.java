public class Scorecard {
    private boolean[] answers;
    private int count;

    Scorecard(int n) {
        answers = new boolean[n];
    }

    void answer(boolean correct) {
        answers[count++] = correct;
    }

    int getScore() {
        int s = 0;
        for (boolean x : answers)
            if (x) s++;
        return s;
    }

    public static void main(String[] args) {
        Scorecard s = new Scorecard(3);
        s.answer(true);
        s.answer(false);
        s.answer(true);
        System.out.println(s.getScore());
    }
}