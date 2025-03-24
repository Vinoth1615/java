package Day4;
import java.util.*;
public class Amicable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number2 : ");
        int num3 = sc.nextInt();
        int div_num1 = 0, div_num2 = 0;
        for (int i = 1; i < (num1 / 2) + 1; i++) {
            if (num1 % i == 0) {
                div_num1 += i;
            }

        }
        for (int i = 1; i < (num3 / 2) + 1; i++) {
            if (num3 % i == 0) {
                div_num2 += i;
            }
        }
        if(num1== div_num2 && num3== div_num1)
            System.out.println("It is a Amicable Number");
        else
            System.out.println("No");
    }
}
