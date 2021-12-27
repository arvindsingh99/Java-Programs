
import java.util.*;

class Demo {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements in array: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter " + n + " elements of array: ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j=0; j<n; j++) {
          if(a[i]==a[j]){
            count++;
          }
         }
         if(count==1){
           System.out.print(a[i]+ " ");
         }
    }
  }
}
