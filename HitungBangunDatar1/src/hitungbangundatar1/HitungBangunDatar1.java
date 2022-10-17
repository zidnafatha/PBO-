/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbangundatar1;

/**
 *
 * @author user
 */
public class HitungBangunDatar1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LuasPersegi p = new LuasPersegi();
        p.sisi = 42;
        
        LuasLingkaran l = new LuasLingkaran();
        l.jarijari = 21;
        double luasLingkaran = 4 * l.LuasLingkaran();
        
        double luasSeluruhnya = p.LuasPersegi() + luasLingkaran;
        System.out.println ("Project Bangun Luas Komplek Pertama Tersebut :" + luasSeluruhnya);
        
        //Project Bangun Luas Komplek Kedua
        LuasLingkaran k = new LuasLingkaran ();
        k.jarijari = 7;
        double luasLingkarand = 2 * k.LuasLingkaran();
        
        LuasLingkaran b = new LuasLingkaran ();
        b.jarijari = 14;
        
        double luasBangun = b.LuasLingkaran() - luasLingkarand;
        System.out.println ("Project Bangun Luas Komplek Kedua Tersebut :" + luasBangun);
        
        
        
    }
    
}
