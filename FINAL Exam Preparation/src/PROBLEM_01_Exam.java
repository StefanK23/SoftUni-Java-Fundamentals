import java.util.Scanner;

public class PROBLEM_01_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());


           String command = scanner.nextLine();


           while (!command.equals("Finish")){
               String[] tokens = command.split("\\s+");
               String commandName = tokens[0];

               switch (commandName){

                   case "Replace":
                      String currentChar = tokens[1];
                      String newChar  = tokens[2];
                      String builderTExt = text.toString();
                      builderTExt = builderTExt.replace(currentChar, newChar);
                      text = new StringBuilder(builderTExt);
                       System.out.println(text);
                       break;
                   case "Cut":
                       int startIndex = Integer.parseInt(tokens[1]);
                       int endIndex = Integer.parseInt(tokens[2]);

                       if(startIndex >= 0 && startIndex < text.length() && endIndex >= 0
                                    && endIndex< text.length()){
                               text.delete(startIndex,endIndex +1 );
                           System.out.println(text);
                       }else {
                           System.out.println("Invalid indices!");
                       }

                       break;
                   case "Make":
                          if(tokens[1].equals("Upper")){
                              // String builderTExt = text.toString();
                              //                      builderTExt = builderTExt.replace(currentChar, newChar);
                              //                      text = new StringBuilder(builderTExt);
                              //                       System.out.println(text);
                              String UpperText = text.toString();
                              UpperText = UpperText.toUpperCase();
                              text = new StringBuilder(UpperText);

                              System.out.println(text );


                          }else if(tokens[1].equals("Lower")){
                              String lowerText = text.toString();
                              lowerText= lowerText.toLowerCase();
                              text = new StringBuilder(lowerText);
                              System.out.println(text);
                          }
                       break;

                   case "Check":
                       String check = tokens[1];
                       if(text.toString().contains(check)){
                           System.out.println("Message contains " + check);
                       }else {
                           System.out.println("Message doesn't contain " + check);
                       }
                       break;
                   case "Sum":
                       int startSumIndex = Integer.parseInt(tokens[1]);
                       int endSumIndex = Integer.parseInt(tokens[2]);

                       if(startSumIndex >= 0 && startSumIndex < text.length() &&
                                 endSumIndex >= 0 && endSumIndex< text.length()) {
                         String substring = text.toString().substring(startSumIndex,endSumIndex + 1);
                                 int sum = 0;
                           for (int i = 0; i <= substring.length() -1; i++) {
                               char currentSymbol = substring.charAt(i);
                               sum+= currentSymbol;
                           }
                           System.out.println(sum);
                       }else {
                           System.out.println("Invalid indices!");
                       }
                       break;

               }

               command= scanner.nextLine();
           }

    }
}
