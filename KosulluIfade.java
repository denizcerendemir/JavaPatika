import java.util.Scanner;

public class KosulluIfade {
    public static void main(String[] args) {
        String userName, password;
        int select = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adiniz:");
        userName = input.nextLine();
        System.out.print("Sifreniz:");
        password = input.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giris Yaptiniz !");
        } else {
            System.out.print("Bilgileriniz Yanlis! Sifrenizi sifirlamak icin 1'basin : ");
            if (select == 1) {
                String newPassword;
                select = input.nextInt();
                System.out.println("Yeni Sifreniz:");
                newPassword = input.next();
                    if (newPassword.equals("java123")||newPassword.equals(password)) {
                        System.out.println("Yeni Sifre Eski sifre ile ayni olamaz !");
                        System.out.println("Yeni Sifreniz:");
                        newPassword = input.next();
                    }
                System.out.print("Yeni Sifreniz Basariyla olusturuldu");
            }
            else {
                System.out.print("Hatali tuslama");
            }
        }
    }
}

