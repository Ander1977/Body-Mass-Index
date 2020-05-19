public class BmiService {
    public double calculate() {
        double weigh = 80;
        double height = 1.8;
        double bmi = weigh / (height * height);
        return bmi;
    }
}

