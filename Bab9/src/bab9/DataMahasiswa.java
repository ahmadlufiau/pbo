/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmad Lufi A U
 */
public class DataMahasiswa extends JFrame implements ActionListener {
    JLabel lbljudul = new JLabel("Data Mahasiswa");
    JLabel lblnim = new JLabel("NIM");
    JLabel lblnama = new JLabel("Nama");
    JLabel lblagama = new JLabel("Agama");
    JLabel lbljk = new JLabel("Jenis Kelamin");
    JLabel lbljurusan = new JLabel("Jurusan");
    
    JTextField txtnim = new JTextField(50);
    JTextField txtnama = new JTextField(200);
    
    String[] agama = {
        "Islam",
        "Kristen",
        "Hindu",
        "Budha",
        "Katolik"
    };
    JComboBox cbagama = new JComboBox(agama);
    
    JRadioButton pria = new JRadioButton("Pria");
    JRadioButton wanita = new JRadioButton("Wanita");
    ButtonGroup jk = new ButtonGroup();
    
    String[] jurusan = {
        "Administrasi Niaga",
        "Akuntansi",
        "Teknik Elektro",
        "Teknik Mesin",
        "Teknik Sipil"
    };
    JComboBox cbjurusan = new JComboBox(jurusan);
    
    JButton btnsimpan = new JButton("Simpan");
    JButton btnbersih = new JButton("Bersih");
    JButton btnbatal = new JButton("Batal");
    JButton btnubah = new JButton("Ubah");
    JButton btnhapus = new JButton("Hapus");
    
    static JTable tabel = new JTable();
    static DefaultTableModel tabMode;
    static private Object[][] dataTable = null;
    static String[] header = {
        "NIM", "Nama", "Agama", "Jenis Kelamin", "Jurusan"
    };
    //untuk menampung objek & menampilkan isi layar
    JScrollPane JSP = new JScrollPane();
    
    DataMahasiswa() {
        setTitle("Form Mahasiswa");
        setLocation(500,100);
        setSize(535,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        komponenVisual();
    }
    
    void komponenVisual() {
        getContentPane().setLayout(null);
        getContentPane().add(lbljudul);
        lbljudul.setBounds(220,10,150,20);
        getContentPane().add(lblnim);
        lblnim.setBounds(10,50,50,20);
        getContentPane().add(lblnama);
        lblnama.setBounds(10,80,50,20);
        getContentPane().add(lblagama);
        lblagama.setBounds(10,110,50,20);
        getContentPane().add(lbljk);
        lbljk.setBounds(10,140,150,20);
        getContentPane().add(lbljurusan);
        lbljurusan.setBounds(10,170,50,20);
        
        getContentPane().add(txtnim);
        txtnim.setBounds(100,50,85,20);
        getContentPane().add(txtnama);
        txtnama.setBounds(100,80,200,20);
        
        getContentPane().add(cbagama);
        cbagama.setBounds(100,110,75,20);
        
        getContentPane().add(pria);
        pria.setBounds(100,140,50,20);
        getContentPane().add(wanita);
        wanita.setBounds(150,140,75,20);
        jk.add(pria);
        jk.add(wanita);
        
        getContentPane().add(cbjurusan);
        cbjurusan.setBounds(100,170,200,20);
        
        getContentPane().add(btnsimpan);
        btnsimpan.setBounds(10,210,80,20);
        getContentPane().add(btnbersih);
        btnbersih.setBounds(100,210,80,20);
        getContentPane().add(btnbatal);
        btnbatal.setBounds(190,210,80,20);
        getContentPane().add(btnubah);
        btnubah.setBounds(280,210,80,20);
        getContentPane().add(btnhapus);
        btnhapus.setBounds(370,210,80,20);
        btnsimpan.addActionListener(this);
        btnbersih.addActionListener(this);
        btnbatal.addActionListener(this);
        btnubah.addActionListener(this);
        btnhapus.addActionListener(this);
        
        //menampilkan ScroolPanel
        add(JSP);
        JSP.setBounds(10, 240, 500, 170);
        JSP.setViewportBorder(null);
        JSP.setBorder(null);
        //menampilkan tabel
        tabMode = new DefaultTableModel(null, header);
        tabel.setBorder(null);
        tabel.setModel(tabMode);
        add(JSP);
        JSP.getViewport().add(tabel);
        tabel.setModel(tabMode);//menampilkan data ke dalam tabel
    }
    
    public static void main(String[] args) {
        new DataMahasiswa();
    }
    
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if(x==btnsimpan) {
            JOptionPane.showMessageDialog(null, "Simpan Data Mahasiswa");
        } else if (x==btnbatal) {
            this.dispose();
        } else if (x==btnubah) {
            JOptionPane.showMessageDialog(null, "Ubah Data Mahasiswa");
        } else if (x==btnhapus) {
            JOptionPane.showMessageDialog(null, "Hapus Data Mahasiswa");
        } else {
            this.dispose();
        } 
    }
}