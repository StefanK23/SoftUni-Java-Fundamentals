import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String[] firstRow = scanner.nextLine().split(" ");
      String[] secondRow = scanner.nextLine().split(" ");

        for (String wordOfSecondRow : secondRow) {
            for (String wordOfFirstRow : firstRow) {
                if(wordOfSecondRow.equals(wordOfFirstRow)){
                    System.out.print(wordOfSecondRow+ " ");
                }
            }
        }




        }
    }

