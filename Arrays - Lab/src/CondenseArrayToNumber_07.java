import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();


        while   (number.length > 1) {
            int[] condensed = new int[number.length -1] ;
            for (int i = 0; i < condensed.length ; i++) {
                condensed[i] = number[i] + number[i +1] ;
            }
            number = condensed;
        }
        System.out.println(number[0]);
    }
}
