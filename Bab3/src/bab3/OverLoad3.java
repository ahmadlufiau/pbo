/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3;

/**
 *
 * @author Ahmad Lufi A U
 */
class OverloadMetode4 {
    // Overload test for one integer parameter.
    void test(int a) {
        System.out.println("Nilai a: " + a);
    }
    
    // Overload test for two integer parameters.
    int test(int a, int b) {
        return a+b;
    }   
    
    // overload test for tree integer parameter
    int test(int a,int b, int c) {
        return a*b*c;
    }
}

class OverLoad3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OverloadMetode4 ob = new OverloadMetode4();
        int jumlah,kali;
        ob.test(10);
        jumlah=ob.test(10, 20);
        kali=ob.test(10, 20, 30);
        System.out.println("Hasil penjumlahan(10+20):"+jumlah);
        System.out.println("Hasil perkalian(10*20*30):"+kali);
    }  
}