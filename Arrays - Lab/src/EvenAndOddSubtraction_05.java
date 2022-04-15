import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String [] numbers = scanner.nextLine().split(" ");
         int [] allNumbers = new int[numbers.length];

         int evenSum =0;
         int oddSum =0;


        for (int i = 0; i <allNumbers.length; i++) {
            allNumbers[i] = Integer.parseInt(numbers[i]);

            if(allNumbers[i]% 2 == 0){
                evenSum += allNumbers[i];
            }else {
                oddSum+=allNumbers[i];
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
