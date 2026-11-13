package Kuis2;

import java.util.Scanner;

public class Kuis29Rayhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pengunjung: ");
        int n = sc.nextInt();
        int totalPendapatan = 0;
        int totalUsia = 0;
        int usia12 = 0, usiaTua = 0;
        int nim2 = 86;
        int kuotaDewasa = (nim2 % 3) + 2;


        for (int i = 0; i <= n; i++) {
            System.out.print("Usia pengunjung ke-" + (i + 1) + ": ");
            int usia = sc.nextInt();

            if (usia == 0) {
                break;
            }
            if (kuotaDewasa == usia) {
                System.out.println("Kuota dewasa habis, Pengunjung ke-" + i + "ditolak");
                break;
            }

            if (usia < 1 || usia > 80) {
                System.out.println("Input tidak valid, ulangi");
                System.out.print("Usia pengunjung ke-" + (i + 1) + ": ");
                usia = sc.nextInt();

            }
            // Harga tiket: usia di bawah 12 tahun Rp 25000, selain itu Rp 40000
            int harga = 0;
            if (usia < 12) {
                harga = 25000;
            } else {
                harga = 40000;
            }
            if (usia < 12) {
                usia12++;
            }
            usiaTua++;
            totalPendapatan += harga;
            totalUsia += usia;
            System.out.println("  Harga tiket: Rp " + harga);
        }
        double rataUsia = totalUsia / n;

        System.out.println("=== REKAP HARIAN ===");
        System.out.println("Total pendapatan : Rp " + totalPendapatan);
        System.out.println("Rata-rata usia   : " + rataUsia + " tahun");
        System.out.println("Jumlah pengunjung anak dibawah 12 tahun: " + usia12);
        System.out.println("Jumlah pengunjung usia tua: " + usiaTua);
        sc.close();
    }
}
