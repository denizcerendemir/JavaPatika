import java.util.Scanner;

public class odevCiftVeDort {
    public static void main(String[] args) {
        int number ;
        int total=0 ;

        Scanner input = new Scanner(System.in);


        do {
            System.out.print("sayi giriniz :");
            number= input.nextInt();
            if (number%2 ==0 && number%4==0 && number>0){
                total +=number;
            }
        }while (number>0);
        System.out.print("Toplam:"+total);
    }
}
