public class ContaCarneirinhos {
  static int c = 0;

  public static void main(String[] args) throws InterruptedException {
    while (c < 100) {
      Thread.sleep(1000);
      System.out.println("Carneirinhos: " + c);
      c++;
    }
  }
}
