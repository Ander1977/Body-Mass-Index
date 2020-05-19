public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weigh = 85;
        double height = 1.8;
        double bmi = service.calculate(weigh, height);
        System.out.println(bmi);
    }
}

