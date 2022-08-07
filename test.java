import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int matematik,turkce,tarih,muzik,bedenEgitimi ;
        double ortalama ;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz :");
        matematik = input.nextInt();
        System.out.print("TÜrkçe notunuzu giriniz :");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz :");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz :");
        muzik = input.nextInt();
        System.out.print("Beden Eğitimi notunuzu giriniz :");
        bedenEgitimi = input.nextInt();
        ortalama = (matematik+turkce+tarih+muzik+bedenEgitimi)/5 ;
        System.out.println(ortalama);


    }
}
