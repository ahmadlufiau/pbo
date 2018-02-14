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
abstract class A {
    int i;
    A(int i) {
	this.i = i;	
    }
    abstract public void tampil();
    public int hitung() {
	return i;
    }
}
class B extends A {
    int j;
    B(int i, int j) {
	super(i);
	this.j = j;
    }
    public void tampil() {
	System.out.println("Nilai j = " + j);
    }
}
class C extends A {
    int j, k;
    C(int i, int j) {
	super(i);
	this.j = j;
    }
    public void tampil() {
        k = i + j;
	System.out.println("Nilai i + j = " + k);
    }
}
public class latihan {
    public static void main(String[] args) {
	A lat;
	B x = new B(9, 2);
	C y = new C(9, 2);
	lat = x;
	System.out.println("Nilai i = " + lat.hitung());
	lat.tampil();
	lat = y;
        lat.tampil();
    }
}