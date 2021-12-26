import java.util.*;
class Demo{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter no of elements in array: ");
     int n = sc.nextInt();
     int[] a = new int[n];
     System.out.println("Enter"+n +" elements of array: ");
     for (int i=0; i<n; i++){
         a[i]= sc.nextInt();
     }  
     System.out.println("Enter rotate position: ");
     int m = sc.nextInt();
    for(int i=m; i<n; i++){
             System.out.print(a[i] + " "); 
        }
         for(int i=0; i<m; i++){
             System.out.print(a[i]+ " "); 
        }   
    }
}