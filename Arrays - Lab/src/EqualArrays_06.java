
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int[] firstArray = new int [input.length] ;
        for (int i = 0; i <input.length ; i++) {
            firstArray[i] = Integer.parseInt(input[i]);
        }

        String [] line = scanner.nextLine().split(" ");
        int [] secondArray = new int [line.length];
        for (int i = 0; i < line.length ; i++) {
            secondArray[i] = Integer.parseInt(line[i]);
        }

        int sum = 0;
        boolean isIdentical =true;

        for (int i = 0; i <firstArray.length ; i++) {
            sum+=firstArray[i];

            if(firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                isIdentical= false;
                break;

            }
        }
        if(isIdentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}

