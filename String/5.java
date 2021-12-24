import java.util.*;
import java.util.Arrays;  
class Demo{
    public static void main(String args[]) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.length() != str2.length()){
            System.out.println("Not Amagram1");
        }
        char[] a1 = str1.toLowerCase().toCharArray();
        char[] a2 = str2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for (int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i]){
                System.out.println("Not amagram");
            count ++;
            }
        }
        if(count==0){
            System.out.println("Anagram");
        }

    }
}