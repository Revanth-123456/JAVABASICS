import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // // System.out.print("*"); for 5 line *
        // //System.out.print(i); // 11111 22222 ...
        // //System.out.print(j); // 12345 12345 ...
        // }
        // System.out.println();
        // }
        // sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i + 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
