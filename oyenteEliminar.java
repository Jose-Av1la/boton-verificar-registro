/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Alumno;
import modelos.bass_de_datos;
import vistas.cventana;

/**
 *
 * @author satboy
 */
public class oyenteEliminar implements ActionListener{
    cventana vp;
bass_de_datos abd;
Alumno a;

    public oyenteEliminar(cventana vp) {
    
    this.vp=vp;}

   
        @Override
    
    public void actionPerformed(ActionEvent ae) {
        // dela vista recibo un alumno 
      //a=vp.guardarAlumno();
       // System.out.println("cedula" + a.getCedula());
      // en la base de datos envio un alumno a guardar
      abd= new bass_de_datos();
        
            
            abd.EliminarBD(vp.eliminar());
        
        
        
        
    }
    
}
