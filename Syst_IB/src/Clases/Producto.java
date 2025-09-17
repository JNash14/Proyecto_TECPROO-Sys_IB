package Clases;

public class Producto {
private int cod;
private String nomp,cate;
private double preven, precos, cant;

public Producto(int cod, String nomp, String cate, double preven, double precos, double cant) {
	super();
	this.cod = cod;
	this.nomp = nomp;
	this.cate = cate;
	this.preven = preven;
	this.precos = precos;
	this.cant = cant;
}
public String getNomp() {
	return nomp;
}
public void setNomp(String nomp) {
	this.nomp = nomp;
}
public String getCate() {
	return cate;
}
public void setCate(String cate) {
	this.cate = cate;
}
public int getCod() {
	return cod;
}
public void setCod(int cod) {
	this.cod = cod;
}
public double getPreven() {
	return preven;
}
public void setPreven(double preven) {
	this.preven = preven;
}
public double getPrecos() {
	return precos;
}
public void setPrecos(double precos) {
	this.precos = precos;
}
public double getCant() {
	return cant;
}
public void setCant(double cant) {
	this.cant = cant;
}

}
