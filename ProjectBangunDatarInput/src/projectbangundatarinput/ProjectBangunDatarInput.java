/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatarinput;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProjectBangunDatarInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // HITUNG LUAS PERSEGI
        System.out.println("Menghitung Luas Persegi");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Sisi Persegi : ");
        double a = input.nextDouble();
        
        Persegi b = new Persegi(a);
        b.outputluasPersegi();
        
        // HITNG LUAS PERSEGI PANJANG
        System.out.println("Menghitung Luas Persegi Panjang");
        
        System.out.print("Masukkan Nilai Sisi Panjang : ");
        double m = input.nextDouble();
        System.out.print("Masukkan Nilai Sisi Lebar : ");
        double n = input.nextDouble();
        
        PersegiPanjang x = new PersegiPanjang(m, n);
        x.outputluasPersegiPanjang();
        
        // HITUNG LUAS LINGKARAN
        System.out.println("Menghitung Luas Lingkaran");
        
        System.out.print("Masukkan Panjang Jari Jari Lingkaran : ");
        double o = input.nextDouble();
        
        Lingkaran p = new Lingkaran(o);
        p.outputluasLingkaran();
        
        // HITUNG LUAS SEGITIGA
        System.out.println("Menghitung Luas Segitiga");
        
        System.out.print("Masukkan Nilai Sisi Pertama Segitiga :");
        double q = input.nextDouble();
        System.out.print("Masukkan Nilai Sisi Kedua Segitiga :");
        double r = input.nextDouble();
        System.out.print("Masukkan Nilai Sisi Ketiga Segitiga :");
        double s = input.nextDouble();
        
        Segitiga t = new Segitiga(q, r, s);
        t.outputluasSegitiga();
        
    }
    
}
