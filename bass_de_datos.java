/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Alexander
 */
public class bass_de_datos {
    public void guardarAlumnosBD(Alumno Alumno){
        try {
            System.out.println("entro");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/estudiantes","root","root");
            System.out.println("Concexion establecida");
            
            Statement sentencia = conexion.createStatement();
                  int insert = sentencia.executeUpdate("insert into datosestudiante values ('"  +Alumno.getCedula()+"','" + Alumno.getNombre() + "','"
                    + Alumno.getApellido() +"','"+ Alumno.getEdad() + "','"+ Alumno.getSexo() + "','"+ Alumno.getHorario() +"','" + Alumno.getCurso()+"')");      
           sentencia.close();
            conexion.close();
        }catch(Exception ex){
            System.out.println("Eroor de coneccion"+ ex);
        }}
        public void EliminarBD(Alumno Alumno){
        try {
            System.out.println("entro");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/estudiantes","root","root");
            System.out.println("Concexion establecida");
            
            Statement sentencia = conexion.createStatement();
                  int delete = sentencia.executeUpdate(" delete from datosestudiante where cedula = "+ Alumno.getCedula());      
           sentencia.close();
            conexion.close();
        }catch(Exception ex){
            System.out.println("Eroor de coneccion"+ ex);
        }
    }
}
