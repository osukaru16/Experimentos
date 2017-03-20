package org.ejercicio.jpanel;

import javax.swing.JPanel;

import Prueba.Ejemplo2;

import javax.swing.JCheckBox;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel() {
		try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		
		
		
		
		

	}
	
	private void jbInit() throws Exception {
		
		this.setLayout(null);
		this.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JCheckBox JCB_atur = new JCheckBox("Està en atur");
		JCB_atur.setBounds(11, 53, 139, 29);
		add(JCB_atur);
		
		JCheckBox JCB_estudiant = new JCheckBox("Estudiant");
		JCB_estudiant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JCB_atur.setSelected(false);
			}
		});
		
		JCB_estudiant.setBounds(11, 107, 139, 29);
		add(JCB_estudiant);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
