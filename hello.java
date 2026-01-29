import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Hello World");
        }
        sc.close();
    }
}
