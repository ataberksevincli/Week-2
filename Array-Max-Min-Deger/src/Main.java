import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2,0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int max = list[0];
        int min = list.length - 1;

        Scanner input = new Scanner(System.in);
        System.out.print("0 (dahil)' ile " + (list.length - 1) + " (dahil) aralığında bir sayı giriniz : ");
        int sayi = input.nextInt();

int closerbutLow = 0;
int closerbutHigh = 0;
        for (int i = 0; i <= sayi + 1; i++){

            closerbutLow = list[sayi - 1];
            closerbutHigh = list[sayi + 1];
        }
        System.out.print("Seçilen sayı : " + list[sayi] + "\nGirilen sayıdan küçük en yakın sayı : " + closerbutLow + "\nGirilen sayıdan büyük en yakın sayı : " + closerbutHigh);
        }
    }
