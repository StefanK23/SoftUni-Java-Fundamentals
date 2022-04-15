import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char SymbolOne = scanner.nextLine().charAt(0);
        char SymbolTwo= scanner.nextLine().charAt(0);
        char SymbolThree = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",SymbolThree,SymbolTwo,SymbolOne);
    }
}
