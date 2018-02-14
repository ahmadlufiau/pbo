/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8;

/**
 *
 * @author Ahmad Lufi A U
 */
import java.awt.*;
class ComplexLayout extends Frame {
    public static void main(String args[]) {
        ComplexLayout cl = new ComplexLayout();
        Panel panelNorth = new Panel();
        Panel panelCenter = new Panel();
        Panel panelSouth = new Panel();
        /* Panel utara */
        //Panel menggunakan FlowLayout sebagai default
        panelNorth.add(new Button("ONE"));
        panelNorth.add(new Button("TWO"));
        panelNorth.add(new Button("THREE"));
        /* Panel tengah */
        panelCenter.setLayout(new GridLayout(4,4));
        panelCenter.add(new TextField("1st"));
        panelCenter.add(new TextField("2nd"));
        panelCenter.add(new TextField("3rd"));
        panelCenter.add(new TextField("4th"));
        /* Panel selatan */
        panelSouth.setLayout(new BorderLayout());
        panelSouth.add(new Checkbox("Choose me!"),
        BorderLayout.CENTER);
        panelSouth.add(new Checkbox("I'm here!"),
        BorderLayout.EAST);
        panelSouth.add(new Checkbox("Pick me!"),
        BorderLayout.WEST);
        /* Menambahkan panel pada container Frame*/
        //Frame menggunakan BorderLayout sebagai default
        cl.add(panelNorth, BorderLayout.NORTH);
        cl.add(panelCenter, BorderLayout.CENTER);
        cl.add(panelSouth, BorderLayout.SOUTH);
        cl.setSize(300,300);
        cl.setVisible(true);
    }
}