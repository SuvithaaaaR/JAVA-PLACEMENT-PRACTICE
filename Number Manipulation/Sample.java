import java.util.Scanner;
public class Sample {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start: ");
        int a =sc.nextInt();
        System.out.println("Enter end: ");
        int b=sc.nextInt();
        int count=0;
        for(int i=a ;i<=b;i++){
            if(i%2==0){
                System.out.println("Even numbers \t"+ i);
            }else{
                count++;
            }
            
        }
System.out.println("Odd number "+count);
    }
}
