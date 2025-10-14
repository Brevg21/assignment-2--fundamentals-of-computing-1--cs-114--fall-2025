public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    int suffix = 0;
    int eachNewLineAdded = 0;

    for(int i = 0; i < 12; i++){
      String dayOfChristmas = switch (suffix) {
        default -> "On the 1st day of Christmas, my true love gave to me";
        case 1 -> "On the 2nd day of Christmas, my true love gave to me";
        case 2 -> "On the 3rd day of Christmas, my true love gave to me";
        case 3 -> "On the 4th day of Christmas, my true love gave to me";
        case 4 -> "On the 5th day of Christmas, my true love gave to me";
        case 5 -> "On the 6th day of Christmas, my true love gave to me";
        case 6 -> "On the 7th day of Christmas, my true love gave to me";
        case 7 -> "On the 8th day of Christmas, my true love gave to me";
        case 8 -> "On the 9th day of Christmas, my true love gave to me";
        case 9 -> "On the 10th day of Christmas, my true love gave to me";
        case 10 -> "On the 11th day of Christmas, my true love gave to me";
        case 11 -> "On the 12th day of Christmas, my true love gave to me";

      };
      suffix++;
      switch (eachNewLineAdded){
        default ->  System.out.println(dayOfChristmas + "\nA partridge on a pear tree\n");
        case 1 ->  System.out.println(dayOfChristmas + "\nTwo turtle doves and\nA partridge in a pear tree\n");

        case 2 -> System.out.println(dayOfChristmas + "\nThree french hens\nTwo turtls doves and\nA partridge in a pear tree\n");

        case 3 ->  System.out.println(dayOfChristmas + "\nFour calling birds\nThree french hens\nTwo turtle doves and\nA partridge in a pear tree\n");

        case 4 ->  System.out.println(dayOfChristmas + "\nFive golden rings\nFour calling birds\nThree french hens\nTwo turtle doves and\nA partridge in a pear tree\n");

        case 5 ->  System.out.println(dayOfChristmas + "\nSix geese a-laying\nFive golden rings\nFour calling birds\nThree french hens\nTwo turtle doves and\nA partridge in a pear tree\n");

        case 6 ->  System.out.println(dayOfChristmas + "\nSeven swans a-swimming\nSix geese a-laying\nFive golden rings\nFour calling birds\nThree french hens\nTwo turtle doves and\nA partridge in a pear tree\n");

        case 7 ->  System.out.println(dayOfChristmas + "\nEight maids a-milking\nSeven swans a-swimming\nSix geese a-laying\nFive golden rings\nFour calling birds\nThree french hens\nTwo turtle doves and\nA partridge in a pear tree\n");

        case 8 ->  System.out.println(dayOfChristmas + "\nNine ladies dancing\nEight maids a-milking\nSeven swans a-swimming\nSix geese a-laying\nFive golen rings\nFour calling birds\nThree french hens\nTwo turtle doves and\nA partridge in a pear tree\n");

        case 9 ->  System.out.println(dayOfChristmas + "\nTen lords a-leaping\nNine ladies dancing\nEight maids a-milking\nSeven swans a-swimming\nSix geese a-laying\nFive golden rings\nFour calling birds\nThree french hens\nTwo turtle doves and\nA partridge in a pear tree\n");

        case 10 ->  System.out.println(dayOfChristmas + "\nEleven pipers piping\nTen lords a-leaping\nNine ladies dancing\nEight maids a-milking\nSeven swans a-swimming\nSix geese a-laying\nFive golden rings\nFour calling birds\nThree french hens\nTwo turtle doves and\nA partridge in a pear tree\n");

        case 11 ->  System.out.println(dayOfChristmas + "\nTwelve drummers drumming\nEleven pipers piping\nTen lords a-leaping\nNine ladies dancing\nEight maids a-milking\nSeven swans a-swimming\nSix geese a-laying\nFive golden rings\nFour calling birds\nThree french hens\nTwo turtle doves and\nA partridge in a pear tree\n");
      }
      eachNewLineAdded++;
    }
  }
}
