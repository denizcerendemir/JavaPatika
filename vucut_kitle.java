import java.util.Scanner;
public class vucut_kitle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float boy;
        float kitle_indeks;
        float kilo ;
        System.out.print("Lütfen boyunuzu (santimetre cinsinde) giriniz :");
        boy = input.nextInt();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextInt();
        System.out.println("HESAPLANIYOR....");
        kitle_indeks = kilo  / ((boy/100) * (boy/100));
        System.out.println("Vücut Kitle İndeksiniz :"+ kitle_indeks);
    }
}
