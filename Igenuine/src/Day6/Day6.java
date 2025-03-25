package Igenuine.src.Day6;
import java.util.*;
public class Day6 {
    public static void main(String[] args){
    }
    public static String INitializeStrings(){
        System.out.println("Enter the strings : ");
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        return s1;
    }
    public static void PrintEachCharacter(){
        System.out.print("Enter the strings to print each character:");
        String str= INitializeStrings();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }


    }
    public static String reverseString(){
        System.out.print("Enter the strings to reverse:");
        String str = INitializeStrings();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("The Reversed string is :  "+rev);
        return rev;
    }
    public static void StringToAscii(){
        System.out.print("Enter the strings to convert to ascii:");
        String str = INitializeStrings();
        for(int i=0;i<str.length();i++) {
            System.out.println(((int) str.charAt(i)));
        }
    }
    public static String Palindrome(){
        System.out.print("Enter the strings to reverse:");
        String str = INitializeStrings();
        String rev = reverseString();
        if(str.compareToIgnoreCase(rev)==0){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }
        return rev;

    }
    public static String reverseWordsInString(){
        String str = INitializeStrings();
        String rev = "";
        String[] words = str.split(" ");
        for(int i=words.length-1;i>=0;i--){
            rev = rev + words[i] + " ";
        }
        System.out.println("The reversed string is : "+rev);
        return rev;
    }

}





