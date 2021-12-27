import java.util.*;

class Demo {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements in array: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    int flag = 0;
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
          flag = 1;
        }
      }
      if(flag==0){
          break;
      }
    }

    for (int i = 0; i < n ; i++) {
        System.out.print(a[i] + " ");
      }
  }
}
