import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        int k, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz :");
        k = input.nextInt();

        for (i = 0; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
