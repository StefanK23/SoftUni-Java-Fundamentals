import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int countWon = 0;
        boolean isTrue = false;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
             if(energy == 0) {
                 System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWon, energy);
                 return;
             }
             if(energy >= distance){
                 energy = energy- distance;
                 countWon++;
                 if(countWon % 3 ==0 ){
                     energy += countWon;
                 }
             }else {
                 System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",countWon, energy);
                 isTrue = true;
                 break;
             }


            command = scanner.nextLine();
        }
        if(!isTrue){
            System.out.printf("Won battles: %d. Energy left: %d", countWon, energy);
        }
    }
}
