import  java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {

        int n,r,nFaktoriyel=1,kombinasyon,rFaktoriyel=1,nEksirFaktoriyel=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Elaman sayisi (n):");
        n=inp.nextInt();
        System.out.print("Secim sayisi (r) : ");
        r=inp.nextInt();


        for (int i=1; i<=n ; i++){
            nFaktoriyel = nFaktoriyel*i;
        }
        for (int j=1; j<=r ; j++){
            rFaktoriyel=rFaktoriyel*j;
        }
        int nEksir = n-r;
        for (int k=1; k<= nEksir ; k++){
            nEksirFaktoriyel=nEksirFaktoriyel*k;
        }
        kombinasyon = nFaktoriyel/(rFaktoriyel*nEksirFaktoriyel);
        System.out.print("C(n,r)="+kombinasyon);
    }
}
