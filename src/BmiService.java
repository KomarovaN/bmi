public class BmiService {
    public double calculation(double m, double h) {
      // Индекс массы тела измеряется в кг/м² и рассчитывается по формуле: ИМТ = m/h2,
      //  где: m — масса тела в килограммах, h — рост в метрах.
        if (h != 0) {
            if (h > 50) {
                return 0;
            }
            return m / (h * h);
        }
        return 0;
    }
}
