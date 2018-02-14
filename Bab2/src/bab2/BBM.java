/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab2;

/**
 *
 * @author Ahmad Lufi A U
 */
public class BBM {
    double seninjumat, sabtuminggu;
    double ratarata;
    BBM()
    {
        seninjumat=3;
        sabtuminggu=5;
    }
    double ratarata()
    {
        return(seninjumat*5 + sabtuminggu*2)/7;
    }
    static class ratarata
    {
        public static void main(String args[])
        {
            BBM rataBBM = new BBM();
            double hasil;
            hasil= rataBBM.ratarata();
            System.out.println("Rata - rata penggunaan BBM selama seminggu adalah : "+hasil);
        }
    }
}