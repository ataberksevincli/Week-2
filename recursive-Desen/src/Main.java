import java.util.Scanner;

public class Main {
    static void desen(int number,int tempNumber,boolean durum) {
        System.out.println("Güncel sayımız : " + number);
        if (number > 0 && durum) {
            number -= 5;
            System.out.println(number);
            desen(number,tempNumber,true);
        }
        else if (number <= 0) {
            number += 5;
            System.out.println(number);
            desen(number,tempNumber,false);

        }else if (number > 0 && !durum && number != tempNumber ){
            number+=5;
            System.out.println(number);
            desen(number,tempNumber,false);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        boolean durum = true;
        desen(number,number,durum);


    }
}