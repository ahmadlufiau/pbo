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
public class Overloading {
    String ttl;
    void setTTL(String tempatLahir, String tanggalLahir){
        ttl=tempatLahir+","+tanggalLahir;
    }
    String getTTL() {
        return ttl;
    }
    static class tempatTanggalLahir {
        public static void main(String[] args) {
            Overloading lufi = new Overloading();
            lufi.setTTL("Tuban","30 Mei 1995");
            System.out.println("Tempat Tanggal Lahir lufi adalah "+lufi.getTTL());
        }
    }
    
}
