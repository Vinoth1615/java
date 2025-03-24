import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = S.nextInt();
        int result=0;
        while(num>0){
            int digit = num%10;
             result = (result*10)+digit;
             num/=10;

        }
        System.out.println("The Reversed num is : " + result);
        }

    }

