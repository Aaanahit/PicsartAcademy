import java.util.Scanner;

public class zuygAchmanKarg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num%2==0){
            for (int i=0; i<=100;++i){
                System.out.println(i);
            }
        }else
        {
            for (int i=100; i>=0;--i){
                System.out.println(i);

            }
        }
    }
}
