package Clases;

public class Clientes {
	private int dni,celu;
	private String apellidos, nombres, direccion;	
	
	//generando contructor
	public Clientes(int dni, int celu, String apellidos, String nombres, String direccion) {
		super();
		this.dni = dni;
		this.celu = celu;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.direccion = direccion;
	}
	//generando Get and Set
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}	
	public int getCelu() {
		return celu;
	}
	public void setCelu(int celu) {
		this.celu = celu;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
