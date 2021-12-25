import java.util.*;
class Demo{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter rorate position: ");
     int m = sc.nextInt();
     System.out.println("Enter no of elements in array: ");
     int n = sc.nextInt();
     int[] a1 = new int[n];
     int[] a2 = new int[n];
      System.out.println("Enter"+m +" elements of array: ");
     for (int i=0; i<n; i++){
         a1[i]= sc.nextInt();
     }  
     for(int i=0; i<n-m; i++){
                a2[i] = a1[n-m-1+i];
     }
     for(int i=n-m; i<n; i++){
                a2[i] = a1[i-n+m];
     }
    for(int i=0; i<n; i++){
             System.out.print(a2[i] + " ");
         }
    }
}