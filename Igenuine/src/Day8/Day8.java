package Igenuine.src.Day8;
import java.util.Scanner;

class StringBuilderMethods {
    Scanner sc = new Scanner(System.in);
    public StringBuilder initializeStringBuilder(){
        System.out.print("Enter a String : ");
        return new StringBuilder(sc.nextLine().trim());
    }
    public String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public boolean compareStringBuilder(StringBuilder s1, StringBuilder s2){
        return s1.toString().equalsIgnoreCase(String.valueOf(s2));
    }
    public void options(){
        StringBuilder sb = initializeStringBuilder();
        StringBuilder revSb = new StringBuilder(reverseString(sb.toString()));
        System.out.println(compareStringBuilder(sb, revSb));
    }
}

class Day8{
    public static void main(String[] args) {
        StringBuilderMethods stringBuilderMethods = new StringBuilderMethods();
        stringBuilderMethods.options();
    }
}