/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author user
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operasi x = new Operasi();
        System.out.println("Hasil Penjumlahan " + x.jumlahkan(3, 4));
        Operasi y = new Operasi();
        System.out.println("Hasil Penjumlahan " + y.jumlahkan(4, 7, -9));
        Operasi z = new Operasi();
        System.out.println("Hasil Penjumlahan " + z.jumlahkan(3.4, -0.0002, 0.12313));
    }
    
}
