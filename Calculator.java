import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int sayi1, sayi2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz:");
        sayi1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        sayi2 = input.nextInt();

        System.out.print("1-Toplama:\n2-Çıkarma:\n3-Çarpma:\n4-Bölme:");
        select = input.nextInt();
        switch (select){
            case 1:
            System.out.print("Toplam:"+(sayi1+sayi2));
            break;
            case 2:
                System.out.print("Fark:"+(sayi1-sayi2));
                break;
            case 3:
                System.out.print("Çarpım:"+(sayi1*sayi2));
                break;
            case 4:
                if (sayi2!=0) {
                    System.out.print("Bölüm:" + (sayi1 / sayi2));
                }
                else {
                    System.out.print("Sayı sıfıra bölünemez");
                }
                break;
            default:
                System.out.print("Hatalı işlem seçimi");
        }
    }
}
