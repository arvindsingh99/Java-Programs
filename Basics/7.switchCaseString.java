import java.util.*;

class Demo {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your City Name: ");
    String cityName = sc.nextLine();
    switch (cityName) {
      case "varanasi":
        System.out.println("You belongs from Uttar Pradesh");
        break;
      case "ambala":
        System.out.println("You belongs from Punjab");
        break;
      default:
        System.out.println("Your City is not listed here");
    }
  }
}
