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
public class Ubin {
    int panjang;
    int lebar;
    
    
    
    
    int hitungLuas(){
        // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang x = new PersegiPanjang();
        
        // hitung luasnya
        return x.hitungLuas(this.panjang, this.lebar);
    }
}
