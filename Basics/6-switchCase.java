import java.util.*;

class Example {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "Eneter Your choice: \n" +
      "Enter 1 for coofee\n " +
      "Enter 2 for Masala Dosa \n" +
      "Enter 3 for Panner Tikka \n" +
      "Enter 4 for Hakka Noodles \n"
    );
    int num = sc.nextInt();
    switch (num) {
      case 1:
        System.out.println("You ordered Cofee");
        break;
      case 2:
        System.out.println("You ordered Masala Dosa");
        break;
      case 3:
        System.out.println("You ordered Panner Tikka");
        break;
      case 4:
        System.out.println("You ordered Hakka Noodles");
        break;
      default:
        System.out.println("Please choose order from list");
    }
  }
}
