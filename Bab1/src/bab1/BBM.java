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
public class BBM {
    int kecepatan;
    int waktu;
    double masabbm;
    BBM()
    {
        kecepatan=50;
        waktu=15;
        masabbm=40;
    }
    double hitung_jarak() {
        return kecepatan*waktu;
    }
    double hitung_masa() {
        return kecepatan*waktu/masabbm;
    }
    static class KonstruktorBBM
    {
    public static void main(String[] args) {
        BBM lintasan = new BBM();
        BBM masa = new BBM();
        double jarak;
        double kuota;
        jarak = lintasan.hitung_jarak();
        System.out.println("Menghitung Jarak dan Konsumsi BBM");
        System.out.println(jarak + " Km jarak yang dittempuh\t");
        kuota=masa.hitung_masa();
        System.out.println(kuota + " Liter BBM dibutuhkan untuk menempuhnya");
        }
    }
}