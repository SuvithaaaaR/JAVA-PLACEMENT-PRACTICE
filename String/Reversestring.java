
import java.util.Scanner;
public class Reversestring {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        // for(int i=0;i<s.length();i++){
        //     ans=s.charAt(i)+ans;
        // } Type 1

        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        System.out.print(ans);

    }

}