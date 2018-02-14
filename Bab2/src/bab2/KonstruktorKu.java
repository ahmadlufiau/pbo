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

class Man2{
    String nama;
    double gapok;
    double masakerja;
    
    Man2(){
        System.out.println("Konstruksi dari Man");
        nama="Eko";
        gapok=1000;
        masakerja=10.5;
    }
    
    double hitung_gaji()
    {
        return gapok*masakerja;
    }

}

class KonstruktorKu {
    public static void main(String args[]) {
        Man2 KaryawanKu = new Man2();
        Man2 KaryawanMu = new Man2();
        double gaji;
        gaji = KaryawanKu.hitung_gaji();
        System.out.println("Volume is " + gaji);
        gaji = KaryawanMu.hitung_gaji();
        System.out.println("Volume is " + gaji);
    }
}