import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if ( 0 <= number && number <= 2 ) {
            System.out.println("baby");
        }else if(3 <= number  && number <= 13) {
            System.out.println("child");
        }else if(14 <= number && number <= 19){
            System.out.println("teenager");
        }else   if (20 <= number && number <= 65) {
            System.out.println("adult");
        }else if( number >= 66){
            System.out.println("elder");
        }
    }
}
