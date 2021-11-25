import java.util.*;
class Example {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
       if(num<=10){
            System.out.println("Number is less or equal to 10");
        }
       else if(num<=50 && num >10){
            System.out.println("Number is less than or equal to 50 or greater than 10");
        }
       else if(num<=100 && num>50)
        System.out.println("Number is greater than 50 and equal or less than 100");

        else{
            System.out.println("Number is greater than 100");
        }

    }
}