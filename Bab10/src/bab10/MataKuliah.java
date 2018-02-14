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
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;

public class MataKuliah {
    public static void main(String[] args) {
	JFrame f=new JFrame();
	JLabel lKodeMK=new JLabel("Kode Mata Kuliah");
	JLabel lNamaMK=new JLabel("Nama Mata Kuliah");
 
        JTextField tKodeMK=new JTextField(15);
	JTextField tNamaMK=new JTextField(15);
    
	JButton tSimpan=new JButton("Save");
	JButton tExit=new JButton("Exit");
    
        try {
	    Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException cnfe) {
            System.err.println(cnfe);
	}
	
	tSimpan.addActionListener(new ActionListener() {
            
        public void actionPerformed(ActionEvent e) {
			
            String sql="INSERT INTO matakuliah VALUES('"
				+tKodeMK.getText()+"','"
				+tNamaMK.getText()+"')";	
            if (tKodeMK.getText().trim().equals("")) {
            JOptionPane.showMessageDialog
            (f,"nomor masih kosong","simpan data",JOptionPane.WARNING_MESSAGE);
            tKodeMK.requestFocus();	
	} else {
        try {
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/java_bab10","root","");
        Statement stmt=conn.createStatement();
	stmt.executeUpdate(sql);
		
	tKodeMK.setText("");
	tNamaMK.setText("");
	tKodeMK.requestFocus();
        } catch (Exception exc) {
	System.err.println("salah:"+exc);
        }
        }
        }
    });

    Container konten;
    konten=f.getContentPane();
    konten.setLayout(new GridBagLayout());
    GridBagConstraints pos=new GridBagConstraints();
    pos.anchor=GridBagConstraints.WEST;
    pos.gridx=5;
    pos.gridy=5;

    konten.add(lKodeMK,pos);
    pos.gridx++;
    konten.add(tKodeMK,pos);
    pos.gridy++;
    pos.gridx=5;

    konten.add(lNamaMK,pos);
    pos.gridx++;
    konten.add(tNamaMK,pos);
    pos.gridy++;
    pos.gridx=5;

    konten.add(tSimpan,pos);
    pos.gridx++;
    konten.add(tExit,pos);

    f.pack();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
  }
}