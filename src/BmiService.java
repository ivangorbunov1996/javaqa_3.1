public class BmiService {

    public int calculate(double weightInKg, double heightInMetrs) {
        double bmi = weightInKg / (heightInMetrs * heightInMetrs);
        return (int) bmi;
    }
}
