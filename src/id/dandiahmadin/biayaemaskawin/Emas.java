/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.biayaemaskawin;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class Emas
 */
public class Emas {
    private double harga;
    private double berat;
    
    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public double getBerat() {
        return berat;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public double totalHarga() {
        return harga * berat;
    }
}
