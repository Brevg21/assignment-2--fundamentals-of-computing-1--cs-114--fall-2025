import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numberOfVerses;

    System.out.println("Please type the number of verses you want printed.");
    numberOfVerses = scan.nextInt();

    while (numberOfVerses > 1) {
      System.out.println(numberOfVerses + " bottles of beer on the wall \n" + numberOfVerses + " bottles of beer\nIf one of those bottles should happen to fall");
      numberOfVerses--;
      if (numberOfVerses == 1) {
        System.out.println(numberOfVerses + " bottle of beer on the wall");
      }
      else
      System.out.println(numberOfVerses + " bottles of beer on the wall");
    }
  }
}
