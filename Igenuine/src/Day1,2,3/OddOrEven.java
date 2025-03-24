import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int even=1,odd=0 ,n=0;
        do {
            System.out.print("Enter the size of the array : ");
             n = sc.nextInt();
        }while(n>10);

        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even = even*a[i];
            }else{
                odd = odd+a[i];
            }

        }
        System.out.println("Odd: "+ odd);
        System.out.println("Even: "+even);
// To find Largest element ib=n the array
        int large = a[0];
        for(int i=0;i<n;i++){
            if(a[i]>large)
                large=a[i];
        }
        System.out.print("The largest num is : " +large);
    }
}
