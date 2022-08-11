import java.util.Scanner;
public class manav_kasa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double armutkg = 2.14 ;
        double elmakg = 3.67 ;
        double domateskg = 1.11 ;
        double muzkg =  0.95;
        double patlicankg = 5.00 ;
        double armut,elma,domates,muz,patlican,tutar;

        System.out.print("Armut Kaç Kilo ? :");
        armut = input.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        elma = input.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        domates = input.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        muz = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = input.nextInt();

        System.out.println("Toplam Tutar Hesaplanıyor....");
        tutar = (armutkg*armut)+(elmakg*elma)+(domateskg*domates)+(muzkg*muz)+(patlicankg*patlican);
        System.out.println("Toplam Tutar :"+ tutar);
    }
}
