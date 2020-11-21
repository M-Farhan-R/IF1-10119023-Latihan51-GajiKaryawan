/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan51.gajikaryawan;

/**
 *
 * @author Muhammad Farhan R <farhan.10119023@mahasiswa.email.ac.id>
 */
public class Manager extends Karyawan{
    private float tunjanganKehadiran,tunjanganJabatan,tunjanganGolongan;
    private int kehadiran;
    
    public int getKehadiran(){
        return kehadiran;
    }
    public void setKehadiran(int kehadiran){
         this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        return tunjanganKehadiran = 10_000*hadir;
    }
    public float tunjanganJabatan(String jabatan){
        if (jabatan.equalsIgnoreCase("manager")){
            tunjanganJabatan = 2_000_000;
        } else if(jabatan.equalsIgnoreCase("kabag"))
            tunjanganJabatan = 1_000_000;
        return tunjanganJabatan;
    }
    public float tunjanganGolongan(int golongan){
        switch (golongan){
            case 1:
                tunjanganGolongan = 500_000;
                break;
            case 2:
                tunjanganGolongan = 1_000_000;
                break;
            case 3:
                tunjanganGolongan = 1_500_000;
                break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        float gajiTotal;
        return gajiTotal = tunjanganKehadiran+tunjanganJabatan+tunjanganGolongan;
    }
}
