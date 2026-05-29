import java.util.Scanner;
public class Trendynumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no>=100 && no<=999){
            System.out.println("Trendy Number");
        }else if((no/10)%10 ==3){
            System.out.println("Trendy number");
        }else{
            System.out.println("Not a trendy number");
        }
}
}