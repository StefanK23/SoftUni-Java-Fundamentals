import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String path = scanner.nextLine();
         String [] pathParts = path.split("\\\\");

         String fullFileName = pathParts[pathParts.length-1];

         String firstPart = fullFileName.split("\\.")[0];
         String lastPart = fullFileName.split("\\.")[1];

        System.out.printf("File name: %s%n", firstPart);
        System.out.printf("File extension: %s", lastPart);
    }
}
