package pe.edu.sistemas.asidoc.bo;

// Generated 23-nov-2016 14:14:44 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Personal generated by hbm2java
 */
public class PersonalBO implements java.io.Serializable {

	private int idPersonal;
	private String nombre;
	private String apellido;
	private String correo;

	public PersonalBO() {
	}

	public PersonalBO(int idPersonal, String nombre, String apellido,
			String correo) {
		this.idPersonal = idPersonal;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}

	public int getIdPersonal() {
		return this.idPersonal;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
