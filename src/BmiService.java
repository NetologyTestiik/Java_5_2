public class BmiService {
    public int calculate(double meters, int kilograms){
        double index = (kilograms / (meters * meters));
        return (int) index;
    }
}
