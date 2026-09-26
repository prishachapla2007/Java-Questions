public class ExamGrader {

    static class Question {
        String correct, answer;
        double points;

        Question(String c, String a, double p) {
            correct = c;
            answer = a;
            points = p;
        }

        double score() {
            return 0;
        }
    }

    static class MCQ extends Question {
        MCQ(String c, String a, double p) {
            super(c, a, p);
        }

        double score() {
            return answer.equals(correct) ? points : 0;
        }
    }

    static class TrueFalse extends Question {
        TrueFalse(String c, String a, double p) {
            super(c, a, p);
        }

        double score() {
            return answer.equals(correct) ? points : 0;
        }
    }

    public static void main(String[] args) {
        Question[] questions = {
            new MCQ("Paris", "Paris", 10),
            new TrueFalse("False", "True", 5)
        };

        double total = 0;

        for (Question q : questions) {
            System.out.println(q.score());
            total += q.score();
        }

        System.out.println("Total: " + total);
    }
}