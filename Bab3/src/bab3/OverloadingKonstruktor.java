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
class Man {
    double gapok; 
    double masakerja;	
    // konstruktor untuk Man.
    Man(double g, double mk) {
	gapok=g;  
        masakerja=mk;
    }
    // konstructor yang tidak ditentukan ukurannya
    Man(){
	gapok = 0;  
        masakerja = 0; 
    }
    // konstructor digunakan ketika KaryawanKita dibuat
    Man(double lembur){
	gapok=masakerja=lembur;
    }
    double hitung_gaji() {
	return gapok*masakerja;
    }
}

class OverloadingKonstruktor {
    public static void main(String args[]){
	Man KaryawanKu = new Man(10,15);
	Man KaryawanMu = new Man();
	Man KaryawanKita = new Man(5);
	double gaji;
	gaji = KaryawanKu.hitung_gaji();
	System.out.println("Gaji Karyawanku adalah   = " + gaji);
	gaji = KaryawanMu.hitung_gaji();
	System.out.println("Gaji Karyawanmu adalah   = " + gaji);
	gaji = KaryawanKita.hitung_gaji();
	System.out.println("Gaji KaryawanKita adalah = " + gaji);
    }
}