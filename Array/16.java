import java.util.*;
class Demo{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter no of elements in array: ");
     int count =0;
     int n = sc.nextInt();
     int[] a = new int[n];
     System.out.println("Enter "+ n +" elements of array: ");
     for (int i=0; i<n; i++){
         a[i]= sc.nextInt();
     } 
        for(int i=0; i<n; i++){
             for(int j=i+1; j<n; j++){
                 if(a[i]<a[j]){
                     int temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }
             } 
        }
         for(int i=0; i<n-2; i++){
             if(a[i]>a[i+1]){
               for(int j=i+1; j<n-2; j++){
                   if(a[j]>a[j+1]){
                       System.out.println("3rd Largest Element is: " + a[j+1]);
                       count = 1;
                   break;
                   }
               }
              
             } 
              if(count == 1){
                   break;
               }
        }   
            
    }
}