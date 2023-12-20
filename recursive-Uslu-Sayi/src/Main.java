import java.util.Scanner;


public class Main {
    static int power(int base, int exponent) {
        int total = 1;
        for (int i = 1; i <= exponent; i++) {
            total *= base;
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        int base = input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz : ");
        int exponent = input.nextInt();


        System.out.println(power(base, exponent));
    }
}
