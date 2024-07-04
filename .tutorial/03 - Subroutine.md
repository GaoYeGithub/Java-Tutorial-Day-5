# Types of Subroutines

There are

subroutine-name(parameters);
and 
class-name.subroutine-name(parameters);

Here are some examples

```java
public static void Method() {
  // "public" and "static" are modifiers; "void" is the 
  // return-type; "Method" is the subroutine-name; 
  // the parameter-list is empty.
  . . .  // Statements that define what Method does go here.
}

int Method(int X) {
  // There are no modifiers; "int" is the return-type;
  // "Method" is the subroutine-name; the parameter-list 
  // includes one parameter whose name is "X" and whose 
  // type is "int".
  . . .  // Statements that define what Method does go here.
}

static boolean Method(double x, double y) {
  // "static" is a modifier; "boolean" is the
  // return-type; "Method" is the subroutine-name; 
  // the parameter-list includes two parameters whose names are 
  // "x" and "y", and the type of each of these parameters 
  // is "double".
  . . .  // Statements that define what Method does go here.
}
```

And yes same sub rountine for different things

Here is a example:

```java
public class Main {
  static int Method(int x) {
    return x;
  }

  static double Method(double x, double y) {
    return x + y;
  }

  public static void main(String[] args) {
    int myNum1 = Method(5);
    double myNum2 = Method(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}
```