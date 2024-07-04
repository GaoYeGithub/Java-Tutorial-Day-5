import java.util.Scanner; 
import java.util.Random;


public class Main {
  static int dice1(int sides) {
    Random random = new Random();
    int dice1 = random.nextInt(sides) + 1;
    return dice1;
  }

  static int dice2(int sides) {
    Random random = new Random();
    int dice2 = random.nextInt(sides) + 1;
    return dice2;
  }

  static boolean repeat() {
    System.out.println("Do you want to repeat? (yes/no)");
    String answer = System.console().readLine();
    return answer.toLowerCase().equals("yes");
  }

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    do {
      System.out.println("How big is the dice");
      int sides = Integer.parseInt(myObj.nextLine());
      
      int dice1 = dice1(sides);
      int dice2 = dice2(sides);
      System.out.println("Dice 1: " + dice1);
      System.out.println("Dice 2: " + dice2);
      
      if (dice1 > dice2) {
        System.out.println("Dice 1 is bigger");
      } else if (dice2 > dice1) {
        System.out.println("Dice 2 is bigger");
      } else {
        System.out.println("Dice 1 and Dice 2 are the same");
      }
    } while (repeat());
  }
}
