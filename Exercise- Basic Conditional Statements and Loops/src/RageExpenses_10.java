import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        // Слушалки
        int countHeadSet = lostGames /2 ;
        double sumHeadSet = countHeadSet * headsetPrice;

        //Мишка
        int countMouse = lostGames/3;
        double SumMouse = countMouse* mousePrice;

        //Клавиатура
        int countKeyboard = lostGames/6;
        double sumKeyboard = countKeyboard* keyboardPrice;

        //Дисплей
        int countDisplay = lostGames/12;
        double sumDisplay = countDisplay* displayPrice;

        double expenses = sumDisplay + sumHeadSet + sumKeyboard + SumMouse  ;
        System.out.printf("Rage expenses: %.2f lv." ,expenses);
    }
}
