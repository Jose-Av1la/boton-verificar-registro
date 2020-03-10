/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import control.oyenteEliminar;
import control.oyentecrearalumno;
import control.oyenteverificar;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import modelos.Alumno;
import static sun.misc.MessageUtils.where;



public class cventana {

    private JFrame frame = new JFrame("Alumno");
    private JLabel nombre;
    private JLabel apellido;
    private JLabel edad;
     private JTextField textonombre;
     private JTextField textoapellido;
    private JTextField textoedad;
     private JLabel sexo;
    private JCheckBox mujer;
    private JCheckBox hombre;
    private JLabel curso;
    private JTextField textocurso;
    private JLabel horario;
    private JTextField textohorario;
    private JLabel cedula;
    private JTextField textocedula;
    private JButton registrar;
    private JButton salir;
    private JButton eliminar;
    private JButton verificar;
    private boolean bko,bk=true;

    public JButton getEliminar() {
        return eliminar;
    }

    public void setEliminar(JButton eliminar) {
        this.eliminar = eliminar;
    }
    private JComboBox cmbsexo;
    private Alumno alumno= new Alumno();

    public JButton getRegistrar() {
        return registrar;
    }

    public void setRegistrar(JButton registrar) {
        this.registrar = registrar;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    
    
    

    public cventana() {
      
        
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame = new JFrame("Alumno");
        frame.setSize(400, 500);
        JPanel pane = new JPanel(new GridBagLayout());
        frame.setContentPane(pane);
        JTextField tex = new JTextField();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 2;
        c.weighty = 2;
        c.fill = GridBagConstraints.HORIZONTAL;

        nombre = new JLabel("Nombres:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 0;

        pane.add(nombre, c);

        apellido = new JLabel("Apellido:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 1;
        pane.add(apellido, c);

        edad = new JLabel("Edad:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 3;

        pane.add(edad, c);

        textonombre = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 0;

        pane.add(textonombre, c);
        
        
        textoapellido = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 1;

        pane.add(textoapellido, c);
        

        textoedad = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 3;

        pane.add(textoedad, c);

        sexo = new JLabel("Sexo:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 4;

        pane.add(sexo, c);

        Vector v = new Vector(4);
        v.addElement("");
        v.addElement("Hombre");
        v.addElement("Mujer");
        cmbsexo = new JComboBox(v);
        
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 4;

        pane.add(cmbsexo, c);

//        hombre = new JCheckBox("Hombre");
//        hombre.setBackground(Color.lightGray);
//        c.gridx = 2;
//        c.gridwidth = 2;
//        c.gridy = 5;
//
//        pane.add(hombre, c);

        curso = new JLabel("Curso");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 6;

        pane.add(curso, c);

        textocurso = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 6;

        pane.add(textocurso, c);

        horario = new JLabel("Horario");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 7;

        pane.add(horario, c);

        textohorario = new JTextField(1);
        
        
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 7;
       
        pane.add(textohorario, c);

        cedula = new JLabel("Cedula");

        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 2;

        pane.add(cedula, c);

        textocedula = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 2;

        pane.add(textocedula, c);

        registrar = new JButton("Registrar");
        //registrar.setBackground(Color.lightGray);
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 9;
        pane.add(registrar, c);
        registrar.addActionListener(new oyentecrearalumno(this));

        salir = new JButton("Salir");
       // salir.setBackground(Color.lightGray);
        c.gridx = 3;
        c.gridwidth = 3;
        c.gridy = 9;
        pane.add(salir, c);
        
        eliminar = new JButton ("Eliminar");
        //eliminar.setBackground(Color.lightGray);
        c.gridx=2;
        c.gridwidth = 2;
        c.gridy= 9;
        pane.add(eliminar,c);
        eliminar.addActionListener(new oyenteEliminar(this));
        
         verificar = new JButton ("Verificar");
        //eliminar.setBackground(Color.lightGray);
        c.gridx=3;
        c.gridwidth = 2;
        c.gridy= 0;
        pane.add(verificar,c);
        verificar.addActionListener(new oyenteverificar(this));
        
        

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }

        });
        frame.setVisible(true);
        blokear();
    }
public Alumno guardarAlumno(){
    alumno=new Alumno();
    alumno.setCedula(textocedula.getText());
    alumno.setNombre(textonombre.getText());
    alumno.setApellido(textoapellido.getText());
    alumno.setCurso(textocurso.getText());
    alumno.setSexo((String)cmbsexo.getSelectedItem());
    alumno.setEdad(textoedad.getText());
    alumno.setHorario(textohorario.getText());
    return alumno;
} public Alumno eliminar(){
    alumno.setCedula(textocedula.getText());
        return alumno;
    
 
} public void blokear(){
 textonombre.setEditable(false);
 textoapellido.setEditable(false);
 textocurso.setEditable(false);    
   cmbsexo.setEditable(false);
    textoedad.setEditable(false);
    textohorario.setEditable(false);

}public void desblokear(){
    textonombre.setEditable(true);
 textoapellido.setEditable(true);
 textocurso.setEditable(true);    
   cmbsexo.setEditable(true);
    textoedad.setEditable(true);
    textohorario.setEditable(true);
    
    
    
    
}


    
    

    
    
    
  
    
}

