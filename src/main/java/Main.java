public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();
    long amount = 1000_60;
    boolean registered = true;
    long bonus = service.calculate(amount, registered);
    System.out.println(bonus);
  }
}
//public class Main {
//  public static void main(String[] args) {
//    BonusService service = new BonusService();
//
//    long amount = 1000_60;
//    boolean registered = true;
//    long expected = 30;
//
//    long actual = service.calculate(amount, registered);
//    boolean passed = expected == actual;
//    System.out.println(passed);
//  }
//}
