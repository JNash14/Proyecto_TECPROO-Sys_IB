package Clases;

public class Proveedor {
	    private String Proveedor,encargado,descripcion,numero;

		public Proveedor(String proveedor, String encargado, String descripcion, String numero) {
			super();
			this.Proveedor = proveedor;
			this.encargado = encargado;
			this.descripcion = descripcion;
			this.numero = numero;
		}

		public String getProveedor() {
			return Proveedor;
		}

		public void setProveedor(String proveedor) {
			Proveedor = proveedor;
		}

		public String getEncargado() {
			return encargado;
		}

		public void setEncargado(String encargado) {
			this.encargado = encargado;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}
		 @Override
		    public String toString() {
		        return "Proveedor: " + Proveedor +
		               " | Descripción: " + descripcion +
		               " | Encargado: " + encargado +
		               " | Número: " + numero + "\n";
		 }
}

