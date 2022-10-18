/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatarinput;

/**
 *
 * @author user
 */
public class PersegiPanjang {
    double s;
    double t;
    
    PersegiPanjang(double x, double y) {
        this.s = x;
        this.t = y;
    }
    
    void outputluasPersegiPanjang() {
        double hasil = this.s * this.t;
        System.out.println("Luas Persegi Panjang dengan panjang sisi " + this.s + " m2 dan lebar " + this.t + " m2 adalah " + hasil + " cm2");
    }
}
