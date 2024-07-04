# Random Libary, & Return

 Let play with the random libaray, return, with if statments
 First let create something that check what on a dice

```java
import java.util.Random; 
public class Main {

  static void check(int dice) {
    if (dice < 3) {
      System.out.println("You land a the hit!");

    } else {
      System.out.println("You missed");
    }

  }

  public static void main(String[] args) {
    Random random = new Random();
    int dice = random.nextInt(6) + 1;
    check(dice);
  }
}
```

Now using return let see what on the dice

```java
import java.util.Random; 

public class Main {
  static int dice() {
    Random random = new Random();
    int dice = random.nextInt(6) + 1;
    return dice;
  }

  public static void main(String[] args) {
    System.out.println(dice());
  }
}
```

