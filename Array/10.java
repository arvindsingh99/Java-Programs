import java.util.*;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for(int i=0; i<1; i++){
            for (int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
         System.out.println("Smallest element is :" + a[0]);
        
    }
}