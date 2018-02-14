/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab2;

/**
 *
 * @author Ahmad Lufi A U
 */
public class DenganParameter {
    int p,l;

    DenganParameter(int panjang, int lebar) {
        p=panjang;
        l=lebar;
    }
    int luas(){
        return p*l;
    }
    static class hitung
    {
        public static void main(String args[])
        {
            DenganParameter luaspp = new DenganParameter(4,5);
            System.out.println("Luas Persegi Panjang : "+luaspp.luas());
        }
    }
    
  
}
