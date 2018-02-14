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
class superclass {
    int p,l;
    superclass(int panjang,int lebar) {
        p=panjang;
	l=lebar;
    }
    int hitung() {
        return p*l;
    }
}

class subclass extends superclass {
    int t;
    subclass(int panjang,int lebar,int tinggi) {
        super(panjang,lebar);
	t=tinggi;
    }  
    int hitung() {
        return p*l*t;
    }
}

class AplikasiMetodeOverriding {
    public static void main(String[] args) {
	subclass Objek=new subclass(3,4,6);
	System.out.println("LUAS "+Objek.hitung());
    }
}