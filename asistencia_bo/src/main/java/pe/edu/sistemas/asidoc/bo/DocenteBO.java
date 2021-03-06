package pe.edu.sistemas.asidoc.bo;

// Generated 23-nov-2016 14:14:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Docente generated by hbm2java
 */
public class DocenteBO implements java.io.Serializable {

	private int idDocente;
	private String codDocente;
	private String numDni;
	private String nomDocente;
	private String apePaterno;
	private String apeMaterno;
	private Date feNacimiento;
	private String email;

	public DocenteBO() {
	}

	public DocenteBO(int idDocente, String codDocente, String numDni,
			String nomDocente, String apePaterno, String apeMaterno,
			Date feNacimiento, String email) {
		this.idDocente = idDocente;
		this.codDocente = codDocente;
		this.numDni = numDni;
		this.nomDocente = nomDocente;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.feNacimiento = feNacimiento;
		this.email = email;
	}

	public int getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}

	public String getCodDocente() {
		return this.codDocente;
	}

	public void setCodDocente(String codDocente) {
		this.codDocente = codDocente;
	}

	public String getNumDni() {
		return this.numDni;
	}

	public void setNumDni(String numDni) {
		this.numDni = numDni;
	}

	public String getNomDocente() {
		return this.nomDocente;
	}

	public void setNomDocente(String nomDocente) {
		this.nomDocente = nomDocente;
	}

	public String getApePaterno() {
		return this.apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return this.apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public Date getFeNacimiento() {
		return this.feNacimiento;
	}

	public void setFeNacimiento(Date feNacimiento) {
		this.feNacimiento = feNacimiento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
