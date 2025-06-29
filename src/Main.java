public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meters = 1.87F;
        int kilograms = 98;
        int index = (int) service.calculate((float) meters,kilograms);
        System.out.println("Индекс:" + index);

    }
}