import java.util.Scanner;


public class PemilihanBilangan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan sebuah angka : ");
        int angka = input.nextInt() ;

        if (angka % 2 == 0) {
            System.out.print("Angka " + angka + "termasuk bilangan genap " );
        }
        else {
            System.out.print("Angka " + angka + "termasuk bilangan ganjil " );
        }

    }
    
}