import java.util.Scanner;

public class BurcHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gun, ay;
        System.out.print("Dogum gununuzu giriniz :");
        gun = input.nextInt();
        System.out.print("Dogum ayinizi giriniz :");
        ay = input.nextInt();

        if (ay == 1) {
            if (gun >= 22) {
                System.out.print("Kova Burcu");
            } else if (gun <= 21) {
                System.out.print("Oglak  Burcu");
            }

        } else if (ay == 2) {
            if (gun >= 20) {
                System.out.print("Balik Burcu");
            } else if (gun <= 19) {
                System.out.print("Kova  Burcu");
            }

        } else if (ay == 3) {
            if (gun >= 21) {
                System.out.print("Koc Burcu");
            } else if (gun <= 20) {
                System.out.print("Balik  Burcu");
            }

        } else if (ay == 4) {
            if (gun >= 21) {
                System.out.print("Boga Burcu");
            } else if (gun <= 20) {
                System.out.print("Koc  Burcu");
            }

        } else if (ay == 5) {
            if (gun >= 22) {
                System.out.print("Ikizler Burcu");
            } else if (gun <= 21) {
                System.out.print("Boga  Burcu");
            }

        } else if (ay == 6) {
            if (gun >= 23) {
                System.out.print("Yengec Burcu");
            } else if (gun <= 22) {
                System.out.print("Ikizler  Burcu");
            }

        }else if (ay == 7) {
            if (gun >= 23) {
                System.out.print("Aslan Burcu");
            } else if (gun <= 22) {
                System.out.print("Yengec  Burcu");
            }

        }else if (ay == 8) {
            if (gun >= 23) {
                System.out.print("Basak Burcu");
            } else if (gun <= 22) {
                System.out.print("Aslan  Burcu");
            }

        }else if (ay == 9) {
            if (gun >= 23) {
                System.out.print("Terazi Burcu");
            } else if (gun <= 22) {
                System.out.print("Basak  Burcu");
            }

        }else if (ay == 10) {
            if (gun >= 23) {
                System.out.print("Basak Burcu");
            } else if (gun <= 22) {
                System.out.print("Aslan  Burcu");
            }

        }else if (ay == 11) {
            if (gun >= 23) {
                System.out.print("Terazi Burcu");
            } else if (gun <= 22) {
                System.out.print("Akrep Burcu");
            }

        }else if (ay == 12) {
            if (gun >= 22) {
                System.out.print("Oglak Burcu");
            } else if (gun <= 21) {
                System.out.print("Yay Burcu");
            }

        }

    }
}
