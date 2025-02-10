public class Main {
    public static void main(String[] args) {
    byte bottles = 16;
    byte minutes = 2;
    System.out.println("За 20 минут машина произвела " + bottles / minutes * 20 + " штук бутылок");
    System.out.println("За сутки машина произвела " + bottles / minutes * 1440 + " штук бутылок");
    System.out.println("За 3 сутка машина произвела " + (bottles / minutes * 1440) * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + ((bottles / minutes * 1440) * 3) * 30 + " штук бутылок");

    }
}