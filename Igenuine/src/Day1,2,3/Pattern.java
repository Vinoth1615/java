import java.util.*;
public class Pattern{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num for rows: ");
        int n = sc.nextInt();
        System.out.println("Here is your pattern.......");

//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


//        for (int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*"+" ");
//
//            }
//            System.out.println();
//        }

//            *
//            * *
//            * * *
//            * * * *


//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        1
//        1 2
//        1 2 3
//        1 2 3 4


//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


//        1
//        2 2
//        3 3 3
//        4 4 4 4

//        int v=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(v++ +" ");
//            }
//            System.out.println();
//        }

//        1
//        2 3
//        4 5 6
//        7 8 9 10

//        char v='A';
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(v++ +" ");
//            }
//            System.out.println();
//        }

//        A
//        B C
//        D E F
//        G H I J


//          for (int i=n;i>0;i--){
//            for(int j=i;j>0;j--){
//                System.out.print("*"+" ");
//
//            }
//            System.out.println();
//        }

//            * * * *
//            * * *
//            * *
//            *

//            for (int i=0;i<n;i++){
//                for(int j=0;j<=i;j++){
//                    System.out.print("*"+" ");
//
//                }
//            System.out.println();
//        }
//            for (int i=3;i>0;i--){
//                for(int j=i;j>0;j--){
//                    System.out.print("*"+" ");
//
//                }
//            System.out.println();
//        }

//            *
//            * *
//            * * *
//            * * * *
//            * * *
//            * *
//            *
            for (int i=1;i<n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");

                }
            System.out.println();
        }
            for (int i=n-1;i>0;i--){
                for(int j=1;j<i;j++){
                    System.out.print(j+" ");

                }
            System.out.println();
        }

//        1
//        1 2
//        1 2 3
//        1 2
//        1



    }
}