import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");

        int initialHealth = 100;
        int initialBitcoins = 0;
        boolean hasDied = false;

        for (int i = 0; i < rooms.length; i++) {
            String[] currentRoom = rooms[i].split(" ");
            String command = currentRoom[0];
            int number = Integer.parseInt(currentRoom[1]);

            if (command.contains("potion")) {
                int healthPotionNeeded = 100 - initialHealth;
                initialHealth += number;

            if (initialHealth > 100) {
                initialHealth = 100;
            }
            if (healthPotionNeeded <= number){
                System.out.printf("You healed for %d hp.%n", healthPotionNeeded);
            }else {
                System.out.printf("You healed for %d hp.%n", number);
            }
                System.out.printf("Current health: %d hp.%n", initialHealth);
        }else if(command.contains("chest")){
                initialBitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            }else {
                initialHealth-= number;
                if(initialHealth> 0) {
                    System.out.printf("You slayed %s.%n", command);
                }else {
                    hasDied = true;
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i + 1);
                    break;
                }
            }
        }
        if (!hasDied) {
            System.out.printf("You've made it!%n" +
                    "Bitcoins: %d%n" +
                    "Health: %d%n", initialBitcoins, initialHealth);
        }
    }
}
