import  java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n sayisini giriniz :");
        int n = input.nextInt();
        double result = 0;
        for (int i = 1 ; i<=n;i++){
            result+=(1.0/i);
        }
        System.out.print("Harmonik seri toplami :"+result);
    }
}
