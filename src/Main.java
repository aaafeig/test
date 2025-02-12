public class Main {
    public static void main(String[] args) {
        //1
        byte apples = 8;
        System.out.println("Значение переменной apples с типом byte равно "+ apples);
        short potatoes = 20000;
        System.out.println("Значение переменной potatoes с типом short равно "+ potatoes);
        int moneys = 1000000;
        System.out.println("Значение переменной moneys с типом int равно "+ moneys);
        long people = 8000000000L;
        System.out.println("Значение переменной people с типом long равно "+ people);
        float something = 1.5f;
        System.out.println("Значение переменной something с типом float равно "+ something);
        double piNumber = 3.1415926535f;
        System.out.println("Значение переменной piNumber с типом double равно "+ piNumber);
        //2
        float number = 27.12f;
        long things = 987678965549L;
        short details = 2786;
        short numberPos = 569;
        short numbersNeg = -159;
        short cars = 27897;
        byte students = 67;
        //3
        short studentsLud = 23;
        short studentsAnna = 27;
        short studentsEkaterine = 30;
        short papers = 480;
        System.out.println("На каждого ученика рассчитано " + papers / (studentsAnna + studentsEkaterine + studentsLud) + " листов бумаги");
        //4
        byte bottles = 16;
        byte minutes = 2;
        System.out.println("За 20 минут машина произвела " + bottles / minutes * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottles / minutes * 1440 + " штук бутылок");
        System.out.println("За 3 сутка машина произвела " + (bottles / minutes * 1440) * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + ((bottles / minutes * 1440) * 3) * 30 + " штук бутылок");
        //5
        byte cansOfPaint = 120;
        byte whiteColoursOnClass = 2;
        byte brownColoursOnClass = 4;
        System.out.println("В школе, где " + cansOfPaint / (whiteColoursOnClass + brownColoursOnClass) + " классов, нужно " +
                whiteColoursOnClass * (cansOfPaint /( whiteColoursOnClass + brownColoursOnClass)) + " белой краски и " + brownColoursOnClass * (cansOfPaint / (whiteColoursOnClass + brownColoursOnClass)) +
                " банок коричневой краски");
        //6
        float weightBananas = 0.08f * 5;
        float weightMilks = 0.105f * 2;
        float weightIceCream = 0.100f * 2;
        float weightEggs = 0.070f * 4;
        System.out.println("Завтрак весит - " + (weightBananas + weightMilks + weightIceCream + weightEggs) + " килограмм");
        //7
        byte weight = 7;
        float weightLoss250 = 0.250f;
        //по 250 грамм
        System.out.println("Спортсмену потребуется " + weight/ weightLoss250 + " дней");
        //по 500 грамм
        float weightLoss500 = 0.5f;
        System.out.println("Спортсмену потребуется " + weight/ weightLoss500 + " дней");
        //средний срок похудения
        System.out.println("Спортсмену потребуется " + ( weight/ weightLoss250 + weight/ weightLoss500) / 2 + " дней в среднем");
        //8
        float percent = 0.1f;
        int salaryMasha = 67760;
        System.out.println("Маша теперь получает " + (salaryMasha * percent + salaryMasha) + " рублей. Годовой доход вырос на " + ((salaryMasha * percent + salaryMasha) - salaryMasha) * 12 + " рублей");
        int salaryDen = 83690;
        System.out.println("Денис теперь получает " + (salaryDen * percent + salaryDen) + " рублей. Годовой доход вырос на " + ((salaryDen * percent + salaryDen) - salaryDen) * 12 + " рублей");
        int salaryCris = 76230;
        System.out.println("Кристина теперь получает " + (salaryCris * percent + salaryCris) + " рублей. Годовой доход вырос на " + ((salaryCris * percent + salaryCris) - salaryCris) * 12 + " рублей");
    }
}