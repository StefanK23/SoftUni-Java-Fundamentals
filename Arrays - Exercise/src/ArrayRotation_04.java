import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       String []input = scanner.nextLine().split(" ");
        int [] array = new int[input.length];
        for (int i = 0; i < input.length ; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
         int rotationCount = Integer.parseInt(scanner.nextLine());
        for (int rotations = 1 ; rotations <= rotationCount ; rotations++) {
            int firstElement = array[0];

        for (int index = 0; index < array.length -1 ; index++) {
            array[index] = array[index + 1];
        }
            array[array.length-1] = firstElement;
        }
        for (int numbers : array) {
            System.out.print(numbers+ " ");
        }
    }
}
