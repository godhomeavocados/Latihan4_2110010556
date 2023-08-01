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
public class Main {
    public static void main(String[] args) {
        NilaiAkhir rafi = new NilaiAkhir ("Rafi","2110010556",100,80,100);
        
        System.out.println("Nama        :"+ rafi.getNama());
        System.out.println("NPM         :"+ rafi.getNpm());
        System.out.println("Nilai Akhir :"+ rafi.hitungNilaiAkhir());
    }
  
}
