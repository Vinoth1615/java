import java.sql.SQLOutput;
import java.util.*;
public class DivideByFifty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num  : ");
        int n = sc.nextInt();
        for(int i =1; i<n;i++){
            if(n%i==0){
                System.out.print(i+"\n");
            }
        }

    }
}