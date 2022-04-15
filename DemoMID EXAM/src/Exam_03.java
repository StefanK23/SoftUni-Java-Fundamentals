
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam_03 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                List<Integer> list = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

               String input = scanner.nextLine();

               while (!input.equals("Mort")){
                   String [] command = input.split(" ");
                   String commands = command[0];
                   int value = Integer.parseInt(command[1]);
                   switch (commands) {
                       case "Add" :
                           list.add(value);
                           break;
                       case "Remove":
                           list.remove(Integer.valueOf(value));
                           break;
                       case "Replace" :
                           int replacement = Integer.parseInt(command[2]);
                           int index = list.indexOf(value);

                          if(list.contains(value)){
                              list.set(index,replacement);
                          }
                           break;
                       case "Collapse":
                           for (int i = 0; i <list.size(); i++) {

                               if(list.get(i) < value){
                                   list.remove(i);
                                   i--;
                               }
                           }
                           break;

                   }



                   input= scanner.nextLine();
               }
                System.out.println(list + " ");

            }
        }


