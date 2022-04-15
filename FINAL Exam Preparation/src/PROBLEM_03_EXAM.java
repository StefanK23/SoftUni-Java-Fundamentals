import java.util.*;

public class PROBLEM_03_EXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> nameSending = new TreeMap<>();
        Map<String, Integer> nameReceived = new TreeMap<>();

        String input  = scanner.nextLine();

        while  (!input.equals("Statistics")){
            String[] command = input.split("=");
            String commandName = command[0];

            switch (commandName){
                case "Add":
                    String username = command[1];
                    int sent = Integer.parseInt(command[2]);
                    int received = Integer.parseInt(command[3]);
                    if(nameSending.containsKey(username)){
                        nameSending.put(username, nameSending.get(username)+ sent);
                    }else {
                        nameSending.put(username,sent);
                        nameReceived.put(username,received);
                    }


                    break;
                case "Message":
                    String sender = command[1];
                    String receiver = command[2];
                    if(nameSending.containsKey(sender) && nameSending.containsKey(receiver)){
                        nameSending.put(sender,nameSending.get(sender) +1);
                        nameReceived.put(receiver,nameReceived.get(receiver)+1);

                    }
                    if(nameSending.get(sender) >= capacity){

                        System.out.println(sender + " reached the capacity");
                        nameSending.remove(sender);
                        nameReceived.remove(sender);

                    }

                    break;
                case "Empty":
                    String userName = command[1];
                    if(userName.equals("All")){
                        nameSending.clear();
                        nameReceived.clear();
                    }else {
                        nameSending.remove(userName);
                        nameReceived.remove(userName);
                    }
                    break;
            }


            input= scanner.nextLine();
        }
        System.out.println("Users count: " + nameReceived.size());
        nameSending.entrySet().stream()
                .sorted((h1,h2) -> h2.getValue().compareTo(h1.getValue()))
                .forEach(person -> {
                    String name = person.getKey();
                    System.out.printf("%s - %d%n" , name , nameSending.get(name)+nameReceived.get(name));
                });
    }
}
