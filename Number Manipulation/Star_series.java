import java.util.Scanner;
public class Star_series {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int no=0;
        for(int i = 1 ; i<=n; i++){
            for(int j = 0 ;j<i; j++){
                no=i+j;
                System.out.printf("%d " , no);
            }
          System.out.println();
        }
          
    }
}
