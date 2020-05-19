public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weigh;
        double height;
        double bmi = service.calculate(weigh = 85, height = 1.8);
        System.out.println(bmi);
    }
}

