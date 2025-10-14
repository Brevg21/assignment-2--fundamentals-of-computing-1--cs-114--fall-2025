public class CountFlips {
  public static void main(String[] args) {
    Coin myCoin = new Coin();
    int eachFlip = 0;
    int heads = 0;
    int tails = 0;

    while (eachFlip < 100) {
      myCoin.flip();
      if (myCoin.isHeads()) {
        heads++;
      }
      else {
        tails++;
      }
      eachFlip++;
    }
    System.out.println("Amount of heads: " + heads);
    System.out.println("Amount of tails: " + tails);
  }
}
