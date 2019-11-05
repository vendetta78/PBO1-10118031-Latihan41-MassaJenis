package pbo1.pkg1018031.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menghitung massa jenis
 */
public class PBO11018031Latihan41MassaJenis {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Kubus kbs = new Kubus();

        System.out.println("========Massa Jenis Kubus========");
        System.out.print("Sisi : ");
        kbs.setSisi(scn.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(scn.nextInt());

        System.out.println("\n" + "========Hasil Perhitungan========");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : "
                + kbs.hitungMassaJenis(kbs.getMassa(),
                        kbs.hitungVolume(kbs.getSisi())));
    }

}
