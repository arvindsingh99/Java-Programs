import java.util.*;
class InputDemo{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Your name: ");
      String name = sc.nextLine();

      System.out.println("Enter Your age");
      int age = sc.nextInt();

      System.out.println("Enter Your weight");
      float weight = sc.nextFloat();

      System.out.println("Name:" + name);
      System.out.println("Age:" + age);
      System.out.println("weight: " + weight);
    }
}