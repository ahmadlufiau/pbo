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

abstract class cube {
    int sisi;
    
    abstract public void tampil();
    public cube(int s) {
        this.sisi = s;
    }
    
}

class hasil extends cube {
    int volume;
    hasil(int sisi) {
        super(sisi);
        volume = sisi*sisi*sisi;
    }

    @Override
    public void tampil() {
        System.out.println("Volume kubus = "+volume);
    }
}

public class VolumeAbstract {
    public static void main(String[] args) {
        cube kubus;
        hasil obj = new hasil(10);
        kubus = obj;
        kubus.tampil();
    }
}
