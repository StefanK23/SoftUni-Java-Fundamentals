import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split("\\s+");

            if (command.length == 2) {
                int newWagons = Integer.parseInt(command[1]);
                wagons.add(newWagons);
            } else {
                int passengersToAdd = Integer.parseInt(command[0]);
                for (int index = 0; index < wagons.size(); index++) {
                    int passengersInWagon = wagons.get(index);
                    if(passengersInWagon + passengersToAdd <= capacity){
                        wagons.set(index, passengersInWagon+ passengersToAdd);
                        break;
                    }

                }
            }


            input = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon+ " ");
        }
    }
}
