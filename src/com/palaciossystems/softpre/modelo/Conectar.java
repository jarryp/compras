package com.palaciossystems.softpre.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conectar {
	
	private Connection con      = null;
	private Statement  consulta = null;
	private ResultSet  data     = null;
	private String server;
	private String database;
	private String port;
	private String usuario;
	private String clave;
	
	public Conectar() {
		// TODO Auto-generated constructor stub
		this.server   = "localhost";
		this.port     = "3306";
		this.database = "compras";
		this.usuario  = "root";
		this.clave    = "";
	}
	
	public void con() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://"+this.server+"/"+this.database;
			this.con = DriverManager.getConnection(url, this.usuario, this.clave);
			this.consulta = this.con.createStatement();
			System.out.println("Conexión Exitosa...");
		}catch(Exception e) {
			System.out.println("Error de Conexión..."+e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}
	
	
	public int execQuery(String com){
		int res=0;
		try {
			this.con();
			res = this.consulta.executeUpdate(com);
		}catch(Exception e) {
			System.out.println("Error de Ejecución MDL: "+e.getMessage());
		}
		
		return res;
	}
	
	public void desconectar() {
		try {
			if(this.con!=null) {
				this.con.close();
			}
		}catch(Exception e) {
			System.out.println("Error al cerrar conexion...");
		}
	}

}
