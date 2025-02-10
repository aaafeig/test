public class Main {
    public static void main(String[] args) {
    byte cansOfPaint = 120;
    byte whiteColoursOnClass = 2;
    byte brownColoursOnClass = 4;
    System.out.println("В школе, где " + cansOfPaint / (whiteColoursOnClass + brownColoursOnClass) + " классов, нужно " +
            whiteColoursOnClass * (cansOfPaint /( whiteColoursOnClass + brownColoursOnClass)) + " белой краски и " + brownColoursOnClass * (cansOfPaint / (whiteColoursOnClass + brownColoursOnClass)) +
    " банок коричневой краски");
    }
}