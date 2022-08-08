import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("birinci kenari giriniz :");
        a = input.nextInt();
        System.out.print("ikinci kenari giriniz :");
        b = input.nextInt();
        System.out.println("HESAPLANIYOR....");
        c = Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)));
        System.out.println("HIPOTENUS:"+c);
    }
}
