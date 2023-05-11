import java.util.Scanner;

class Main {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int bill = sc.nextInt();

    if (bill % 10 == 4 && bill > 500) {
      System.out.println("I will pay the Bill");
    } else {
      System.out.println("You Will Pay the Bill");
    }

    // Pizza or Garlic Bread 

    String order = sc.next();

    if (order.equals("Pizza") || order.equals("Garlicbread")) {
      System.out.println("Happy ");
    } else {
      System.out.println("Sad ");
    }
    
    // Not Operator
    
    boolean isRainy = true;
    
    if(isRainy){
      System.out.println("It's Raining");
    } else {
      System.out.println(" Let's go Out ");
    }

  }

}