package pe.edu.sistemas.asidoc.bo;

// Generated 23-nov-2016 14:14:44 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class RolBO implements java.io.Serializable {

	private int idRol;
	private String nomRol;

	public RolBO() {
	}

	public RolBO(int idRol, String nomRol) {
		this.idRol = idRol;
		this.nomRol = nomRol;
	}


	public int getIdRol() {
		return this.idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNomRol() {
		return this.nomRol;
	}

	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}
}
