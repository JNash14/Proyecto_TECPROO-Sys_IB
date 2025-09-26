package Clases;

public class StockProductos {
	private String codigo,nombre,categoria,proveedor;
    private double precioVenta, precioCosto;
    private int cantidad;
	public StockProductos(String codigo, String nombre, String categoria, String proveedor, double precioVenta,
			double precioCosto, int cantidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.proveedor = proveedor;
		this.precioVenta = precioVenta;
		this.precioCosto = precioCosto;
		this.cantidad = cantidad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double getPrecioCosto() {
		return precioCosto;
	}
	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
}
