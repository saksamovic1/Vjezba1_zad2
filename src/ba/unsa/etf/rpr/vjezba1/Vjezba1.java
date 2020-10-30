package ba.unsa.etf.rpr.vjezba1;
import java.util.Scanner;

public class Vjezba1 {
    public static boolean sumaCifara(int broj) {
        int suma = 0;
        int broj_pom=broj;
        while (broj!=0) {
            int cifra = broj%10;
            broj /= 10;
            suma = suma + cifra;
        }
        if ((broj_pom%suma) == 0) return true;
        else return false;
    }
    public static void ispis(int n) {
        for (int i=1; i<=n; i++)
        {
            if (sumaCifara(i)) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = unos.nextInt();
        ispis(n);
    }
}
