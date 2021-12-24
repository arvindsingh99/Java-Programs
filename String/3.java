import java.util.*;
class Three{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         String str;
         int count = 0;
         str = sc.nextLine();
         // punctuation marks (!, . , ' , - , " , ? , ; )
         for(int i = 0; i<str.length() ;i++){
             if(str.charAt(i) =='!' || str.charAt(i) == ';')
             {
                count++;
             }
         }
          System.out.println(count);
    }
}