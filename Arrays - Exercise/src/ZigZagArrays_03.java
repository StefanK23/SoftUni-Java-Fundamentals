import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] array1 = new String[n];
        String [] array2 = new String[n];
        for (int i = 0; i < n ; i++) {
             String [] input = scanner.nextLine().split(" ");

             String firstWord = input[0];
             String SecondWord = input[1];

            if(i  % 2 == 0){
              array1[i] = firstWord;
              array2[i] = SecondWord;
            }else   {
                array2[i] = firstWord;
                array1[i] = SecondWord;
            }

        }
        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));
    }
}
