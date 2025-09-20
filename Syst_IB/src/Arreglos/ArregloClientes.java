package Arreglos;
import java.util.ArrayList;
import Clases.Clientes;


public class ArregloClientes {
	private ArrayList<Clientes>clien;
	public ArregloClientes()
	{
		clien = new ArrayList<Clientes>();
		Adicionar(new Clientes(12546987, 966845124, "Castro", "Carlos", "Jr. Lima 1547"));//index 0
		Adicionar(new Clientes(84569585, 986564477, "Quispe", "Victoria", "Jr. Camaná 147"));//index 1
		Adicionar(new Clientes(75469521, 978456321, "Sipán", "Guillermo", "Av. 2 de mayo 1987"));//index 2
	}
	
	public void Adicionar(Clientes c)
	{
		clien.add(c);
	}
	public int Tamaño() {
		return clien.size();
	}
	public Clientes Obtener(int x) 
	{
		return clien.get(x);
	}
	public Clientes Buscar(int dni) 
	{
		for (int i=0;i<Tamaño();i++) {
			if(Obtener(i).getDni()==dni)return Obtener(i);
		}
		return null;
		
	}
	public void Eliminar(Clientes x) 
	{
		 clien.remove(x);
	}
}
