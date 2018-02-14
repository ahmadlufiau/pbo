/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

/**
 *
 * @author Ahmad Lufi A U
 */
interface Hitung {
    double Luas();
}
class Lingkaran implements Hitung {
    private double jari;
    public Lingkaran(double r) {
	this.jari = r;
    }
    public double Luas() {
	double A;
	A = jari*jari*22/7;
	return A; 
    }
}
class SegiEmpat implements Hitung {
    private double panjang;
    private double lebar;
    public SegiEmpat(double p, double l) {
	this.panjang = p;
	this.lebar = l;
    }
    public double Luas() {
	double L = panjang*lebar;
	return L;
    }
}
public class ClassAppl {
    public static void main(String[] args) {
	SegiEmpat segiempat = new SegiEmpat(10,5);
	Lingkaran lingkaran = new Lingkaran(10);
	double A;
	A = segiempat.Luas();
	System.out.println("Luas segiempat = " + A);
	A = lingkaran.Luas();
	System.out.println("Luas lingkaran = " + A);
    }
}