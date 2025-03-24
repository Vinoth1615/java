import java.util.Scanner;

public class LessThanNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n ;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        System.out.print("Enter the elements of an array : ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(a[i]>a[j])
                    count++;
            }
            res[i]=count;

        }
        System.out.print("The count of less number : ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+ " ");
        }
        System.out.println();
//        for(int i=n-1;i>=0;i--) {
//            System.out.print(res[i] + " ");
//        }

        int k=0, l=n-1;
        while(k<l){
            int temp = res[k];
            res[k]=res[l];
            res[l]=temp;
            k++;
            l--;
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+ " ");
        }

    }
}