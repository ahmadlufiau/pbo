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
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUIInput {
    public static void main(String[] args) {
	final JFrame frame=new JFrame("INPUT DATA");
	JLabel lNim=new JLabel("NIM");
	JLabel lNm=new JLabel("NAMA");
	JLabel lAlm=new JLabel("ALAMAT");
	JLabel lJur=new JLabel("JURUSAN");
	JLabel lProdi=new JLabel("PRODI");
	final JTextField tNim=new JTextField(15);		
	final JTextField tNm=new JTextField(15);
	final JTextField tAlm=new JTextField(15);
	final JTextField tJur=new JTextField(15);
	final JTextField tProdi=new JTextField(15);
	JButton tSimpan=new JButton("Simpan");
	JButton tExit=new JButton("Exit");		
	tSimpan.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
            if (tNim.getText().trim().equals("")){			
                JOptionPane.showMessageDialog(frame,"NIM Masih Kosng","Simpan "
                        + "data",JOptionPane.WARNING_MESSAGE);
		tNim.requestFocus();
            } else {
		FileInputStream fin;
		BufferedReader din;
		FileOutputStream fout;
	try {
            fin=new FileInputStream("mhs.txt");
            din=new BufferedReader(new InputStreamReader(fin));
            String isidata[]=new String[5];
            String teks,thisLine,mergeLine;
            mergeLine="";   
            int i=0;
            while ((thisLine=din.readLine())!=null) {
		isidata=thisLine.split(",");
                if (isidata[0].equals(tNim.getText().trim())) {
                    i=1;
		} else {
                    mergeLine += thisLine + "\n";
                }
            } fin.close();
            if (i==1) {				
                JOptionPane.showMessageDialog(frame,"NIM sudah ada","Cari "
                        + "data",JOptionPane.WARNING_MESSAGE);
            } else {
		fout=new FileOutputStream("mhs.txt");
		new PrintStream(fout).print(mergeLine);
		new PrintStream(fout).println(tNim.getText()+","+tNm.getText()+
                        ","+tAlm.getText()+","+tJur.getText()+
                        ","+tProdi.getText());
		fout.close();
		tNim.setText("");
            }
            tNm.setText("");
            tAlm.setText("");
            tJur.setText("");
            tProdi.setText("");
            tNim.requestFocus();
	} catch (Exception exc) {
            System.err.println("Salah: "+exc);
	}					
	}
	}
    });		
    Container konten;
    konten=frame.getContentPane();
    konten.setLayout(new GridBagLayout());
    GridBagConstraints pos=new GridBagConstraints();	
    pos.anchor=GridBagConstraints.WEST;
    pos.gridx=5;
    pos.gridy=5;
    konten.add(lNim,pos);
    pos.gridx++;
    konten.add(tNim,pos);
    pos.gridy++;
    pos.gridx=5;
    konten.add(lNm,pos);
    pos.gridx++;
    konten.add(tNm,pos);
    pos.gridy++;
    pos.gridx=5;
    konten.add(lAlm,pos);
    pos.gridx++;
    konten.add(tAlm,pos);
    pos.gridy++;
    pos.gridx=5;
    konten.add(lJur,pos);
    pos.gridx++;
    konten.add(tJur,pos);
    pos.gridy++;
    pos.gridx=5;
    konten.add(lProdi,pos);
    pos.gridx++;
    konten.add(tProdi,pos);
    pos.gridy++;
    pos.gridx=5;
    konten.add(tSimpan,pos);
    pos.gridx++;
    konten.add(tExit,pos);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}