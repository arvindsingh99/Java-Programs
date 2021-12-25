import java.util.*;
class Demo{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] a1 = new int[n];
     int[] a2 = new int[n];
     for (int i=0; i<n; i++){
         a1[i]= sc.nextInt();
     }  
     for (int i=0; i<n; i++){
        a2[i] = a2[i];
     }
    
         System.out.println(Arrays.toString(a1));
          System.out.println(Arrays.toString(a1));
    }
}