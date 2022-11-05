/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MatematikaBerkasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Matematika a = new Matematika();
        
        double hasil = a.pertambahan(12.5,28.7,14.2);
        System.out.println(hasil);
        
        hasil = a.pengurangan(12.5,28.7,14.2);
        System.out.println(hasil);
        
        hasil = a.perkalian(12.5,28.7,14.2);
        System.out.println(hasil);
        
        hasil = a.pembagian(12.5,28.7,14.2);
        System.out.println(hasil);
        
        hasil = a.modulus(12.5,28.7,14.2);
        System.out.println(hasil);
    }
    
}
