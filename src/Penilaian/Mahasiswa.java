/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;

/**
 *
 * @author Administrator
 */
public class Mahasiswa {
    String nama,npm;
    
    ///gatter

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }
   
    //setter

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    public Mahasiswa (String nama,String npm){
        this.nama = nama;
        this.npm  = npm;
    }
}
