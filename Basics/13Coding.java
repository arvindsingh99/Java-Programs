import java.util.*;

class Demo{
    public static void main(String args[]){
 int m,n;
 int num = 0;
    Scanner sc = new Scanner(System.in);
    m = sc.nextInt();
    n= sc.nextInt();
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    int[] a3 = new int[50];
    for(int i=0; i<n; i++){
        a1[i] = sc.nextInt();
    }
     for(int i=0; i<m; i++){
        a2[i] = sc.nextInt();
    }
    
     for(int i=0; i<=m+n; i++){
    if(a1.length >i){
        a3[num]=a1[i];
        num++;
    }
    if(a2.length >i){
        a3[num] = a2[i];
        num++;
    }
    }
     for(int i=0;i<m+n-1; i++){
   System.out.println(a3[i]);
    }
   
    }
  
}