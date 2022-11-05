/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MatematikaCanggih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Matematika a = new Matematika();
        
        double hasil = a.pertambahan(12.5,28.7,14.2);
        System.out.println(hasil);
        
        int hasil2 = a.pertambahan(23,24);
        System.out.println(hasil2);
        
        hasil2 = a.pertambahan(12,28,14);
        System.out.println(hasil2);
        
        hasil = a.pertambahan(3.4,4.9);
        System.out.println(hasil);
    }
    
    
}
