import java.util.*;
public class Count {
    public static void mian(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = S.nextInt();
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println("Count is"+ count);
    }
}
