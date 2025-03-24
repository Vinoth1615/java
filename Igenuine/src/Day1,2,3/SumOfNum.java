import java.util.*;
public class SumOfNum{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the num :");
        int n = s.nextInt();
        for(int i=0; i<=n;i++){
            sum = sum+i;

        }
        System.out.println("SumOfNum is" +sum);
    }
}