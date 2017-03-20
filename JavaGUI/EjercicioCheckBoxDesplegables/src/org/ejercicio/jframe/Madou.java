package org.ejercicio.jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Madou extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Madou frame = new Madou();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Madou() {
		try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	
	
	private void jbInit() throws Exception {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 524, 459);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	
	
	
	
	
	
	
	

	
	
	
	JCheckBox JCB_atur = new JCheckBox("Està en atur");
	JCB_atur.setBounds(11, 132, 126, 45);
	getContentPane().add(JCB_atur);
	
	JCheckBox JCB_estudiant = new JCheckBox("Estudiant");
	JCB_estudiant.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			JCB_atur.setSelected(false);
		}
	});
	
	JCB_estudiant.setBounds(11, 81, 97, 29);
	getContentPane().add(JCB_estudiant);
	
	
	
	
	
	
	
	
	}
	
}
