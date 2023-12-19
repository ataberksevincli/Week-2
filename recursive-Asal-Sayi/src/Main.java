import java.util.Scanner;

public class Main {


    static void uslu() {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Bu sayı bir asal sayı değildir.");
                break;
            } else {
                System.out.println("Bu sayı asal sayıdır.");
                break;

            }
        }

    }

    public static void main(String[] args) {
        uslu();

    }
}