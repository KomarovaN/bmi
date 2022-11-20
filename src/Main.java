public class Main {
    public static void main(String[] args) {
        double weight = 62.5;
        double heigh = 1.7;
        BmiService service = new BmiService();
        double bmi = service.calculation(weight, heigh);
        if (bmi == 0) {
            System.out.println("Введите рост в метрах.");
        }
        else {
            System.out.println("Ваш индекс маccы тела " + String.format("%.2f", bmi) + " кг/кв.м");
        }
    }
}