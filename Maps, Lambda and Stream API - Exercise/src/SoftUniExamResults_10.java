import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userPoint = new HashMap<>();
        Map<String, Integer> languageCount = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {
            String[] splitArray = input.split("-");
            String username = splitArray[0];
            if (splitArray.length == 3) {
                String language = splitArray[1];
                int points = Integer.parseInt(splitArray[2]);
                //Добавяме username и точки
                if (!userPoint.containsKey(username)) {
                    userPoint.put(username, points);
                } else {
                    int currentPoints = userPoint.get(username);
                    if(points > currentPoints) {
                        userPoint.put(username, points);
                    }

                }
                //Добавяме брой срещания на езика
                if (!languageCount.containsKey(language)) {
                    languageCount.put(language, 1);
                }else {
                    languageCount.put(language,languageCount.get(language ) +1);
                }
            } else {
               userPoint.remove(username);
            }


            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPoint.entrySet().stream()
                .sorted(Map.Entry.<String,Integer> comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");
        languageCount.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
