import java.util.Scanner;
public class dairealan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double yari_cap;
        double pi= 3.14;
        int merkez_aci;
        double alan ;
        System.out.print("Yarı çapı giriniz :");
        yari_cap = input.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz :");
        merkez_aci = input.nextInt();
        System.out.println("HESAPLANIYOR....");
        alan = (pi * (yari_cap*yari_cap) * merkez_aci) / 360;
        System.out.println("ALAN :"+ alan);
    }
}
