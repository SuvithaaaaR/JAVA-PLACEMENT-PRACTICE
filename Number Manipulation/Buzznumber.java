import java.util.Scanner;
public class Buzznumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no%7 ==0  ){
            System.out.println(no +" is Buzz number");

        }else if(no%10 == 7){
            System.out.println(no+" is Buzz number" );
        }
        else{
            System.out.println(no+" is Not buzz number");
        }
    }
}
