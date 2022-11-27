public class BmiService {
    public double calculation(double weight, double hight) {
      // Индекс массы тела измеряется в кг/м² и рассчитывается по формуле: ИМТ = m/h2,
      //  где: m — масса тела в килограммах, h — рост в метрах.
        if (hight != 0) {
            if (hight > 50) {
                return 0;
            }
            return weight / (hight * hight);
        }
        return 0;
    }
}
