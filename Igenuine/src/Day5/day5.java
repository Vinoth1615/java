package Igenuine.src.Day5;
import java.util.*;
public class day5{
    public static void hallowPattern(){
       int[][] arr= initialize2dArray();
        System.out.println("The Hallow Matrix is ");
        for(int i=0;i<arr.length;i++){
            if(i==0 || i==arr.length-1)
                for(int j=0;j<arr[i].length;j++)
                    System.out.print(arr[i][j]+" ");
            else{
                for(int j=0;j<arr[i].length;j++){
                    if(j==0 || j==arr[i].length-1)
                        System.out.print(arr[i][j]+" ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void Sortandcount(){
        int [] [] arr = initialize2dArray();
        int count = 0;

    }
    public static void Maxinrow(){
        int[] [] arr = initialize2dArray();
        int k =0;
        System.out.println("\nThe Max of Each row is :");
        for(int[] i :arr){
            int max = arr[k][0];
            for(int j:i)
                if(max<j)
                    max = j;
            System.out.print(max+" ");
            k++;
            System.out.println();
        }

    }
    public static void rowToColumn(){
        int[] [] arr = initialize2dArray();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[j][i]+ " ");
            System.out.println();
        }

    }


    public static void SnakePattern(){
        int [] [] array = initialize2dArray();
        int sp =0;
        for(int[] i : array){
            if (sp%2==0){
                for(int j: i)
                    System.out.print(j + " ");
            }else{
                for(int j=i.length-1;j>=0;j--)
                    System.out.print(i[j]+ " ");
            }
            sp++;
            System.out.println();
        }
    }



    public static void SumOfDiagonal() {
        int sum = 0;
        int[][] array = initialize2dArray();
        display2DArray(array);
        if (array.length == array[0].length) {
            for (int i = 0; i < array[0].length; i++) {
                sum += array[i][i];
            }
            System.out.println("Sum of the Diagonal array is : " + sum);
            sum = 0;
            for( int i=array[0].length-1;i>=0;i--)
                sum += array[i][i];
            System.out.println("Sum of the secondaryDiagonal array is : " + sum);
        }
    }
    public static void SumOf2dArray(){
        int sum = 0;
        int[][] array = initialize2dArray();
        display2DArray(array);
        for(int[] i : array){
            for(int j: i)
                sum = sum + j;
        }
        System.out.println("Sum of the array is : " +sum);
    }
    public static int[][] initialize2dArray() {
        Scanner  s = new Scanner(System.in);
        System.out.print("Enter the size of the array row : ");
        int row = s.nextInt();
        System.out.print("Enter the size of the array column : ");
        int column = s.nextInt();
        int[][] array = new int [row] [column];
        System.out.println("Enter the Array Values: ");
        for(int i =0; i<row;i++){
            for(int j =0; j<column;j++){
                array[i][j] = s.nextInt();
            }
        }
        return array;
    }
    public static void display2DArray(int[] [] array){
        System.out.println("The array is : ");
        for(int[] i : array){
            for(int j: i)
                System.out.print( j+" ");
        System.out.println();
        }


    }
    public static void main(String[] args){
       hallowPattern();
    }
}