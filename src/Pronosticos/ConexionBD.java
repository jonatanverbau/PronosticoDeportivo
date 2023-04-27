/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pronosticos;

/**
 *
 * @author Jonatan
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

class ConexionBD {

	 private String servidor; // = "jdbc:mysql://localhost:3306/";
	   private String DBnombre; //="argentina2023";
	   private String driver; // = "com.mysql.jdbc.Driver";
	   private String username; // = "root";
	   private String password; // = "crac";

	    ConexionBD(){
	    	 Properties properties= new Properties();
			    try {
			      properties.load(new FileInputStream(new File("ConexString.properties")));
			      this.servidor= (String) properties.get("servidor");
			      this.DBnombre= (String) properties.get("DBnombre");
			      this.driver= (String) properties.get("driver");
			      this.username= (String) properties.get("username");
			      this.password= (String) properties.get("password");
			     
			    } catch (FileNotFoundException e) {

			      e.printStackTrace();
			    } catch (IOException e) {

			      e.printStackTrace();
			    }
			    
	    	
	    }
	   
	    // Objeto del tipo Connection para crear la conexión
	    private Connection con;

	    public void Conexion()
	    {
	        try {
	            // Cargar drivers de MySQL
	            Class.forName(driver);

	            // Establecer la conexion con la base de datos
	            con = DriverManager.getConnection(servidor + DBnombre , username, password);

	            System.out.println("Conexión realizada a la base de datos con éxito.");
	        } catch (ClassNotFoundException | SQLException e) {
	            System.out.println("Error!, conexión fallida a la base de datos.");
	        }
	    }

	    public Connection getConnection() {
	    	Conexion();
	        return con; // Retorno el objeto Connection
	    }
	}