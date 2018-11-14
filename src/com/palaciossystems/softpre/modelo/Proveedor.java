package com.palaciossystems.softpre.modelo;

public class Proveedor {
	
	//ATRIBUTOS DE LA CLASE
	private int id_proveedor;
	private String rif;
	private String razonsocial;
	private String direccion;
	private String telefono;
	private String estado;

	public Proveedor() {
		// TODO Auto-generated constructor stub
		
	}
	
	//METODOS U OPERACIONES
	public int agregar(Proveedor p) {
		int res=0;
		
		Conectar cx = new Conectar();
		String com = "insert into proveedor (id_proveedor,rif,nombre,telefono,direccion,estado,creado,modificado) "+
		"values (null,'"+ 
				 p.getRif() +"','"+ 
				 p.getRazonsocial() +"','"+ 
				 p.getTelefono() +"','"+ 
				 p.getDireccion() +"',"+ 
				 p.getEstado() +",now(),now() )";
		
		res = cx.execQuery(com);
		cx.desconectar();
		
		System.out.println("Pasar por metodo agregar del modeloobj-proveedor: "+com);
		
		return res;
	}
	
	public int actualizar() {
		int res=0;
		return res;
	}
	
	public int eliminar() {
		int res=0;
		return res;
	}
	
	public void listar() {
		
	}
	
	
	//METODOS GETTERS Y SETTERS
	public int getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getRif() {
		return rif;
	}

	public void setRif(String rif) {
		this.rif = rif;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
