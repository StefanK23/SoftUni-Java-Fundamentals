import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        // 1.обхождаме всички кодове от start do end
        // 2.за всеки код -> взимаме символа и печзтаме

        for (int code = startCode; code <= endCode; code++) {
            System.out.print((char) code + " ");
        }
    }
}
