package Clases;

public class Empleados {
	private String nom, ape, us, con;

	public Empleados(String nom, String ape, String us, String con) {
		super();
		this.nom = nom;
		this.ape = ape;
		this.us = us;
		this.con = con;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getUs() {
		return us;
	}

	public void setUs(String us) {
		this.us = us;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}
}
