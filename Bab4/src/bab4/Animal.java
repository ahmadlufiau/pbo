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
public interface Animal {
    
    String hewan();
    
    class fish implements Animal {
        private String eat;
        private String move;
        
        public fish(String e, String m) {
            this.eat = e;
            this.move = m;
        }
        
        public String hewan() {
            String H = eat + move;
            return H;
        }   
    }
    
    class bear implements Animal {
        private String eat;
        private String move;
        
        public bear(String e, String m) {
            this.eat = e;
            this.move = m;
        }
        
        public String hewan() {
            String H = eat + move;
            return H;
        }
    }
    
    class deskripsi {
        public static void main(String[] args) {
            fish hewan1 = new fish("Menghisap makanan di air",
                    "dan berenang menggunakan sirip");
            bear hewan2 = new bear("Mencabik-cabik mangsanya",
                    "dan bergerak menggunakan tangan dan kakinya");
            String A;
            String B;
            A = hewan1.hewan();
            B = hewan2.hewan();
            System.out.println("jadi ikan makan dengan cara "+A);
            System.out.println("");
            System.out.println("dan bear makan dengan cara "+B);
        }
    }
}