package arreglo;

import java.util.ArrayList;

import clase.Estudiante;

public class ArregloEstudiantes {
	private ArrayList<Estudiante>estu;
	public ArregloEstudiantes() {
		estu=new ArrayList<Estudiante>();
		Adicionar(new Estudiante(1020, "Ana", 12.5, 14.5));
		Adicionar(new Estudiante(3440, "Rosa", 14, 17));
		Adicionar(new Estudiante(2050, "Jose", 13, 15));
	}
	public void Adicionar(Estudiante x) {
		estu.add(x);
	}
	public int Tamaño() {
		return estu.size();
	}
	public Estudiante Obtener(int x) {
		return estu.get(x);
	}
	public double PromedioGeneral() {
		double suma=0.0;
		for (int i=0;i<Tamaño();i++) {
			suma+=Obtener(i).Promedio();
		}
		return suma/Tamaño();
	}
	public Estudiante Buscar(int cod) {
		for (int i=0;i<Tamaño();i++) {
			if(Obtener(i).getCod()==cod)return Obtener(i);
		}
		return null;
	}
	public void Eliminar(Estudiante x) {
		estu.remove(x);
	}
}





