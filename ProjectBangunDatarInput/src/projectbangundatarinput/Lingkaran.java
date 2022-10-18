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
public class Lingkaran {
    double r;
    
    Lingkaran (double x) {
        this.r = x;
    }
    
    void outputluasLingkaran() {
        double hasil = 3.14 * this.r * this.r /2;
        System.out.println("Luas Lingkaran dengan jari jari " + this.r + " cm adalah " + hasil + "cm2");
    }
}
    
