import java.util.*;
class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i=0; i<n;i++){
             a[i] = sc.nextInt();
        }
        for(int i=1; i<=n;i++){
            if((i)%2==0){
             System.out.println(a[i-1]+" ");
            }
        }
        
    }
}