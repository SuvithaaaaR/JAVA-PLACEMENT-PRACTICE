import java.util.Scanner;
public class Prime { 
   public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count=0;
       
        for(int i=start ;i<=end;i++){
            boolean isprime = true;
            for(int j=2;j<=i/2;j++){
                 
                if(i%j==0){
                    isprime = false;
                    break;
                }
                }
                if(isprime){ 
                    count++;
        
        } 
            }
            System.out.print(count);
             
        }
       
    } 
