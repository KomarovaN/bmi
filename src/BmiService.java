public class BmiService {
    public double calculation(double weight, double height) {
      // Индекс массы тела измеряется в кг/м² и рассчитывается по формуле: ИМТ = m/h2,
      //  где: m — масса тела в килограммах, h — рост в метрах.
        if (height != 0) {
            if (height > 50) {
                return 0;
            }
            return weight / (height * height);
        }
        return 0;
    }
}
