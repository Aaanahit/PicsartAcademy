import java.util.Scanner;

public class texerovPoxel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x != y) {
            System.out.println(y);
            if (y != x) {
                System.out.println(x);
            }

        }
    }
}

