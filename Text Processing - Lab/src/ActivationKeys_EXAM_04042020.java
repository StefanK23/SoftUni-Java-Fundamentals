import java.util.Scanner;

public class ActivationKeys_EXAM_04042020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder key = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Generate")){
            String[] commandArray = command.split(">>>");
            String commandName = commandArray[0];
            switch (commandName){
                case "Contains":
                    String wordToSearch = commandArray[1];
                    if(key.indexOf(wordToSearch) != -1){
                        System.out.printf("%s contains %s%n", key, wordToSearch);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String flipCase = commandArray[1];
                    int flipBeginIndex = Integer.parseInt(commandArray[2]);
                    int flipEndIndex = Integer.parseInt(commandArray[3]);

                    for (int i = flipBeginIndex; i < flipEndIndex; i++) {
                        char currentSymbol = key.charAt(i);
                        if(flipCase.equals("Lower")){
                            key.setCharAt(i,Character.toLowerCase(currentSymbol));

                        }else {
                            key.setCharAt(i,Character.toUpperCase(currentSymbol));
                        }

                    }
                    System.out.println(key);
                    break;
                case "Slice":

                        int sliceBeginIndex = Integer.parseInt(commandArray[1]);
                        int sliceEndIndex = Integer.parseInt(commandArray[2]);
                        key.delete(sliceBeginIndex,sliceEndIndex);

                    System.out.println(key);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",key);

    }
}
