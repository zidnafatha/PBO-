/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProjectBangundatar2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi p = new Persegi();
        System.out.println("Luas Persegi dengan panjang sisi 5 adalah "+ p.luasPersegi(5));
        
        PersegiPanjang q = new PersegiPanjang();
        System.out.println("Luas persegi panjang dengan panjang 7 dan lebar 5 adalah " + q.luasPersegiPanjang(5, 7));
        
        Segitiga a = new Segitiga();
        System.out.println("Luas Segitiga dengan tinggi 2.8 dan alas 2 adalah " + a.luasSegitiga(2.8, 2));
        
        
        
    }
    
    
}
