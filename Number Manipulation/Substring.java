import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();

        int index = email.indexOf('@');

        String domain = email.substring(index + 1);

        System.out.println(domain);
    }
}