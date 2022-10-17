/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author user
 */
public class ProjectPengubinan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        // hitung luas setiap ruang
        Ruang A = new Ruang ();
        A.panjang = 5;
        A.lebar = 3;
        
        Ruang B = new Ruang ();
        B.panjang = 5;
        B.lebar = 2;
        
        Ruang C = new Ruang ();
        C.panjang = 4;
        C.lebar = 3;
        
        //hitung luas total ruang dalam m2
        int totalLuasRuang = A.hitungLuas () + B.hitungLuas() + C.hitungLuas();
        
        // hitung luas ubin
        Ubin x = new Ubin();
        x.panjang = 60;
        x.lebar = 40;
        
        //ubah ubin menjadi m2
        double luasUbin = x.hitungLuas()/100000.;
        
        //ubah ubin menjadi m2
        double jumlahUbin = totalLuasRuang/luasUbin;
        System.out.println ("Banyaknya ubin yang diperlukan :" + jumlahUbin);
        
    }
    
    
}
