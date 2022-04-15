import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPairs = Integer.parseInt(scanner.nextLine());
        Map<String, List< String>> synonymDictionary = new LinkedHashMap<>();

        for (int i = 0; i < countOfPairs; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(!synonymDictionary.containsKey(word)){
                List<String> synonymForCurrentWord = new ArrayList<>();

                synonymForCurrentWord.add(synonym);
                synonymDictionary.put(word , synonymForCurrentWord);
            }else {
                List<String> synonymForCurrentWord = synonymDictionary.get(word);
                synonymForCurrentWord.add(synonym);
                synonymDictionary.put(word,synonymForCurrentWord);
            }
        }
        for (Map.Entry<String, List<String>> Entry : synonymDictionary.entrySet()) {
            System.out.printf("%s - %s%n",Entry.getKey(), String.join(", ",Entry.getValue()));

        }


    }
}
