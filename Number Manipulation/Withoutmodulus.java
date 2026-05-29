import java.util.Scanner;
public class Withoutmodulus {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int n=sc.nextInt();
        //Type - 1 withou using modulus operator -[Using & operator]
        if((no&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        //Type - 2 without using % -[Using XOR Operation]
        if((n==n-1)){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
