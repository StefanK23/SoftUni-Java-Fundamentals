import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        double area = calculatedArea(width,height);
        System.out.printf("%.0f%n", area);
    }

    private static double calculatedArea(int width, int height) {
        return width * height;
    }
}
