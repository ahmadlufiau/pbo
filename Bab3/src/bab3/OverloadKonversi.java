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

class OverloadMetode {
    void test(int a) {
        System.out.println("Hasil konversi byte ke integer : "+a);
    }
}

class OverloadKonversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OverloadMetode ob = new OverloadMetode();
        byte i = 88;
        ob.test(i);
    }
    
}