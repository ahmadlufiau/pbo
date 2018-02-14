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

public class GuiInputDatabaseMysql {
    public static void main(String[] args) {
	JFrame f=new JFrame();
	JLabel lNomor=new JLabel("NOMOR");
	JLabel lJudul=new JLabel("JUDUL");
 
        JTextField tNomor=new JTextField(15);
	JTextField tJudul=new JTextField(15);
    
	JButton tSimpan=new JButton("Save");
	JButton tExit=new JButton("Exit");
    
        try {
            //cara 1 menggunakan ODBC
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//step 1
            //cara 2
	    Class.forName("com.mysql.jdbc.Driver");//step 1
	} catch (ClassNotFoundException cnfe) {
            System.err.println(cnfe);
	}
	
	tSimpan.addActionListener(new ActionListener() {
            
        public void actionPerformed(ActionEvent e) {
			
            String sql="INSERT INTO buku VALUES('"
				+tNomor.getText()+"','"
				+tJudul.getText()+"')";	
            if (tNomor.getText().trim().equals("")) {
            JOptionPane.showMessageDialog
            (f,"nomor masih kosong","simpan data",JOptionPane.WARNING_MESSAGE);
            tNomor.requestFocus();	
	} else {
        try {
	//cara 1
	//Connection	
        //conn=DriverManager.getConnection("jdbc:odbc:KonekDsn","root","password");
	//KoneksDsn=nama data source name
	//cara 2
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/perpus","root","");
        //con =DriverManager.getConnection("jdbc:mysql://localhost/akademik","root","password");
        Statement stmt=conn.createStatement();//step 4
	stmt.executeUpdate(sql);
		
	tNomor.setText("");
	tJudul.setText("");
	tNomor.requestFocus();
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

    konten.add(lNomor,pos);
    pos.gridx++;
    konten.add(tNomor,pos);
    pos.gridy++;
    pos.gridx=5;

    konten.add(lJudul,pos);
    pos.gridx++;
    konten.add(tJudul,pos);
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