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
public class Segitiga {
    double a;
    double b;
    double c;
    
    Segitiga(double x, double y, double z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }
    
    void outputluasSegitiga() {
        double hasil = this.a * this.b * this.c;
        System.out.println("Luas Segitiga dengan panjang sisi " + this.a + " cm, " + this.b + " cm, dan " + this.c + " cm adalah " + hasil + " cm2");
    }
}
