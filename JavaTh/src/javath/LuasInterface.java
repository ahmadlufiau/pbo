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
interface hitung {
    double Luas();
}

class PersegiPanjang implements hitung {
    private double p,l;
    public PersegiPanjang(double panjang, double lebar) {
        this.p = panjang;
        this.l = lebar;
    }

    @Override
    public double Luas() {
        double hasil;
        hasil = p*l;
        return hasil;
    }
    
}

public class LuasInterface {
    public static void main(String[] args) {
        PersegiPanjang obj = new PersegiPanjang(10, 5);
        double luas = obj.Luas();
        System.out.println("Luas Persegi Panjang "+luas);
    }
}