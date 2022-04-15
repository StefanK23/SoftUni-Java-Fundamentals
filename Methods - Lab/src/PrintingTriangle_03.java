import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        triangle(n) ;
    }

    private static void triangle(int n) {
        topOftriangle(n);
        bottomOftriangle(n);
    }

    private static void bottomOftriangle(int n) {
        for (int i = n; i >= 1 ; i--) {
            printSingleLine(i);
        }
    }

    private static void topOftriangle(int n) {
        for (int i = 1; i < n ; i++) {
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int n) {
        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
