import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("Go Shopping!")) {
            String[] command = input.split("\\s+");
            switch (command[0]){
                case "Urgent":
                    String item = command[1];
                    if(!products.contains(item)){
                        products.add(0,item);
                    }
                    break;
                case "Unnecessary":
                    String itemOne = command[1];
                    if(products.contains(itemOne)){
                        products.remove(itemOne);
                    }
                    break;
                case "Correct":
                    String oldItem = command[1];
                    String newItem = command[2];
                    if(products.contains(oldItem)) {
                        products.set(products.indexOf(oldItem),newItem);
                    }
                    break;
                case "Rearrange":
                    String itemTwo = command[1];
                    if(products.contains(itemTwo)){
                        products.remove(itemTwo);
                        products.add(itemTwo);
                    }
                    break;
            }


            input= scanner.nextLine();
        }
        System.out.println(String.join(", ", products));
    }
}
