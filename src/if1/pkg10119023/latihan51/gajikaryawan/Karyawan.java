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
public class Karyawan {
    protected String nik,nama,jabatan;
    protected int golongan;
    
    public String getNik(){
        return nik;
    }
    public String getNama(){
        return nama;
    }
    public String getJabatan(){
        return jabatan;
    }   
    public int getGolongan(){
        return golongan;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    public void setGolongan(int golongan){
        this.golongan = golongan;
    }
}
