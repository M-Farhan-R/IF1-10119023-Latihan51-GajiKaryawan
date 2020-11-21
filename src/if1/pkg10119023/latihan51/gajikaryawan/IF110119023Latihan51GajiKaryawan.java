/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan51.gajikaryawan;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program menghitung gaji pegawai
 *
 */

 import java.util.Scanner;
public class IF110119023Latihan51GajiKaryawan{
    public static void main(String[] args) {
        Manager run;
        run  = new Manager();
        Scanner scan = new Scanner(System.in);
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : "); run.setNik(scan.next());
        scan.nextLine();
        System.out.print("Masukkan Nama : "); run.setNama(scan.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : "); run.setGolongan(scan.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : "); run.setJabatan(scan.next());
        System.out.print("Masukkan Jumlah Kehadiran : "); run.setKehadiran(scan.nextInt());
        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t : "+run.getNik());
        System.out.println("Nama\t : "+run.getNama());
        System.out.println("Golongan : "+run.getGolongan());
        System.out.println("Jabatan\t : "+run.getJabatan());
        System.out.println();
        System.out.println("Tunjangan Golongan\t : "+run.tunjanganGolongan(run.getGolongan()));
        System.out.println("Tunjangan Jabatan\t : "+run.tunjanganJabatan(run.getJabatan()));
        System.out.println("Tunjangan Kehadiran\t : "+run.tunjanganKehadiran(run.getKehadiran()));
        System.out.println();
        System.out.println("Gaji Total\t : "+run.gajiTotal());
    }
}