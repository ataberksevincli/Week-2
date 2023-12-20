import java.util.Scanner;

public class Main {
    static void desen(int number, int tempNumber, int direction) {
        System.out.print(tempNumber + " ");
        if (direction == 1 && tempNumber == number) {
            return;
        }
        if (tempNumber <= 0) {
            direction = 1;
        }
        desen(number, tempNumber + (5 * direction), direction);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (number > 0)
            desen(number, number, -1);
        else
            System.out.println("Lütfen pozitif sayı giriniz.");
    }
}