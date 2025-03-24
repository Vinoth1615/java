import java.util.*;
public class DivisibleBythreeAndFive{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int count = 0;

        System.out.print("Enter the num :");
        int n = s.nextInt();
        for(int i=0; i<n;i++){
            if(i%3==0 && i%5==0){
                count++;
            }

        }
        System.out.println("count : " +count);
    }
}