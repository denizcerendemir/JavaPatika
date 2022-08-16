import  java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yolUcret,yas,indirim=0,indirimliUcret,yolculukTipi,yolculukTipiIndirim;

        System.out.print("Mesafeyi giriniz (km) :");
        mesafe=input.nextInt();
        if (mesafe<0){
            System.out.print("Mesafe negatif sayi olamaz!");
        }
        yolUcret= (mesafe * 10)/100;

        System.out.print("Yasiniz :");
        yas=input.nextInt();
        
        if (yas<0){
            System.out.print("Yas negatif sayi olamaz!");
        } else if (yas<12) {
            indirim = (yolUcret*50)/100;
        }else if (yas>12 && yas<24) {
            indirim = (yolUcret*10)/100;
        }else if (yas>65) {
            indirim = (yolUcret*30)/100;
        }

        indirimliUcret=yolUcret-indirim;

        System.out.println("Yol ucreti :"+yolUcret);
        System.out.println("Yas indirimi :"+indirim);
        System.out.println("Ucret :"+indirimliUcret);

        System.out.print("Yolculugunuz gidis-donus ise 1 tek yon ise 2 :");
        yolculukTipi=input.nextInt();
        if (yolculukTipi!=1 && yolculukTipi!=2){
            System.out.print("Yolculuk tipi 1 ya da 2 olabillir.Hatali değer girildi.!");
        }

        if (yolculukTipi==1){
            yolculukTipiIndirim=(indirimliUcret*20)/100;
            System.out.println("Yolculuk tipi indirimli hali :"+yolculukTipiIndirim);
            indirimliUcret= indirimliUcret-yolculukTipiIndirim;
            System.out.println("Odenecek tutar :"+indirimliUcret);
        }

    }
}
