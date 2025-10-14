import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numberOfBottles = 100;
    int numberOfVerses = 0;
    boolean validInput = false;

    System.out.println("Please type the number of verses you want printed.");
    numberOfVerses = scan.nextInt();

    while (validInput == false) {
      if (numberOfVerses >= 1 && numberOfVerses <= 100) {
        validInput = true;
      }
      else {
        System.out.println("Invalid input, Please type the number of verses you want printed");
        numberOfVerses = scan.nextInt();
      }
    }

    while (numberOfVerses > 0) {
      if (numberOfBottles == 1){
        System.out.println(numberOfBottles + " bottle of beer on the wall\n" + numberOfBottles + " bottle of beer\nIf one of those bottles should happen to fall");
      }
      else if (numberOfBottles > 1){
        System.out.println(numberOfBottles + " bottles of beer on the wall \n" + numberOfBottles + " bottles of beer\nIf one of those bottles should happen to fall");
      }
      numberOfBottles--;


      if (numberOfBottles == 1) {
        System.out.println(numberOfBottles + " bottle of beer on the wall\n");
      }
      else if (numberOfBottles > 1) {
        System.out.println(numberOfBottles + " bottles of beer on the wall\n");
      }
      else if (numberOfBottles == 0) {
        System.out.println("No more bottles of beer on the wall\n");
      }
      numberOfVerses--;
    }
    if (numberOfBottles == 0){
      System.out.println("No more bottles of beer on the wall\nNo more bottles of beer\nGo to the store and buy some more\n100 bottles of beer on the wall");
    }
  }
}
