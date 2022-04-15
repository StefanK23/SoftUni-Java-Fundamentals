import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound = false;

        for (int index = 0; index <= array.length - 1; index++) {

            int leftSum = 0;
            int rightSum = 0;
            for (int leftSide = 0; leftSide <= index - 1; leftSide++) {
                leftSum += array[leftSide];

            }
            for (int rightSide = index + 1; rightSide <= array.length -1; rightSide++) {
             rightSum+= array[rightSide];
            }
            if(leftSum == rightSum){
                System.out.println(index);
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("no");
        }


    }
}
