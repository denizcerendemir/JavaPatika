import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year,kalan;

        System.out.print("Hesaplamak istediginiz yili girin :");
        year=input.nextInt();

        kalan=year%4;

        if (kalan==0){
            System.out.print("Girdiginiz yil artik yildir.");
        }
        else {
            System.out.print("Girdiginiz yil artik yil degildir.");
        }

    }
}
