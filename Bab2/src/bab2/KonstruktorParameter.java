/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab2;

class Man3 {
    String nama;
    double gapok;
    int masakerja;
    Man3(String nm,double g, int mk) {
        nama = nm;
        gapok=g;
        masakerja=mk;
    }
    double hitung_gaji(){
        return gapok*masakerja;
    } 
}

class KonstruktorParameter
{
    public static void main(String args[])
   {
        Man3 KaryawanKu = new Man3("eko",10000,10);
        Man3 KaryawanMu = new Man3("Dwi",20000,10);
        double gaji;
        
        gaji = KaryawanKu.hitung_gaji();
        System.out.println("Gaji Karyawanku " + gaji);
        
        gaji = KaryawanMu.hitung_gaji();
        System.out.println("Gaji Karyawanmu " + gaji);
   }
}