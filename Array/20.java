import java.util.*;

class Demo {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements in array: ");
    int count = 0;
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter " + n + " elements of array: ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
   
        System.out.println("Smallest Element is: " + a[0]);
  }
}
