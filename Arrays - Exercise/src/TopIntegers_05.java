import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isBigger = false;


        for (int index = 0; index <= array.length - 1; index++) {
            int number = array[index];
            if (index == array.length - 1) {
                System.out.println(number);
                break;
            }
            for (int i = index + 1; i <= array.length - 1; i++) {
                if (number > array[i]) {
                    isBigger = true;

                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(number + " ");
            }
        }

    }
}

