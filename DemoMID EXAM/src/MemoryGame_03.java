import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split(" "))

                .collect(Collectors.toList());

         int countOfMoves = 0;

         String input = scanner.nextLine();

         while(!input.equals("end")){
             String [] command = input.split(" ");
             int indexOne = Integer.parseInt( command[0]);
             int indexTwo = Integer.parseInt(command[1]);
             countOfMoves++;

             if(indexOne >= 0  && indexTwo >= 0 && indexOne < numbers.size() && indexTwo < numbers.size() && indexOne!= indexTwo){
                 if(numbers.get(indexOne).equals(numbers.get(indexTwo))){
                     numbers.remove(indexOne);
                     numbers.remove(indexTwo);

                 }else {
                     numbers.remove(indexTwo);
                     numbers.remove(indexOne);
                 }
                 if(numbers.size() == 0) {
                     System.out.printf("You have won in %d turns!", countOfMoves);
                     return;
                 }
             }else  if(!numbers.get(indexOne).equals(numbers.get(indexTwo))){
                 System.out.println("Try again!");

             }else {
                 numbers.set(numbers.size()  /2 , "-%da");
                 numbers.set(numbers.size()  /2 , "-%da");
                 System.out.println("Invalid input! Adding additional elements to the board");
             }

             input= scanner.nextLine();
         }
        System.out.println("Sorry you lose :(");

        System.out.println(String.join(" ",numbers));
    }
}
