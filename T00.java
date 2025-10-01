import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i1, i2, j, k;

        i1 = Integer.parseInt(input.nextLine());
        i2 = Integer.parseInt(input.nextLine());
        if (i1 % 2 == 0) {
            System.out.println("Bilangan pertama : Genap");
        } else {
            System.out.println("Bilangan pertama : Ganjil");
        }
        if (i2 % 2 == 0) {
            System.out.println("Bilangan kedua : Genap");
        } else {
            System.out.println("Bilangan kedua : Ganjil");
        }
        if (i1 > i2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (i2 > i1) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Bilangan sama besar");
            }
        }
        if (i1 % 2 == 0 && i2 % 2 == 0) {
            j = i1 + i2;
            System.out.println("Hasil penjumlahan: " + j);
        } else {
            if (i1 % 2 == 1 && i2 % 2 == 1) {
                k = i1 * i2;
                System.out.println("Hasil perkalian: " + k);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
