
import java.util.*;

class Demo {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements in array: ");
    int n = sc.nextInt();
    int countEven = 0;
    int countOdd = 0;
    int[] a = new int[n];
    int[] b = new int[n];
    int[] c = new int[n];
    System.out.println("Enter " + n + " elements of array: ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Even Elements are: ");
    for (int i = 0; i < n; i++) {
         if(a[i]%2==0){
             System.out.print(a[i]  +" ");
         }
    
         }   
         System.out.println("");   
       System.out.print("Odd Elements are: ");   
    for (int i = 0; i < n; i++) {
         if(a[i]%2!=0){
             System.out.print(a[i]  +" ");
         }
    
         }    
  }
}
