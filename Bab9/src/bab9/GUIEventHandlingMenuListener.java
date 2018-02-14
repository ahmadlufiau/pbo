/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab9;

/**
 *
 * @author Ahmad Lufi A U
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class GUIEventHandlingMenuListener extends JFrame implements MenuListener
{
    private JFrame frame = new JFrame();
    private JMenuBar menu = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenu edit = new JMenu("Edit");
    private JMenu help = new JMenu("Help");
    private JMenuItem mi1 = new JMenuItem("New");
    private JMenuItem mi2 = new JMenuItem("Save");
    private JMenuItem mi3 = new JMenuItem("Exit");
    public GUIEventHandlingMenuListener() {
	file.addMenuListener(this);
	menu.add(file);
	menu.add(edit);
	menu.add(help);
	frame.getContentPane().add(menu);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void menuCanceled(MenuEvent e) {
    }
    public void menuDeselected(MenuEvent e) {
    }
    public void menuSelected(MenuEvent e) {
        if (e.getSource()==file)
	JOptionPane.showMessageDialog(null, "Menu File di-select");
	file.add(mi1);
	file.add(mi2);
	file.add(mi3);
    }
    public static void main(String[] args) {
	new GUIEventHandlingMenuListener();
    }
}