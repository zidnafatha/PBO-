/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pertemuan7 {

    /**
     * @param args the command line arguments
     */
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        /**int day = 7;
        switch (day) {
            case 6:
                System.out.println("Hai");
            case 7:
                System.out.println("Hallo");
            default:
                System.out.println("hehe");**/
        
        
        
        /** String i = "y";
        int j = 0;
        
        while ("y".equals(i)) {
            Scanner input = new Scanner (System.in);
            System.out.print("Masukkan Bilangan 1 : ");
            int bil = input.nextInt();
            j ++;
            int k = bil/j;
            System.out.println(k + "Hasil dari rata rata input diatas adalah");
        } **/
        
        double j = 0;
        double sum = 0;
        Scanner input = new Scanner (System.in);
        
        while (true) {
            System.out.println("Masukkan Bilangan Bulat");
            int bil = input.nextInt();
            sum += bil;
            j++;
            System.out.println("Ingin Menambahkan Bilangan Lagi? (y/n)" );
            char k = input.next().charAt(0);
            
            if (k == 'n') {
                break;
            }
        }
        
            
        double rerata = sum/j;
        System.out.println("Hasil Rata Rata dari bilangan yang anda input adalah : " + rerata);
        
        /**while (i == 'y') {
            System.out.println("Masukkan Bilangan Bulat : ");
            int bil = input.nextInt();
            
            j++;
            int k = 0;
            int l = k+bil;
            int m = l/j;
            System.out.println("Hasil dari rata ratanya adalah " + m);
            
        }**/
    }
}
