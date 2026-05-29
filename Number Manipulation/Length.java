import java.util.Scanner;
public class Length {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        // int count=0;
        // while(no!=0){
        //     count++;
        //     no=no/10; 

        // }
        // System.out.print(count);


int sum =0;
while(no!=0){
int rem = no%10;
sum = sum+rem;
no=no/10;


}

System.out.println(sum);
        
        }
    }

