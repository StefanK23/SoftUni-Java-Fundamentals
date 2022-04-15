import java.util.Scanner;

public class GreaterTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(first,second));
                break;
            case "char" :
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secondChar));
                break;
            case "string" :
                String firstStr = scanner.nextLine();
                String secondStr = scanner.nextLine();
                System.out.println(getMax(firstStr,secondStr));
        }
    }

    private static int getMax(int first, int second) {
        return Math.max(first,second);
    }
    static char getMax (char first, char second){
        return (char) Math.max(first,second);
    }
    static String   getMax( String first, String second) {
        if(first.compareTo(second) >= 0) {
            return first;
        }else {
            return second;
        }
    }
}
