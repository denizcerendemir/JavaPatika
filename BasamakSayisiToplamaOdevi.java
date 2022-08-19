import java.util.Scanner;

public class BasamakSayisiToplamaOdevi {
    public static void main(String[] args) {
        int number,toplam=0,adet=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        number=input.nextInt();

        while (number!=0){

            toplam+=(number %10);
            number/=10;
            adet++;
        }
        System.out.println("girilen sayinin basamak sayisi :"+adet);
        System.out.println("girilen sayinin basamak degerleri toplami :"+toplam);

    }

}

