package Igenuine.src.Day10;
import java.util.*;

public class Day10 {
    private  void coinChange(int n , int curr, String s){
        if(n==curr){
            System.out.print(s);
            return;
        }
        if(curr>n)
            return;
        coinChange(n,curr+1,s+1);
        coinChange(n,curr+2,s+2);
        coinChange(n,curr+3,s+3);
    }
    public static int maxInArray_Recursion(int[] arr, int idx, int max){    //Day11
        if(idx == arr.length)
            return max;
        if(arr[idx]>max)
            max = arr[idx];
        return maxInArray_Recursion(arr,idx+1,max);
    }

    public boolean checkSorted(int[] arr,int idx){
        if(idx==arr.length)
            return true;
        if(!(arr[idx]>arr[idx-1]))
            return false;
        return checkSorted(arr,idx+1);
    }
    public static int fib(int n){
        if(n==0 || n==1)
            return n;
        int fibm1 = fib(n-1);
        int fibm2 = fib(n-2);
        return fibm1+fibm2;
    }
    public boolean palindrome_Recursion(String s,int left,int right){
        if(left>=right)
            return true;
        if(s.charAt(left)!=s.charAt(right))
            return false;
        return palindrome_Recursion(s,left+1,right-1);
    }

    public static String numToWords(int digit ){                //Day11
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if (digit < 0) {
            return "Negative " + numToWords(-digit);
        }
        if(digit == 0 )
            return "Zero";
        int num = digit%10;
        return numToWords(digit/10)+" "+words[num];
    }

    public static int occurrenceOfArray_Recursion(int[] arr , int idx, int search)        // Day11
    {
        if(idx == arr.length)
            return -1;
        if(arr[idx] == search)
            return idx;
        return occurrenceOfArray_Recursion(arr,idx+1,search);
    }

    public static int lastOccurrence(int[] arr , int idx,int search){           //Day11
        if(idx<0)
            return -1;
        if(arr[idx]==search)
            return idx;
        return lastOccurrence(arr,idx-1,search);
    }

    public static void allOccurrence(int[] arr,int idx,int search){             //Day11
        if(idx>=arr.length)
            return;
        if(arr[idx]==search)
            System.out.print(idx + " ");
        allOccurrence(arr,idx+1,search);
    }

    public static void  recursion(int n){
        System.out.println((n%2 == 0)?n:"");
       if(n == 0 )
           return;
       recursion(n-1);
    }

    public static int  nNaturalNos(int n){ //sum of n natural number using recursion
        if(n <= 1)
            return 1;
        return n+nNaturalNos(n-1);
    }

    public  int  factorial(int n){ //Factorial using recursion
        if(n <= 0)
            return 1;
        return n*factorial(n-1);
    }

    public void disArray(int[] arr , int i){
            if(i == arr.length)
                return ;
        System.out.println(arr[i]);
        disArray(arr, i+1);
    }

    public  int searchEle(int[] arr,int index, int target){
        if(index == arr.length)
            return -1;
        if(arr[index] == target)
            return index;
        return searchEle(arr,++index,target);
    }

    public int binarySearch(int[] arr, int start, int end, int target) {
        if(start<=end){
            int mid = start+(end - start)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid]<target)
                return binarySearch(arr, mid, end, target);
            if(arr[mid]>target)
                return binarySearch(arr, start, mid, target);
        }
        return -1;
    }

    public static void main(String[] args) {
      Day10 recursion = new Day10();
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : " );
//        int n = sc.nextInt();
//        System.out.print("The num_to_word_is: " +numToWords(n).trim());

//        int n = sc.nextInt();
//        int arr[] = {1,2,3,4,5} ;
//        D10.disArray(arr,0);
//        System.out.print(recursion.searchEle(new int[]{1,5,7,10},0,11));
//        System.out.print("Binary Search : " +recursion.binarySearch(new int[]{1,5,7,10,34,45,56},0,6,1));
//        System.out.print("The max element in array is:"+maxInArray_Recursion(new int[]{1,-5,7,10,56,34,45},0,Integer.MIN_VALUE));
//        System.out.println("the first Occurrence is : " + occurrenceOfArray_Recursion(new int[]{1,-5,7,10,56,34,10,45},0,10));
//        System.out.println("The Last Occurrence is : "+lastOccurrence(new int[]{1,-5,7,10,56,34,10,45,10,29,43,10,33,7},13,10));
//        System.out.print("All occurrence :");allOccurrence(new int[]{1,-5,7,10,56,34,10,45,10,29,43,10,33,7},0,10);
//        System.out.println("Palindrome using recursion :"+recursion.palindrome_Recursion("madam",0,4) );
//        System.out.print("Enter the number of terms : ");
//        int num =sc.nextInt();
//        System.out.print("Fibonacci Series: ");
//        for (int i = 0; i < num; i++) {
//            System.out.print(fib(i) + " ");  // Print each Fibonacci number
//        }
//        System.out.println(" ");
//        System.out.println(recursion.checkSorted(new int[]{1,2,3,7,4,5,6},1));
        System.out.print("CoinChange : ");recursion.coinChange(3,0," ");



    }

}
