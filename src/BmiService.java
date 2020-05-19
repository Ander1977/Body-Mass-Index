public class BmiService {
    public double calculate(double weigh, double height) {
        double bmi = weigh / (height * height);
        return bmi;
    }
}

