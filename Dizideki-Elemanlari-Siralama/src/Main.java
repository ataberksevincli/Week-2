import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu n : ");
        int sayi = input.nextInt();
        int[]arr = new int[sayi];

        for (int i = 0; i < arr.length; i++){
            System.out.print(( i + 1 )  + ". Elemanı : ");
            int arrInput = input.nextInt();
           arr[i] += arrInput;

        }
        Arrays.sort(arr);
        System.out.println("Sıralama : " + Arrays.toString(arr));
    }
}