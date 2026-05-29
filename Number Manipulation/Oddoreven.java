import java.util.*;
public class Oddoreven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no==0){
            System.out.println("Enter number ");

        }else if(no%2==0){
            System.out.println("Even");
        }else if(no<0){
            System.out.println("Enter valid number");
        }
        else{
            System.out.println("Odd");

        }
    }
}
