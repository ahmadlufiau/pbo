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

abstract class luas {
    double p,l;
    
    abstract public void tampil();
    public luas(double panjang, double lebar) {
        this.p = panjang;
        this.l = lebar;
    }
    
}

class hasil2 extends luas {
    double luas;
    hasil2(double p, double l) {
        super(p,l);
        luas = p*l;
    }

    @Override
    public void tampil() {
        System.out.println("Luas Persegi Panjang = "+luas);
    }
}

public class LuasAbstract {
    public static void main(String[] args) {
        luas pp;
        hasil2 obj = new hasil2(10, 2);
        pp = obj;
        pp.tampil();
    }
}