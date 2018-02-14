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

class OverLoadMetode2 {
    //overload tes pertama
    void tes(){
        System.out.println("Tanpa Parameter");
    }
    //overload kedua
    void tes(int a) {
        System.out.println("Nilai a: "+a);
    }
    //overload ketiga
    void tes(int a, int b){
        System.out.println("Nilai a dan b = "+a+" dan "+b);
    }
    //overload keempat
    double tes(double c){
        System.out.println("Nilai c = "+c);
        return c*c;
    }
}
class OverLoad1 {
    public static void main(String[] args) {
        OverLoadMetode2 demo = new OverLoadMetode2();
        double kali;
        //memanggil semua versi tes
        demo.tes();
        demo.tes(10);
        demo.tes(5,8);
        kali = demo.tes(10.0);
        System.out.println("Hasil (c*c) = "+kali);
    }   
}