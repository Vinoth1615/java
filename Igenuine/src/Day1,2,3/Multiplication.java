import java.util.*;
public class Multiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num for multiplication table : ");
        int n = sc.nextInt();

        for (int i = 1; i<=10;i++){
            System.out.println(i +"x" + n + "=" + (i*n));

        }
    }
}