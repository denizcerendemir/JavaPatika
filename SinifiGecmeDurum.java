import java.util.Scanner;

public class SinifiGecmeDurum {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, toplam = 0, toplamDers = 0;
        double avarage;
        Scanner inp = new Scanner(System.in);

        System.out.print("Turkce Notunuz:");
        turkce = inp.nextInt();
        System.out.print("Matematik Notunuz:");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();
        System.out.print("Muzik Notunuz:");
        muzik = inp.nextInt();


        if (0 <= mat && mat <= 100) {
            toplam += mat;
            toplamDers++;
        }
        else if (0 <= fizik && fizik <= 100) {
            toplam += fizik;
            toplamDers++;
        }
        else if (0 <= kimya && kimya <= 100) {
            toplam += kimya;
            toplamDers++;
        }
        else if (0 <= muzik && 100 >= muzik) {
            toplam += muzik;
            toplamDers++;
        }
        else if (0 <= turkce && turkce <= 100) {
            toplam += turkce;
            toplamDers++;
        }
        avarage=(toplam / toplamDers);
        System.out.println("Ortalamaniz:" + avarage);
        if ( avarage<55){
            System.out.println("Kaldiniz");
        }
        else {
            System.out.println("Tebrikler gectiniz");
        }
        }

    }
