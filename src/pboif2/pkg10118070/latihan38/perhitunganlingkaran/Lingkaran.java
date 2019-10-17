/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan38.perhitunganlingkaran;

/**
 *
 * @author Ailyasha
 * Nama : Aufa Ilyasha
 * Nim : 10118070
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
public class Lingkaran {
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    
    private int hitungJariJari() {
        return diameter / 2;
    }
    
    private double hitungLuas() {
        return Math.PI * Math.pow(hitungJariJari(), 2);
    }
    
    private double hitungKeliling() {
        return 2 * Math.PI * hitungJariJari();
    }
    
    private String formatNilai(double nilai) {
        return String.format("%.2f", nilai).replace('.', ',');
    } 
    
    public void hitungLingkaran() {
        System.out.println("\n====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = " +
                hitungJariJari() + " cm");
        System.out.println("Luas Lingkaran = " +
                formatNilai(hitungLuas()) + " cm");
        System.out.println("Keliling Lingkaran = " +
                formatNilai(hitungKeliling()) + " cm");
        System.out.println("(Developed by : Aufa Ilyasha)");
    }
}
