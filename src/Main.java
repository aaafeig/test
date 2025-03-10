public class Main {
    public static void main(String[] args) {
        // 1
        int month = 0;
        int count = 0;
        while (count <= 2459000) {
            count += 15000;
            month += 1;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + count + " рублей");
        }
        // 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.print("\n");
        for (i = 10; i != 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        // 3
        int countPeople = 12_000_000;
        int countYear = 0;
        int birthRate = 17 - 8;
        while (countYear != 10){
            countYear ++;
            countPeople += ((countPeople / 1_000) * birthRate);
            System.out.println("Год " + countYear + ", численность населения составляет " + countPeople);
        }
        // 4
        int Bank = 15000;
        int count_month = 0;
        while (Bank <= 12000000){
            Bank += Bank * 7 / 100;
            count_month++;
            System.out.println("Месяц " + count_month + " , сумма накоплений равна " + Bank + " рублей");
        }
        // 5
        Bank = 15000;
        count_month = 0;
        while (Bank <= 12000000){
            Bank += Bank * 7 / 100;
            count_month++;
            if (count_month % 6 == 0)
                System.out.println("Месяц " + count_month + " , сумма накоплений равна " + Bank + " рублей");
        }
        // 6
        Bank = 15000;
        count_month = 0;
        float countYears = 0f;
        while (countYears != 9){
            Bank += Bank * 7 / 100;
            count_month++;
            if (count_month % 6 == 0) {
                countYears += 0.5f;
                System.out.println("Месяц " + count_month + " , сумма накоплений равна " + Bank + " рублей");
            }
        }
        // 7
        int friday = 7;
        int monthDays = 0;
        int weeks = 0;
        while (monthDays <= 31) {
            if (monthDays == friday) {
                System.out.println("Сегодня пятница, " + monthDays + "-е число. Необходимо подготовить отчет");
            }
            else if (monthDays == friday + weeks){
                System.out.println("Сегодня пятница, " + monthDays + "-е число. Необходимо подготовить отчет");
            }
            monthDays += 1;

            if (monthDays % 7 == 0 && friday != 7) {
                weeks +=7;
            }
            else if (monthDays >= 8 && friday % 7 == 0){
                friday += 7;
                monthDays = friday;
            }
        }
        // 8
        int thisYear = 2025;
        int comet = 79;
        while (comet < thisYear + 100){
            comet += 79;
            if (comet > thisYear - 200 && comet < thisYear + 100){
                System.out.println(comet);
            }
        }
    }
}
