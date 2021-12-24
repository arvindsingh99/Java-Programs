import java.util.*;
class Demo{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int count=0;
     int[] a1 = new int[n];
     for (int i=0; i<n; i++){
         a1[i]= sc.nextInt();
     } 
     Arrays.sort(a1);
     for(int i=0; i<a1.length;i++){
         if(a1[0]==a1[i]){
             count++;
         }
     } 
     System.out.println(count); 
    }
}