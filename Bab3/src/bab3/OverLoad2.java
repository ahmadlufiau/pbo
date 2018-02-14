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

class OverLoadMetode3 {
    //overload kesatu
    void tes(double a) {
	System.out.println("Nilai a bertipe double = "+a);
    } 
    //overload ke dua  
    int tes(int b) {
        System.out.println("Nilai b bertipe integer = "+b);
	return b+b;
    }    
}

class OverLoad2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OverLoadMetode3 demo = new OverLoadMetode3();
        int jum;
	//memanggil versi tes 1
	demo.tes(2.5);
	//Memanggil versi tes kedua
	jum=demo.tes(10);	  
        System.out.println("Hasil penjumlahan  b + b = "+jum);	
    }
    
}
