package Day4;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of terms : ");
        int n = sc.nextInt();
        int first =0;
        int second = 1;
        int next_num=0;
        System.out.print(first+ " ");
        System.out.print(second+ " ");
        while(true){
            next_num = first+second;
            if(n<next_num)
                break;
            int temp = first;
            first = second;
            second=next_num;
            System.out.print(next_num + " ");
        }
//        for(int i=0;i<n;i++){
//            next_num = first+second;
//            int temp = first;
//            first = second;
//            second=next_num;
//            System.out.print(next_num + " ");
//        }

    }

    public static class HallowPattern {

    }
}
