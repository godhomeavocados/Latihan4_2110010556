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
public class NilaiAkhir extends Mahasiswa{
    public int uts, uas, tugas;
    
    public NilaiAkhir (String nama,String npm,int uts, int uas, int tugas){
        super(nama,npm);
        this.uts    = uts;
        this.uas    = uas;
        this.tugas  = tugas;
        this.nama   = nama;
        this.npm    = npm;
}
    public int hitungNilaiAkhir(){
        return(int)(0.3 * 0.3 * uas + 0.4 * tugas);
    }
}