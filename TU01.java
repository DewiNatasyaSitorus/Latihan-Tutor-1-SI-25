//12S25042-Dewi Natasya Sitorus

import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i1, i2, j, k;

        i1 = input.nextInt();
        if (i1 % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
        i2 = input.nextInt();
        if (i2 % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
        if (i1 > i2) {
            System.out.println(Integer.toString(i1) + " terbesar");
        } else {
            if (i2 > i1) {
                System.out.println(Integer.toString(i2) + " terbesar");
            } else {
                System.out.println("bilangan sama besar");
            }
        }
        if (i1 % 2 == 0 && i2 % 2 == 0) {
            j = i1 + i2;
            System.out.println("hasil penjumlahan " + j);
        } else {
            if (i1 % 2 == 1 && i2 % 2 == 1) {
                k = i1 * i2;
                System.out.println("hasil perkalian " + k);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
