import java.util.Scanner;
public class Arrayunique {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//5
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int uniq=arr[0];//1  2 3
        // boolean uniqq=true; // true  //true
        for(int i = 1;i<n;i++){ //i=1 1<5    i=2  2<5   i=3  3<5  i=4 4<5
            if(arr[i]!=uniq){ //1==1    2==1   2==3  3==3
                uniq=arr[i]; //2 //3 
            }
        }
        System.out.print(uniq);
    }

}
