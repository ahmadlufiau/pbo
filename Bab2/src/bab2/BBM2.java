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
public class BBM2 {
    static double BBM;
    static double liter;
    double bensin(){
        return(liter*8500);
    }
    double solar(){
        return(liter*8800);
    }

    BBM2() {
        liter=25;
    }
    static class JenisBBM {
        public static void main(String args[])
        {
            BBM2 pertama = new BBM2();
            BBM2 kedua = new BBM2();
            BBM2 ketiga = new BBM2();
            double ratarata1 = pertama.bensin()/7;
            System.out.println("\tRata-rata BBM");
            System.out.println("\nBensin = 8500 perliter\nRata-rata = "+ratarata1);
            double ratarata2 = kedua.bensin()/7;
            System.out.println("\nSolar = 7500 perliter\nRata-rata = "+ratarata2);
            double ratarata3 = ketiga.bensin()/7;
            System.out.println("\nBiodiesel = 8000 perliter\nRata-rata = "+ratarata3);
        }
    }
}