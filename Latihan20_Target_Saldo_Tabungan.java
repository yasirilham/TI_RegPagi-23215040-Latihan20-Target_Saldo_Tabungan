/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Membuat Program Target Saldo Tabungan
 */
public class Latihan20_Target_Saldo_Tabungan {

    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bungaBulanan = 0.08; // 8%
        double saldoTarget = 6000000;
        int bulan = 0;

        System.out.println("Saldo Awal: Rp. " + saldoAwal);
        System.out.println("Bunga/Bulan: 8%");
        System.out.println("Saldo Target: Rp. " + saldoTarget);
        System.out.println();

        while (saldoAwal < saldoTarget) {
            bulan++;
            saldoAwal += saldoAwal * bungaBulanan;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", bulan, saldoAwal);
        }
    }
}
