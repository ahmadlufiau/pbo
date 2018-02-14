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
public class TanpaParameter {
    int p,l;

    TanpaParameter() {
        p=5;
        l=4;
    }
    
    int luas(){
        return p*l;
    }
    
    static class hitung
    {
        public static void main(String args[])
        {
            TanpaParameter luaspp = new TanpaParameter();
            System.out.println("Luas Persegi Panjang : "+luaspp.luas());
        }
    }
    
}
