public class Main {
    public static void main(String[] args) {
        double weight = 62.5;
        double height = 1.7;
        BmiService service = new BmiService();
        double bmi = service.calculation(weight, height);
        if (bmi == 0) {
            System.out.println("Введите рост в метрах.");
        }
        else {
            System.out.println("Ваш индекс маccы тела " + String.format("%.2f", bmi) + " кг/кв.м");
        }
    }
}