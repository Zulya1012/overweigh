import java.util.Scanner;
public class overweigh {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Height:");
    int a = s.nextInt();
    System.out.println("Weight :");
    int b = s.nextInt();

    int c = a - b;

    if (c == 100) {
      System.out.println("Normal weight");

    }
    if (c > 100) {
      System.out.println("Underweight");
      int d = c - 100;
      System.out.println(d);

    }
    if (c < 100) {
      System.out.println("Overweight");
      int d = 100 - c;
      System.out.println(d);

    }
  }
}

}
 }
}
