package Day4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array : ");
        for(int i =0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        int a=0,max=arr[0];
        for(int i=0;i<4;i++){
            if(arr[i]>a){
                a=max;
                max=arr[i];
            }

        }
        System.out.println();
        System.out.println(max);
    }
}
