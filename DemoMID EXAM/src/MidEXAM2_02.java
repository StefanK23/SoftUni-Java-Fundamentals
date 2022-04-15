import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidEXAM2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> biscuits = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Eat")) {
            String[] command = input.split("\\s+");
            String commands = command[0];


            switch (commands) {
                case "Update-Any":
                 if (biscuits.contains(command[1])){
                     biscuits.set(biscuits.indexOf(command[1]), "Out of stock");
                 }

                    break;
                case "Remove":
                    int index = Integer.parseInt(command[2]);
                    if (index > 0 && index <= biscuits.size()) {
                        biscuits.set(index, command[1] + "");
                    }
                    break;
                case "Update-Last":
                    biscuits.remove(biscuits.size()-1);
                    biscuits.add(command[1]);

                    break;
                case "Rearrange":
                    if(biscuits.contains(command[1]) || !biscuits.contains(command[1])){
                        biscuits.remove(command[1]);
                        biscuits.add(command[1]);
                    }

                    break;
            }


            input = scanner.nextLine();
        }
        for (String biscuit : biscuits) {
            if(!biscuit.equals("Out of stock"))
            System.out.print(biscuit + " ");
        }


    }
}
