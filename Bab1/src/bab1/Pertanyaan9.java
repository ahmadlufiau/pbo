/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab1;

/**
 *
 * @author Ahmad Lufi A U
 */
public class Pertanyaan9 {
    String name;
    double gapok;
    int masakerja;
    double bonus;
    Pertanyaan9(String nm, double g, int mk, double b)
    {
        name=nm;
        gapok=g;
        masakerja=mk;
        bonus=b;
    }
    double hitung_gaji()
    {
        return (gapok*masakerja)+(gapok*bonus);
    }
    static class soal
    {
        public static void main(String[] args) {
            Pertanyaan9 gol1=new Pertanyaan9("Pegawai 1", 10000, 10, 0.2);
            Pertanyaan9 gol2=new Pertanyaan9("Pegawai 2", 10000, 10, 0.15);
            Pertanyaan9 gol3=new Pertanyaan9("Pegawai 3", 10000, 10, 0.1);
            double Pertanyaan9;
            Pertanyaan9=gol1.hitung_gaji();
            System.out.println("Gaji golonggan 1 \t: "+Pertanyaan9);
            Pertanyaan9=gol2.hitung_gaji();
            System.out.println("Gaji golonggan 2 \t: "+Pertanyaan9);
            Pertanyaan9=gol3.hitung_gaji();
            System.out.println("Gaji golonggan 3 \t: "+Pertanyaan9);
        }
    }  
}