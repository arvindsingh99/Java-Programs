import java.util.*;
class Demo{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] a = new int[n];
     for (int i=0; i<n; i++){
         a[i]= sc.nextInt();
     } 
     Map<Integer, Integer> hm = new HashMap<>();
    for(int num: a){
        Integer count = hm.get(num);
        if(count==null)
        {
            hm.put(num, 1);
        }
        else{
            count = count+1;
            hm.put(num, count);
        }
    }
        Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
        for(Map.Entry<Integer, Integer> ms:es){   
                System.out.println( ms.getKey()+ "    "+ms.getValue()+" ");
    }
       }
}
    //  for (int i=0; i<n; i++){
    //      a1[i]= sc.nextInt();
    //  } 
    //   System.out.println("Elements: " +"count"); 
    //  for (int i=0; i<n; i++){
    //      int count=0;
    //      for(int j=0; j<n; j++){
    //          if(a1[i]==a1[j]){
    //              count++;
    //          }

    //      }
    //      System.out.println(a1[i] +"       "+count); 
    //  }
 