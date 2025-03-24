import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int num = s.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++) {

            arr[i] = s.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
