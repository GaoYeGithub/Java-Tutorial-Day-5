# Java Subroutine or Method

Today we will be going over Java Method or Subroutines, in a simple way it like putting code in a variable and running it later just remove public


👉 Copy this code into your coding editor in `main.py` and see what happens when you hit `run`:


```java
public class Main {
  static void Method() {
    System.out.println("Saved Code");
  }

  public static void main(String[] args) {
    Method(); // excute everything in Method
  }
}
```

You additionally add a parameter that allow you add thing to the code

Like this!

```java

public class Main {
  static void myMethod(int itemNum) {
    System.out.println("Item " + itemNum);
  }

  public static void main(String[] args) {
    myMethod(1);
    myMethod(2);
    myMethod(3);
  }
}
```

Just remeber to add a agrument or the thing between the bracket

You can add as much parameters or a combnation of string and int like this

```java
public class Main {
  static void myMethod(String name, int age) {
    System.out.println(name + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Gary", 16);
    myMethod("Bob", 10);
    myMethod("Jerry", 6);
  }
}
```