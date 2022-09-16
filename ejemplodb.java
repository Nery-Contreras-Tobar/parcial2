
package com.progra2.p2bc9db;

import java.sql.*;

public class ejemplodb {
    
    public static void parcial2(int id){
   
        String url = "jdbc:mysql://localhost:3306/parcial2?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
       
            Connection conexion = DriverManager.getConnection(url,"root","Root");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM parcial2  where niv = "+15;
            ResultSet resultado = sentencia.executeQuery(sql);
           
            while(resultado.next()){
                System.out.println("Niv ="+resultado.getInt(1));
                System.out.println("Nombre = "+resultado.getString(2));
                System.out.println("Enero ="+resultado.getInt(3));
                System.out.println("Febrero ="+resultado.getInt(4));
                System.out.println("Marzo ="+resultado.getInt(5));
                System.out.println("Abril ="+resultado.getInt(6));
                System.out.println("Mayo ="+resultado.getInt(7));
                System.out.println("Junio ="+resultado.getInt(8));
            }
        } catch (SQLException ex) {
            System.out.println("Error" +ex.getMessage());
        }
}
    
      public static void parcial(int id,int Enero){
    
        String url = "jdbc:mysql://localhost:3306/parcial2?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
      
            Connection conexion = DriverManager.getConnection(url,"root","Root");
            Statement sentencia = conexion.createStatement();
            //String sql = "insert into parcial2 (nombre, enero, febrero, marzo, abril, mayo, junio ) value ('Nery', 45, 57, 95, 48, 66, 99)";
            String sql = "update parcial2  set enero = "+Enero+" where niv = "+15;
            //String sql = "delete from parcial2 where niv = "+20;
            //String sql = "select * from parcial2 where niv = 19";
            sentencia.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("Error" +ex.getMessage());
        }
}
   
    public static void main(String[] args) {
        parcial(4,50);
        parcial2(4);
    }
    
}
