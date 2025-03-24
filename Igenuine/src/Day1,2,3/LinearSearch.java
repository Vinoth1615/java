import java.util.Scanner;

public class LinearSearch {
    public static int linearsearch(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array :");
        int s = sc.nextInt();
        int[] a=new int[s];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the search Element :");
        int target = sc.nextInt();
        int result = linearsearch(a,target);
        System.out.println("The Element is : "+result);
    }
}
