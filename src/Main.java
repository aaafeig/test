public class Main {
    public static void main(String[] args) {
        float percent = 0.1f;
        int salaryMasha = 67760;
    System.out.println("Маша теперь получает " + (salaryMasha * percent + salaryMasha) + " рублей. Годовой доход вырос на " + ((salaryMasha * percent + salaryMasha) - salaryMasha) * 12 + " рублей");
    int salaryDen = 83690;
        System.out.println("Денис теперь получает " + (salaryDen * percent + salaryDen) + " рублей. Годовой доход вырос на " + ((salaryDen * percent + salaryDen) - salaryDen) * 12 + " рублей");
    int salaryCris = 76230;
        System.out.println("Кристина теперь получает " + (salaryCris * percent + salaryCris) + " рублей. Годовой доход вырос на " + ((salaryCris * percent + salaryCris) - salaryCris) * 12 + " рублей");

    }
}