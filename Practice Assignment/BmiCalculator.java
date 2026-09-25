public class BmiCalculator {

    static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        double[] height = {1.75, 1.60, 1.80};
        double[] weight = {70, 90, 60};

        for (int i = 0; i < 3; i++) {
            double bmi = weight[i] / (height[i] * height[i]);
            System.out.println(bmi + " - " + status(bmi));
        }
    }
}