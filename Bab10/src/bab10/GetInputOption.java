/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab10;

/**
 *
 * @author Ahmad Lufi A U
 */
import javax.swing.*;
class GetInputJOption {
    public static void main(String[] args) {
	String word[]= new String[3];
	word[0]=JOptionPane.showInputDialog("Enter word1");
	word[1]=JOptionPane.showInputDialog("Enter word2");
	word[2]=JOptionPane.showInputDialog("Enter word3");
	String msg=word[0]+" "+word[1]+" "+word[2];
	JOptionPane.showMessageDialog(null,msg);
    }
}