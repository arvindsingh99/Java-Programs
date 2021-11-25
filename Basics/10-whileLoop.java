import java.util.*;

class Demo {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number It will print the all number till 10");
    int num = sc.nextInt();
    while (num < 10) {
      num++;
      System.out.println(num);
    }

    while (num > 10) {
      num--;
      System.out.println(num);
    }
  }
}
