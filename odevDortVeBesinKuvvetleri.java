import java.util.Scanner;

public class odevDortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int number, i;


        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz :");
        number = input.nextInt();
        System.out.print("Dordun kuvvetleri");
        for (i = 1; i < number; i *= 4) {

            System.out.println(i);
        }
        System.out.print("Besin kuvvetleri");
        for (i = 1; i < number; i *= 5) {

            System.out.println(i);
        }
    }
}
