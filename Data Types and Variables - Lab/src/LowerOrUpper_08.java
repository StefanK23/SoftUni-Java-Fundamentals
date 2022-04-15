import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Symbol = scanner.nextLine();

        if(Symbol.equals(Symbol.toUpperCase())) {
            System.out.println("upper-case");
        }else if(Symbol.equals(Symbol.toLowerCase())){
            System.out.println("lower-case");
        }

    }
}

