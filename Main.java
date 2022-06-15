import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Clear the console
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is a prime number?");
    System.out.println("");
    
    System.out.println("A prime number is a whole number greater than 1 whose only factors are 1 and itself.");
    System.out.println("");

    System.out.println("Examples:");
    System.out.println("");
    System.out.println("Is 1 a prime number? : " + PrimeNumberChecker.CheckPrimeNum(1));
    System.out.println("Is 89 a prime number? : " + PrimeNumberChecker.CheckPrimeNum(89));
    System.out.println("Is 150 a prime number? : " + PrimeNumberChecker.CheckPrimeNum(150));
    System.out.println("Is 7919 a prime number? : " + PrimeNumberChecker.CheckPrimeNum(7919));

    System.out.println("");
    System.out.println("Type a number to check if it a prime number.");
    int input = scanner.nextInt();
    System.out.println("");
    scanner.nextLine();
    System.out.println("Is " + input + " a prime number? : " + PrimeNumberChecker.CheckPrimeNum(input));
  }
}