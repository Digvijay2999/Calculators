import java.util.Scanner;

class MaxInputException  extends Exception{
  public MaxInputException(String message){
      super (message);
  }
}

class InvalidInputException extends Exception{
   public InvalidInputException(String message){
       super (message);
   }
}



public class Calculator {
   private static final long MAX_VALUE = 100000000000000L;
   private static long getNumber(Scanner scanner) throws InvalidInputException, MaxInputException {
       String input = scanner.nextLine();
       try {
           long number = Long.parseLong(input);
           if (number > MAX_VALUE) {
               throw new MaxInputException("The number exceeds the maximum allowed value of " + MAX_VALUE);
           }
           return number;
       }
       catch (NumberFormatException e) {
           throw new InvalidInputException("Invalid input: Please enter a valid number.");
       }
   }
   private static long calculate(long a, long b, char op) throws InvalidInputException{
       switch(op){
           case '+':
               return a+b;

           case '-':
               return a-b;

           case '*':
               return a*b;

           case '/':
               if (b == 0){
                   throw new InvalidInputException("The Divisor can not be 0");
               }
               return a/b;

           case '%':
               if (b == 0){
                   throw new InvalidInputException("The Divisor can not be 0");
               }
               return a%b;

           default:
               throw new InvalidInputException("Invalid operator: Please enter one of +, -, *, /.");
       }
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //            finally {
       //                scanner.close();
       //            }
       while(true) {
           try {
               System.out.println("Enter the First and Second value:");
               long a = getNumber(scanner);
               long b = getNumber(scanner);
               System.out.println("Choose the operator (+, -, *, /, %): ");
               char op = scanner.next().charAt(0);
               long result = calculate(a, b, op);
               System.out.println(result);
           } catch (InvalidInputException | MaxInputException e) {
               System.out.println(e.getMessage());
           }
       }
   }

}



