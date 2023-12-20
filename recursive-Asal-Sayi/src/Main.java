import java.util.Scanner;

public class Main {


    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif Bir Sayı Giriniz : ");
        int number = input.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " Sayısı asal bir sayıdır.");
        } else {
            System.out.println(number + " Sayısı asal bir sayı değildir.");
        }

    }
}