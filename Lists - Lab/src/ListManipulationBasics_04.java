import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> items = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(true){
            String input = scanner.nextLine();

            if(input.equals("end")) {
                break;
            }
            String[] commands = input.split("\\s+");
            switch (commands[0]){
                case "Add":
                    int addNumber = Integer.parseInt(commands[1]);
                    items.add(addNumber);
                    break;
                case "Remove":
                    int removeNumber = Integer.parseInt(commands[1]);
                    items.remove(Integer.valueOf(removeNumber));
                    break;
                case "RemoveAt":
                    int removeAtNumber = Integer.parseInt(commands[1]);
                    items.remove(removeAtNumber);

                    break;
                case "Insert":
                    int InsertNumber = Integer.parseInt(commands[1]);
                    int indexNumber = Integer.parseInt(commands[2]);
                    items.add(indexNumber,InsertNumber);

                    break;

            }


        }
        System.out.println(items.toString().replaceAll("[\\[\\],]", ""));
    }

}
