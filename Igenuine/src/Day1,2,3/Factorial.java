import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int sum = 1;
        System.out.print("Enter the num :");
        int n = s.nextInt();
        for(int i=1; i<=n;i++){
            sum = sum*i;

        }
        System.out.println("Factroial : " +sum);
    }
}