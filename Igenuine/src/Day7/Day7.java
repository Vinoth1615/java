package Igenuine.src.Day7;
import java.util.Scanner;
    class Strings {
        public String initializeStr() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a String : ");
            return sc.nextLine();
        }

        public void iteratingStr(String str) {
            for (int i = 0; i < str.length(); i++)
                System.out.print(str.charAt(i) + " ");
        }

        public int indexOfCharSequenceInString(String str) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The Character Sequence : ");
            return str.indexOf(sc.next().charAt(0));
        }

        public boolean containsMethod(String str) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The Character Sequence : ");
            return str.contains(sc.nextLine());
        }

        public int occurrenceOfAString(String str) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the character to find the frequency: ");
            char c = sc.next().charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) == c)
                    count++;
            return count;
        }

        public String concatString() {
            String str1 = initializeStr();
            String str2 = initializeStr();
            return str1.concat(str2);
        }

        public String inverseCaseString(String str) {
            String res = "";
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i)))
                    res += Character.toLowerCase(str.charAt(i));
                else
                    res += Character.toUpperCase(str.charAt(i));
            }
            return res;
        }

        public boolean palindrome(String str) {
            str = str.toLowerCase();
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }

        public void palindromeSeries(String str) {
            String[] strArr = str.split(" ");
            for (String i : strArr) {
                boolean res = palindrome(i);
                if(res)
                    System.out.print(i + " ");
            }
            System.out.println();
        }

        public String firstPalindrome(String str) {
            String[] strArr = str.split(" ");
            for (String i: strArr) {
                boolean res = palindrome(i);
                if (res)
                    return i;
            }
            return "";
        }

    }
    public class Day7{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char i ;
            System.out.println("String Properties And Methods");
            Strings strings = new Strings();
            do {
                String str = strings.initializeStr();
                System.out.print("""
                    1. Length
                    2. Uppercase
                    3. Lowercase
                    4. Index of Specific Char
                    5. Contains Method
                    6. Iterate String
                    7. Occurrence of string
                    8. Concatenation
                    9. Inverse the Case of String
                    10. Palindrome
                    11. Palindrome Series
                    12. First Palindrome
                    """);
                System.out.print("Enter Your Choice : ");
                int num = sc.nextInt();
                switch (num) {
                    case 1 -> System.out.println(str.length());
                    case 2 -> System.out.println(str.toUpperCase());
                    case 3 -> System.out.println(str.toLowerCase());
                    case 4 -> System.out.println(strings.indexOfCharSequenceInString(str));
                    case 5 -> System.out.println(strings.containsMethod(str));
                    case 6 -> strings.iteratingStr(str);
                    case 7 -> System.out.println(strings.occurrenceOfAString(str));
                    case 8 -> System.out.print(strings.concatString());
                    case 9 -> System.out.println(strings.inverseCaseString(str));
                    case 10 -> System.out.println(strings.palindrome(str));
                    case 11 -> strings.palindromeSeries(str);
                    case 12 -> System.out.println(strings.firstPalindrome(str));
                    default -> System.out.print("Wrong Choice");
                }
                System.out.print("Do you want to continue (y/n) : ");
                i = sc.next().charAt(0);
            }while (i=='y'|| i=='Y');
        }
    }

