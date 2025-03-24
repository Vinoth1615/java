public class Pattern1{
    public static void main(String args[]){
        int p1=65,p2=97,p=1;
        int n=5;
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                if(p%2==0){
                    System.out.print((char) p2 + " ");
                    p++;
                    p1++;
                    p2++;
                }else{
                    System.out.print((char)p1 + " ");
                    p++;
                    p1++;
                    p2++;
                }
            }
            System.out.println();
        }
    }
}
//            OUTPUT
//                A
//                b C
//                d E f
//                G h I j

