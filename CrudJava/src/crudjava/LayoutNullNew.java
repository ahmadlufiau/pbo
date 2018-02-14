/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjava;

/**
 *
 * @author Ahmad Lufi A U
 */
import java.awt.*;//layout ada pada awt
import java.awt.event.*;//event listener ada pada awt
import javax.swing.*;
import javax.swing.table.DefaultTableModel;//untuk membuat tabel
import java.sql.*;

public class LayoutNullNew extends JFrame implements ActionListener,ItemListener//turunan & interface

{   
//String IsiComboBox;
//cara 1  
   static  String[] IsiComboBox={"Laki-Laki","Perempuan"};
   JComboBox cb1=new JComboBox(IsiComboBox);
  
	static JComboBox cb2=new JComboBox();
   
   
   static  JFrame f=new JFrame();
    JLabel l=new JLabel("NIM");
    JLabel l2=new JLabel("NAMA");
    JLabel l3=new JLabel("Jenis Kelamin");
    JLabel l4=new JLabel("Agama");
    
    //tipe static : agar bisa digunakan pada metode bertipe static
    static JTextField t=new JTextField();
    static JTextField t2=new JTextField();
    static JTextField t3=new JTextField();
            
    //cara 2
    //JComboBox cb1=new JComboBox();
    //JLabel l4=new JLabel("[                  ]");
    
 
    JButton b=new JButton("Simpan"); 
    JButton b2=new JButton("Edit");
 	JButton b3=new JButton("Hapus");
	JButton b4=new JButton("Exit");
    JButton tHitung=new JButton("Hitung");
	JButton b5=new JButton("Lihat Data");


   JCheckBox cBox=new JCheckBox("karate");
   JCheckBox cBox2=new JCheckBox("renang");
   


    static JTable tabel = new JTable();
    static DefaultTableModel tabMode;
    static private Object[][] dataTable = null;
 
    static String[] header={"NIM","Nama","Agama"};   
	JScrollPane jScrollPane1 = new JScrollPane();//untuk menampung objek & menampilkan isi layar 
     
   
    public LayoutNullNew()
    {
       	//super("FORM INPUT MENGGUNAKAN LAYOUT(NULL)");
    	setLocation(10,10);
    	setSize(1000,1000);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	setLayout(null);   	
    	add(l);
    	add(t);
    	add(l2);
    	add(t2);    	
    	add(b);
    	add(b2);
    	add(b3);
    	add(b4);
        add(tHitung);
        add(b5);	
        add(l3);
        add(t3);
        
        add(cb1);
    	
  //  	add(cBox);
    //	add(cBox2);
   //agama
   		add(l4);
       	add(cb2);
    	
    	//sama dengan di atas
        /*
		f.setLocation(10,10);
    	f.setSize(100,100);
    	
    	f.setVisible(true);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	f.getContentPane().setLayout(null);
    	f.getContentPane().add(b);
    	f.getContentPane().add(l);
    	f.getContentPane().add(t);
    	f.getContentPane().add(l2);
    	f.getContentPane().add(t2);
    	*/
   		l.setBounds(new Rectangle (10,10,100,100));//(X,Y,L,T)
    	t.setBounds(new Rectangle (60,50,100,20));
    	l2.setBounds(new Rectangle (10,50,100,100));
    	t2.setBounds(new Rectangle (60,90,200,20));
    	b.setBounds(new Rectangle (60,160,100,20));
    	b2.setBounds(new Rectangle (160,160,100,20));
    	b3.setBounds(new Rectangle (260,160,100,20));
        b4.setBounds(new Rectangle (360,160,100,20));
        tHitung.setBounds(new Rectangle (460,160,100,20));
        b5.setBounds(new Rectangle (560,160,150,20));
        
        t3.setBounds(new Rectangle (600,10,200,40));
        t3.setEnabled(false);
        t3.setBackground(Color.red);
       
        //membuat combo jenis kelamin 
       	l3.setBounds(new Rectangle (10,90,100,100));
    	cb1.setBounds(new Rectangle (100,130,100,20));
        
         //membuat combo jenis Agama 
       	l4.setBounds(new Rectangle (10,70,100,100));
    	cb2.setBounds(new Rectangle (100,110,200,20));
       
        
        //membuat cekbox olah raga:BOLEH MEMILIH LEBIH DARI SATU        
        cBox.setBounds(new Rectangle (350,130,100,20));
        cBox2.setBounds(new Rectangle (450,130,150,20));
        cBox.setSelected(true);//mengaktifkan
        
        
        //UNTUK JRadioButton DIPERLAKUKAN SEPERTI JBUTTON : PILIHAN HANYA SATU
        
        
        
        //t.setBounds(40,50,100,20);//PERINTAH DI ATAS SAMA DENGAN PERINTAH INI
    	//b.setBounds(10,45,100,20);
    	
        //cara 2
        //cb1.addItem("Laki-Laki");
        //cb1.addItem("Perempuan");
       
         
       
       // cb1.setMaximumRowCount(1);//untuk menentukan jumlah isi combo yang ditampilkan
        
    	b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        tHitung.addActionListener(this);
        b5.addActionListener(this);
        
        cb2.addActionListener(this);
        
        
        //menon-aktifkan komponen    
       // b3.setEnabled(false);
        //t.setEditable(false);
    	
       // cb1.addActionListener(this);//under construction:digunakan jika ada aksi yang dikerjakan pada actionPerformed
         cb1.addItemListener(this);
         cb2.addItemListener(this);
         
         cBox.addItemListener(this);
         cBox2.addItemListener(this);
         
      
    	jScrollPane1.setViewportBorder(null);
    	jScrollPane1.setBorder(null);
    	jScrollPane1.setBounds(new Rectangle(8, 200, 400, 210));
       
    	Object[] row = {"Nim", "Nama", "Agama"};
    	tabMode = new DefaultTableModel(null, row);
    	tabel.setBorder(null);
    	tabel.setGridColor(UIManager.getColor("Button.background"));
    	tabel.setModel(tabMode);
    	add(jScrollPane1);
    	jScrollPane1.getViewport().add(tabel);
    
 
		LayoutNullNew.koneksiDataBase();
		
		
		//MENGISI COMBO AGAMA VIA TABEL
		
  		 isiComboAgama();
   
		
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	Object x=e.getSource();
    	if (x==b)
    	{
    		System.exit(0);
    	}
    	if (x==b2) 
    	{
    		LayoutNullNew.Kosong();	
    		   	
    	}
    	
        if (x==cb1)//under construction
        {
        
    		//String teks=e.getActionCommand();
			//	l4.setText(teks);
        }
        
        if (x==cb2)//under construction
        {
        	
                	
        }
   
   if (x==b3)//menyimpan data
         {
        	simpanData();
        }
   
        if (x==tHitung)
        {
        	/*
        	  //mengambil nilai & merubah ke integer script netbean
        		Double a=(Double.valueOf(t.getText()));
         		ouble b=(Double.valueOf(t2.getText()));
       		//merubah integer ke string & menampilkannya
         		double c=a+b;
         		t3.setText(String.valueOf(c));
             */
             
             //sama dengan atas: Merubah string ke numerik
             int a=Integer.parseInt(t.getText());
             //double a=Double.parseDouble(t.getText());
             double b=Double.parseDouble(t2.getText());
             
             double c=a+b;
             //merubah numerik ke string
             	t3.setText(Double.toString(c));
             //	t3.setText(Integer.toString(c));
             
                       
             
        }
        
        if (x==b4)
        {
        	//cari
        	LayoutNullNew.cariData();
        }
        
        if (x==b5)
        {
        	//lihat data
        	LayoutNullNew.lihatData();
        }
        
        
        
    	else 
    	{
    		//sql
    	}
    }
    
  /*  public void itemStateChanged(ItemEvent e)//pasangannya    cb1.addItemListener(this);
    {
    	//untuk cb1
    	int index=cb1.getSelectedIndex();
    	String str=IsiComboBox[index];
    	t3.setText(str);


     if (cmbKodeBuku.getSelectedItem() == "K1") {
            txtJudul.setText("Kamus Indonesia-Inggris");
            txtJenis.setText("Kamus");
        } else if (cmbKodeBuku.getSelectedItem() == "K2") {
            txtJudul.setText("Kamus Indonesia-Jepang");
            txtJenis.setText("Kamus");
        }
  
  
    	//untuk checkBox
    	Object cek=e.getItemSelectable();//cBox.addItemListener(this);
    	if (cek==cBox)
    	  t3.setText("Laki-laki");
    	else
    	{
    		t3.setText("Perempuan");
    		
    	}	
    	
    }  */
    
    
    public void itemStateChanged(ItemEvent e)//pasangannya    cb1.addItemListener(this);
    {
    	//untuk combo box
    	int index=cb1.getSelectedIndex();
    	String str=IsiComboBox[index];
    	//t3.setText(str);
    	
    	
    }
    
    
    
    
    
    public static void Kosong()
    {
    	t.setText("");
    	t2.setText("");  
    	t3.setText("");  
    		
    	t3.setEnabled(false);	     
    	t.requestFocus();
    	
    }
    
    public static void koneksiDataBase()
    {
    	
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
	
    
		try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//step 1
         	Class.forName("com.mysql.jdbc.Driver");

		}
		catch (ClassNotFoundException cnfe)
		{
			System.err.println(cnfe);
		}

		catch (Exception E)
    	{
			E.printStackTrace();
		}
        
		try
    	{
		
		//ConnectMySql adalah Data Sources Name
		//conn=DriverManager.getConnection("jdbc:odbc:ConnectMySql","root","password");
 		conn = DriverManager.getConnection("jdbc:mysql://localhost/java_akademik","root","");
        	t3.setText("Database Connecting,....OK!");
        	
            		  	
    	}
    	catch    	(SQLException se)
    	{
    		 t3.setText("koneksi gagal");
        	
    	}
    	   
    
    }
    
    
    public static void cariData()
    {
    	
    		try
				{
					String cari=JOptionPane.showInputDialog("Masukan NIM yang dicari:");
					  
				//	String cari=t.getText();
					
					String queryCari="select * from mhs where nim='"+cari+"'";
					
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java_akademik","root","");
        
					Statement stmt=conn.createStatement();
				    //LayoutNull3.koneksiDataBase();
				
					ResultSet rs=stmt.executeQuery(queryCari);
					if(rs.next())
					{
						//tNim.setText(rs.getString("nim"));
						//tNm.setText(rs.getString("nama"));
						t.setText(rs.getString(1));
						t2.setText(rs.getString(2));
						
					
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Nim tidak ada","Info...",JOptionPane.INFORMATION_MESSAGE);
					}
			    }
             
             catch (Exception exc)
					{
						System.err.println("salah  Ommmmmm......:"+exc);
					}
 
    }
    
    public static  void simpanData()
    {
    	String tNim=t.getText();
    	String tNama=t2.getText();    
     	String tAgama = cb2.getSelectedItem().toString();

    	{
				String sql="INSERT INTO  mhs VALUES('"+tNim+"','"+tNama+"','"+tAgama+"')";
				
						
			//	String sql="INSERT INTO  mhs VALUES('"+t.getText()+"','"+t2.getText()+"')";
			
				if (t.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog
					(f,"nim masih kosong","simpan data",JOptionPane.WARNING_MESSAGE);
					t.requestFocus();
					
				}
				else
				{
					
					try

					{
	        			Connection conn  =DriverManager.getConnection("jdbc:mysql://localhost/java_akademik","root","");						
						Statement stmt=conn.createStatement();//step 4
						stmt.executeUpdate(sql);
		
						t.setText("");
						t2.setText("");
						t.requestFocus();
						//untuk memasukan data ke tabel
						baca_data();
	 					tabel.setModel(tabMode);
  
					 }
     
					catch (Exception exc)
					{
						System.err.println("salah:"+exc);
					}

			    }
		}
					
    	
    }
    
    public static  void lihatData()
    {
    	
    	
    }
    
    public static void isiComboAgama()
    {
    	//lihat program kasir.java
    	cb2.removeAllItems();
        cb2.addItem("");
   
    	try
				{
					String queryAgama="select * from agama " ;
					
					
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java_akademik","root","");
        
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(queryAgama);
					while(rs.next())
					{
				        String agama = rs.getString("agama");
      					
						//String agama = rs.getString(2);
      					cb2.addItem(agama);
      					
      				}
				 
			    }
             
             catch (Exception exc)
					{
					//	System.err.println("salah  MAs.....:"+exc);
						cb2.setSelectedItem("");
				
					}
 
    }




        
//metode untuk menampilkan data yang sudah tersimpan dalam database
public static void baca_data()
{
    try{
    		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java_akademik","root","");
        
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery("select * from mhs");

          //  stm = (Statement) Con.createStatement();
           // RsKonsumen = stm.executeQuery("select * from mhs");
            
            tabMode=new DefaultTableModel(null,header);
            
            ResultSetMetaData meta = (ResultSetMetaData) rs.getMetaData();
            int col = meta.getColumnCount();            
            int baris = 0;
            while(rs.next()) {
                baris = rs.getRow();
            }
            
            dataTable = new Object[baris][col];
            int x = 0;
            rs.beforeFirst();
            while(rs.next()) {
                dataTable[x][0] = rs.getString("nim");
                dataTable[x][1] = rs.getString("nama");
                dataTable[x][2] = rs.getString("agama");
                x++;
            }
         //   tblBrg.setModel(new DefaultTableModel(dataTable,header));        
            //    tabMode.addRow(dataTable);
            tabMode=new DefaultTableModel(dataTable,header);
    }
    catch(SQLException e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}

    
    
    
    public static void main(String[] args)
    {
    	new LayoutNullNew();
    }
}

