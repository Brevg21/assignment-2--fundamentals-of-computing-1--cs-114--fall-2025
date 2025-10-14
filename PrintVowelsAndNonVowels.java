import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String userInput;
    int amountOfLowercaseA = 0;
    int amountOfLowercaseE = 0;
    int amountOfLowercaseI = 0;
    int amountOfLowercaseO = 0;
    int amountOfLowercaseU = 0;
    int amountOfNonvowels = 0;

    System.out.println("Please type a random sentence");
    userInput = input.nextLine();

    for (int i = 0; i < userInput.length(); i++){
      if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u'){
        if (userInput.charAt(i) == 'a') {
          amountOfLowercaseA++;
        }
        else if (userInput.charAt(i) == 'e') {
          amountOfLowercaseE++;
        }
        else if (userInput.charAt(i) == 'i') {
          amountOfLowercaseI++;
        }
        else if (userInput.charAt(i) == 'o'){
          amountOfLowercaseO++;
        }
        else if (userInput.charAt(i) == 'u') {
          amountOfLowercaseU++;
        }
      }
      else if (userInput.charAt(i) != 'A' && userInput.charAt(i) != 'E' && userInput.charAt(i) != 'I' && userInput.charAt(i) != 'O' && userInput.charAt(i) != 'U' && userInput.charAt(i) != ' '){
        amountOfNonvowels++;
      }
    }

    System.out.println("a: " + amountOfLowercaseA);
    System.out.println("e: " + amountOfLowercaseE);
    System.out.println("i: " + amountOfLowercaseI);
    System.out.println("o: " + amountOfLowercaseO);
    System.out.println("u: " + amountOfLowercaseU);
    System.out.println("Non-vowels: " + amountOfNonvowels);
  }
}
