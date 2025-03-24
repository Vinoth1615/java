package Day4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num : ");
        int n= sc.nextInt();
        int rev =0;
//        int a=n;
//        while(a>0){
//            int digit= a%10;
//            rev = rev*10+digit;
//            a = a/10;
//        }
//        if(rev==n){
//            System.out.print("Pallindrome number " +n);
//        }else
//            System.out.print("Null");
        int ori = n;
        while(n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }
        if(ori == rev){
            System.out.println(ori+"is an palindrome");
        }else{
            System.out.println(ori+"is not an palindrome");
        }
    }
}
