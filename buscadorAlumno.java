/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
    

 
import java.*;
import java.awt.*;
import javax.swing.*;
 
public class buscadorAlumno extends JFrame{
 
	private JTextField jTextField1 = new JTextField();
	private String memoria=jTextField1.getText();
	private BorderLayout esquema;
 
	public buscadorAlumno (){
		super("Prueba evento JTextField");
 
		definirventana();
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
 
		this.setSize(200,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	}
 
	public void definirventana(){
		esquema = new BorderLayout( 1, 1 ); //
 
		// obtener panel de contenido y establecer su esquema
		Container contenedor = this.getContentPane();
		contenedor.setLayout( esquema );
 
		contenedor.add( jTextField1, BorderLayout.NORTH ); 
 
	}
 
	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
 
	       if (!memoria.equals(jTextField1.getText())){
	         javax.swing.JOptionPane panel=null;
	         panel.showMessageDialog(null,"ha cambiado el texto");
 
	       }
	    } public static void main(String[] args) {
        buscadorAlumno a = new buscadorAlumno();
    }
}
