import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6};
double harmonikAvarage = 0.0,harmonikSeri = 0.0;
        for (int i : arr) {
            harmonikSeri += ((double) 1 / i);
            harmonikAvarage = arr.length / harmonikSeri;
        }
        System.out.println(harmonikAvarage);
    }
}