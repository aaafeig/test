public class Main {
    public static void main(String[] args) {
    float weightLoss500 = 0.5f;
    float weightLoss250 = 0.250f;
    byte weight = 7;
    System.out.println("Спортсмену потребуется " + ((weight / weightLoss500) + (weight / weightLoss250)) / 2 + " дней в среднем");
    }
}