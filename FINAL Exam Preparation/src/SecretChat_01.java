import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while(!command.equals("Reveal")){
            String[] type = command.split(":\\|:");
            String commandName = type[0];
            switch (commandName){

                case "ChangeAll":
                    message =new StringBuilder(message.toString().replace(type[1],type[2]));
                    System.out.println(message.toString());
                break;

                case "Reverse":
                   String substring = type[1];
                   if(message.toString().contains(substring)){
                       message.delete(message.indexOf(substring),message.indexOf(substring) + substring.length())
                       .append(new StringBuilder(substring).reverse());
                       System.out.println(message);
                   }else{
                       System.out.println("error");
                   }
                   break;
                case "InsertSpace":
                    message.insert(Integer.parseInt(type[1])," ");
                    System.out.println(message);
                    break;
            }

            command =scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",message.toString());
    }

}

