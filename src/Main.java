public class Main {
    public static void main(String[] args) {
        short studentsLud = 23;
        short studentsAnna = 27;
        short studentsEkaterine = 30;
        short papers = 480;
        System.out.println("На каждого ученика рассчитано " + papers / (studentsAnna + studentsEkaterine + studentsLud) + " листов бумаги");
    }
}