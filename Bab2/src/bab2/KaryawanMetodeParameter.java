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

class Man {
    String nama;
    double gapok;
    int masakerja;
    
    double hitung_gaji(){
        return gapok*masakerja;
    }
    
    void setDim(String nm, double g, int mk) {
        nama = nm;
        gapok = g;
        masakerja= mk;
    }
}

class KaryawanMetodeParameter {
    public static void main(String[] args){ 
        Man KaryawanKu = new Man();
	Man KaryawanMu = new Man();
	double gaji;
	KaryawanKu.setDim("Eko",1000,10);
	gaji=KaryawanKu.hitung_gaji();
	System.out.println("Karyawan Ku:"+KaryawanKu.nama);
	System.out.println("Gajinya:"+gaji);		
	KaryawanMu.setDim("Dwi",2000,10);
	gaji=KaryawanMu.hitung_gaji();
	System.out.println("Karyawan Mu:"+KaryawanMu.nama);
	System.out.println("Gajinya:"+gaji);
    }
}