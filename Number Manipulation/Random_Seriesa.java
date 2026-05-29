import java.util.Scanner;
public class Random_Seriesa {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int ran =1;
          
        for(int i = 1;i<=no;i++){
          
            ran = ran +i;
            if(ran>no){
                break;
             }
             System.out.print(ran + " ");
             
            }
           
        }
}
