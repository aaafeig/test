public class Main {
    public static void main(String[] args) {
    // 1
    byte clientOS = 0;
    if (clientOS == 0)
        System.out.println("Установите версию приложения для iOS по ссылке");
    else
        System.out.println("Установите версию приложения для Android по ссылке");
    //2
    short clientDeviceYear = 2015;
    if (clientOS == 0 && clientDeviceYear < 2015)
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    else if (clientOS == 0 && clientDeviceYear >= 2015)
        System.out.println("Установите версию приложения для iOS по ссылке");
    else if (clientOS == 1 && clientDeviceYear < 2015)
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    else
        System.out.println("Установите версию приложения для Android по ссылке");
    // 3
    short year = 1600;
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        System.out.println(year + " год является високосным");
    else
        System.out.println(year + " год не является високосным");
    //4
    int deliveryDistance = 95;
    short countDays = 0;
    if (deliveryDistance <= 20)
        countDays = 1;
    else if (deliveryDistance > 20 && deliveryDistance <= 60)
        countDays = 2;
    else if (deliveryDistance > 60 && deliveryDistance <= 100)
        countDays = 3;
    else if (deliveryDistance > 100)
        System.out.println("Доставки нет");

    System.out.println("Потребуется дней: " + countDays);
    // 5
    byte monthNumber = 13;
    if (monthNumber <= 12)
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
        }
    else
        System.out.println("Введите корректный номер месяца");

    }
}