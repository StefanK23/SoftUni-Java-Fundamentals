import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int mainSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length ; i++) {
            int firstNumber = array[i];
            for (int j = i+1; j < array.length ; j++) {
                int secondNumber = array[j];
                if(firstNumber + secondNumber == mainSum){
                    System.out.println(firstNumber + " " + secondNumber);
                }
            }
        }
    }
}
