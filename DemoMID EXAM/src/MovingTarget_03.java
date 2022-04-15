

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");

            switch (command[0]) {

                case "Shoot":
                    int index = Integer.parseInt(command[1]);
                    int power = Integer.parseInt(command[2]);

                    if(index >= targets.size()|| index <0){
                        break;
                    }

                     if(targets.get(index) - power <= 0){
                         targets.remove(targets.get(index));
                     }else {
                         targets.set(index, targets.get(index) - power);
                     }
                    break;
                case "Add":
                    int indexValue = Integer.parseInt(command[1]);
                    int value = Integer.parseInt(command[2]);

                    if(indexValue >= targets.size()  || indexValue < 0 ){
                        System.out.println("Invalid placement!");
                        break;
                    }
                        targets.add(indexValue,value);


                    break;
                case "Strike":
                    int indexStrike = Integer.parseInt(command[1]);
                    int radius = Integer.parseInt(command[2]);

                    if(indexStrike >= targets.size() || indexStrike < 0 ){
                        System.out.println("Strike missed!");
                        break;
                    }

                    int strikeIndex = targets.indexOf(targets.get(indexStrike));
                    int left = strikeIndex - radius;
                    int right = strikeIndex + radius;

                    if(left < 0) {
                        System.out.println("Strike missed!");
                        break;
                    }else if(right > targets.size() -1 ){
                        System.out.println("Strike missed!");
                        break;
                    }
                    for (int i = right; i >= left ; i--) {
                        targets.remove(i);
                    }
                    break;

            }


            input = scanner.nextLine();

        }

           String targetPrint = targets.toString().replaceAll("[\\[\\],]","");
                System.out.println(targetPrint.replaceAll(" ", "|"));
    }
}
