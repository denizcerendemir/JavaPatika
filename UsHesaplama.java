import  java.util.Scanner;
public class UsHesaplama {
    public static void main(String[] args) {
     int a,b,usluSayi=1 ;
     Scanner input = new Scanner(System.in);
        System.out.print("Taban sayiyi yaziniz :");
        a=input.nextInt();
        System.out.print("Kuvveti yaziniz :");
        b=input.nextInt();

        for (int i=1 ; i<=b ; i++){
            usluSayi *=a;
        }
        System.out.print("Sonuc : "+usluSayi);
    }
}
