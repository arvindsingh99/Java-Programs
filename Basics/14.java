import java.util.*;
class Demo{
public static void main(String args[]){
    int m,n;
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         int mul =0;
         mul = n*m;
         int s= mul%4 ;
         int noOfSquare = mul - s ;
         System.out.println(noOfSquare/4);

}}