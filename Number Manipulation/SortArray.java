import java.util.Arrays;
import java.util.Scanner;

public class SortArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int mid = (n + 1) / 2;

        // First half in ascending order
        for(int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }

        // Second half in descending order
        for(int i = n - 1; i >= mid; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}