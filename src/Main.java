public class Main {
    public static void main(String[] args) {
        // 1
    for (int i = 1; i <= 10; i++ ){
        System.out.println(i);
    }
    // 2
    for (int i = 10; i != 0; i--){
        System.out.println(i);
    }
    // 3
    for (int i = 0; i <= 17; i += 2){
        System.out.println(i);
    }
    // 4
    for (int i = 10; i != -11; i--){
        System.out.println(i);
    }
    // 5
    for (int i = 1904; i <= 2096; i += 4){
        if ( i % 100 != 0 || i % 400 == 0)
            System.out.println(i + " год является високосным");
    }
    // 6
    for (int i = 7; i <= 98; i += 7){
        System.out.println(i);
    }
    // 7
    for (int i = 1; i <= 512; i *= 2){
        System.out.println(i);
    }
    // 8
    int count = 0;
    for (int i = 1; i <= 12; i++){
        count += 29000;
        System.out.println("Месяц " + i + " , сумма накоплений равна " + count + " рублей");
    }
    // 9
    int total = 0;
    for (int i = 1; i <= 12; i++){
        total += 29000 + (29000 * 12/100);
        System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
    }
    // 10
    for (int i = 1; i <= 10; i++){
        System.out.println("2*"+i+"="+2*i);
    }
    }
}