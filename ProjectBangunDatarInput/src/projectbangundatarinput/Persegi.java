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
public class Persegi {
     double s;
    
    Persegi(double x) {
        this.s = x;
    }
    
    void outputluasPersegi() {
        double hasil = this.s * this.s;
        System.out.println("Luas Persegi dengan panjang sisi " + this.s + " cm adalah " + hasil + " cm2");
    }
}
