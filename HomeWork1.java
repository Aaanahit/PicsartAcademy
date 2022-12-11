import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int min;
        if (a + b + c + d == 0) {
            if (a < b && a < c && a < d) {
                min=a;
            }
            else if (b < c && b < d) {
                min=b;
            }
            else if (c < d) {
                min=c;
            }
            else {
                min=d;
            }
            System.out.println(min);
        }
    }
}
