/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javath;

/**
 *
 * @author Ahmad Lufi A U
 */
interface hitung2 {
    double Volume();
}

class Kubus2 implements hitung2 {
    
    private double s;
    public Kubus2(double sisi) {
        this.s = sisi;
    }

    @Override
    public double Volume() {
        double hasil;
        hasil = s*s*s;
        return hasil;
    }
    
}

public class VolumeInterface {
    public static void main(String[] args) {
        Kubus2 obj = new Kubus2(5);
        double volume = obj.Volume();
        System.out.println("Luas Persegi Panjang "+volume);
    }
}