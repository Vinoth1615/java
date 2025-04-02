////
//import java.util.*;
//class ChocolateDistribute
//{
//    public static void ChocoDistribute(int students, int chocolates)
//    {
//        int[] ChocoArray = new int[students];
//        ChocoArray[0] = 1;
//        chocolates--;
//        int i = 1, n=2;
//        while(chocolates>0){
//            if(chocolates<n && i%students !=0)
//            {
//                ChocoArray[i] += chocolates;
//                chocolates = 0;
//            }
//            if(chocolates<n && i%students ==0)
//            {
//                ChocoArray[0] += chocolates;
//                chocolates = 0;
//            }
//            if(i%students==0 && chocolates>n) {
//                i=0;
//                ChocoArray[i] += n;
//                chocolates -= n;
//                i++;
//                n++;
//            }else if(i%students != 0 && chocolates>n){
//                ChocoArray[i] += n;
//                chocolates = chocolates - n;
//                i++;
//                n++;
//            }
//        }
//        System.out.println("Chocolate Distribution : "+Arrays.toString(ChocoArray));
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Number of Students :");
//        int st = sc.nextInt();
//        System.out.print("Enter the Number of Chocolates :");
//        int cho = sc.nextInt();
//        ChocoDistribute(st,cho);
//    }
//}
class Chocolates{
    public static void main(String[] args){
        int chocolates = 10, students =3 ;
        int[] ChocoArray = new int[students];

        ChocoArray[0] = 1;
        chocolates--;
        int i = 1;
        while(chocolates>0){
            if(i%students==0) {
                i=0;
                ChocoArray[i] += chocolates;
                chocolates = 0;
            }else {
                ChocoArray[i] = ChocoArray[i - 1] + 1;
                chocolates = chocolates - (ChocoArray[i - 1] + 1);
                i++;
            }
        }

        for(int j : ChocoArray)
            System.out.print(j+" ");
    }
}