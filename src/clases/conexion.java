/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.*;
        

/**
 *
 * @author ricar
 */
public class conexion {
    //Conexión local
        public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proyecto_topicos", "root", "hernandez1");
            return cn ;
        } catch (SQLException e) {
            System.out.println("Error en conexion local" + e);
        }
        return (null);
    }
}
