// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {4,2,4,2,6,6,3,3,7,7,9,9,8,8,5,11,13};
        int startIndex = 0;
        int[] duplicatedEven = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                    if ((i != j) && (list[i] == list[j])) {
                        if (!isFind(duplicatedEven, list[i])) {
                            duplicatedEven[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }

        for (int value : duplicatedEven) {
            if (value != 0 && value % 2 == 0) {
                System.out.println(value);
            }
        }
    }
}