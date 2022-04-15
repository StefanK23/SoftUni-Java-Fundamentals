import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if(counts.containsKey(wordInLowerCase)){
                counts.put(wordInLowerCase,counts.get(wordInLowerCase) + 1);

            }else {
                counts.put(wordInLowerCase, 1);
            }
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> Entry : counts.entrySet()) {
            if(Entry.getValue() % 2 ==1 ){
                odds.add(Entry.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if(i < odds.size()-1){
                System.out.print(", ");
            }
        }
    }
}
