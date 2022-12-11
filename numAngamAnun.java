import java.util.Scanner;

public class numAngamAnun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int i =scanner.nextInt();
        String num = (i + name);
        while (i!=0){
            System.out.println(name);
            i--;
        }

    }
}
