package Arreglos;

import java.util.ArrayList;

import Clases.Proveedor;

public class ArregloProveedor {
	private static ArrayList<Proveedor>prov;
	public ArregloProveedor(){
		prov=new ArrayList<Proveedor>(); //CREAMOS EL ARRAY PARA ALMACENAR LOS DATOS PARA TXTAREA
		Añadir(new Proveedor("Gloria","Juan","Vende leche","999999999")); //PROVEEDOR|ENCARGADO|DESCRIPCION|NUMERO TELEFONO
		Añadir(new Proveedor("Avicola","Fernando","Vende huevos","999999999"));
	}
	public static void Añadir(Proveedor x){
		prov.add(x);
	}
	public static int Tamaño(){
		return prov.size();
	}
	public static Proveedor Obtener(int x) {
		return prov.get(x);
	}
	public static Proveedor Buscar(String proveedor, String encargado) {
	    for (int i = 0; i < Tamaño(); i++) {
	        if (Obtener(i).getEncargado().equalsIgnoreCase(encargado) &&
	            Obtener(i).getProveedor().equalsIgnoreCase(proveedor)) {
	            return Obtener(i);
	        }
	    }
	    return null;
	}
	public static void Eliminar(Proveedor x) {
		prov.remove(x);
        }
	}
