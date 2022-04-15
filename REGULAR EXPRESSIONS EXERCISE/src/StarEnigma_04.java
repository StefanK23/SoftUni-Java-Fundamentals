
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List<String> attackers = new ArrayList<>();
        List<String> destroyer = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            String encryptedMessage = scanner.nextLine();
            int countSpecialLetter = getSpecialLetters(encryptedMessage);
            String reducedMessage = getReducedMessage(encryptedMessage, countSpecialLetter);

            String regex = "@(?<planet>[A-Za-z]+)[^@!:>\\-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>\\-]*->(?<soldiers>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(reducedMessage);

            if (matcher.find()) {
                String planet = matcher.group("planet");
                        String typeAttack = matcher.group("attack");
                        if(typeAttack.equals("A")){
                            attackers.add(planet);
                        }else if(typeAttack.equals("D")){
                            destroyer.add(planet);
                        }
            }

        }
        printOutput(attackers,destroyer);
    }

    private static void printOutput(List<String> attackers, List<String> destroyer) {
        Collections.sort(attackers);
        Collections.sort(destroyer);

        System.out.println("Attacked planets: " + attackers.size());
        if (!attackers.isEmpty()){
            attackers.forEach(p -> System.out.println("-> " + p));
        }
        System.out.println("Destroyed planets: " + destroyer.size());
        if (!destroyer.isEmpty()){
            destroyer.forEach(p-> System.out.println("-> "+ p));

        }
    }


    private static String getReducedMessage(String encryptedMessage, int countSpecialLetter) {
        StringBuilder reduceMessage = new StringBuilder();
        for (int index = 0; index < encryptedMessage.length(); index++) {
            char currentSymbol = encryptedMessage.charAt(index);
            reduceMessage.append((char) (currentSymbol - countSpecialLetter));

        }
        return reduceMessage.toString();
    }


    private static int getSpecialLetters(String encryptedMessage) {
        int count = 0;
        String regex = "[SsTtRrAa]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(encryptedMessage);
        while (matcher.find()) {
            count++;

        }
        return count;
    }
}
