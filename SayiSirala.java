import  java.util.Scanner;
public class SayiSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bir,iki,uc ;
        
        System.out.print("1. sayiyi giriniz :");
        bir= input.nextInt();
        System.out.print("2. sayiyi giriniz :");
        iki= input.nextInt();
        System.out.print("3. sayiyi giriniz :");
        uc= input.nextInt();
        
        if (bir<iki && bir<uc){
            if (iki<uc){
                System.out.print("birinci sayi<ikinci sayi<ucuncu sayi");
            }
            else{
                System.out.print("birinci sayi<ucuncu sayi<ikinci sayi");
            }
        }
        else if (iki<bir && iki<uc) {
            if (bir<uc){
                System.out.print("ikinci sayi<birinci sayi<ucuncu sayi");
            }
            else{
                System.out.print("ikinci sayi<ucuncu sayi<birinci sayi");
            }
        }
        else {
            if (bir<iki){
                System.out.print("ucuncu sayi<birinci sayi<ikinci sayi");
            }
            else{
                System.out.print("ucuncu sayi<ikinci sayi<birinci sayi");
            }

        }

    }
    }
