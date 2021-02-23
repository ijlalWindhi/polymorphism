package Interface;


public class main {
    public static void main(String[] args) {
        line line1 = new line(2,7,10,15);
        line line2 = new line(4,6,9,11);
        System.out.println("Apakah nilai a>b : "+line1.isGreater(line1, line2));
        System.out.println("Apakah nilai a<b : "+line1.isLess(line1, line2));
        System.out.println("Apakah nilai a=b : "+line1.isEqual(line1, line2));
    }
}
