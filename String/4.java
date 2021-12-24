import java.util.*;
class Demo{
    public static void main(String args[]) {
        int c1=0, c2=0;
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     str = str.toLowerCase();
     for(int i=str.length()-1; i>=0; i--){
          if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
              c1++;
          }
          else{
              c2++;
          }

     }
     System.out.println("Vowel: "+c1 +"\n"+ "Consonant: "+ c2);
    }
}