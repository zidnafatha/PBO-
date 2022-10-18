/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author user
 */
public class Lingkaran {
    int a;

    Lingkaran(double x) {
        this.a = (int) x;
    }
    
    double luasLingkaran(int x) {
        double hasil = 3.14 * this.a * this.a / 2;
        return 0;
        
    }
    
    double luasLingkaran(double x) {
        return (3.14*x*x/2);
    }
    
    double kelilingLingkaran(int x) {
        return (2*3.14*x);
    }
    
    double kelilingLingkaran(double x) {
        return (2*3.14*x);
    }
    
    Lingkaran (double a, double b) {}
}
