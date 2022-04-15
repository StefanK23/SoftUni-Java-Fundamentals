import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int length = 1;
        int endIndex = -1 ;
        int bestlength = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                length++;
                if(length > bestlength ) {
                    bestlength = length ;
                    endIndex = i+1 ;
                }
            }else {
                length =1 ;
            }
        }
        for (int i = endIndex; i > endIndex  - bestlength ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
