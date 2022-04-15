import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());


         String input = scanner.nextLine();

         while (!input.equals("3:1")) {
             String[] command = input.split("\\s+");

            if(command[0].equals("merge")){
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);

                for (int i = startIndex; i <= endIndex; i++) {


                }
            }

             input = scanner.nextLine();
         }
    }
}
