import java.util.Scanner;
public class Adding {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        // int [] num = new int[];
        int sum=0;
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
             
            if(ch>='0' && ch<='9'){
               
            sum+=ch-'0';
            
            }
        }
       System.out.println(sum);
    }
}
