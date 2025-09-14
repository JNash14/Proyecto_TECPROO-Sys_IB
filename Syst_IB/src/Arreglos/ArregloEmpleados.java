package Arreglos;

import java.util.ArrayList;

import Clases.Empleados;

public class ArregloEmpleados {
	public ArrayList<Empleados>emp;
	public ArregloEmpleados() {
		emp=new ArrayList<Empleados>();
		Añadir(new Empleados("Gustavo", "Giribaldi", "gusgiri", "1234"));
		Añadir(new Empleados("Crhris", "Gutierrez", "chrigut", "1133"));
		Añadir(new Empleados("Fabricio", "Inca", "fabrinca", "2234"));
		Añadir(new Empleados("Steven", "Baltazar", "stebal", "4421"));
	}
	public void Añadir(Empleados x) {
        emp.add(x);
	}
	
}
