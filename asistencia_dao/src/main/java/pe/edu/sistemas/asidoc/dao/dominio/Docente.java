package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DOCENTE database table.
 * 
 */
@Entity
@NamedQuery(name="Docente.findAll", query="SELECT d FROM Docente d")
public class Docente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID_DOCENTE")
	private long idDocente;

	@Column(name="APE_MATERNO")
	private String apeMaterno;

	@Column(name="APE_PATERNO")
	private String apePaterno;

	@Column(name="CLAVE_SISTEMA")
	private String claveSistema;

	@Column(name="COD_DOCENTE")
	private String codDocente;

	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_NACIMIENTO")
	private Date feNacimiento;

	@Column(name="NOM_DOCENTE")
	private String nomDocente;

	@Column(name="NUM_DNI")
	private String numDni;
	
	public Docente() {
	}

	public long getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(long idDocente) {
		this.idDocente = idDocente;
	}

	public String getApeMaterno() {
		return this.apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getApePaterno() {
		return this.apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getClaveSistema() {
		return this.claveSistema;
	}

	public void setClaveSistema(String claveSistema) {
		this.claveSistema = claveSistema;
	}

	public String getCodDocente() {
		return this.codDocente;
	}

	public void setCodDocente(String codDocente) {
		this.codDocente = codDocente;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFeNacimiento() {
		return this.feNacimiento;
	}

	public void setFeNacimiento(Date feNacimiento) {
		this.feNacimiento = feNacimiento;
	}

	public String getNomDocente() {
		return this.nomDocente;
	}

	public void setNomDocente(String nomDocente) {
		this.nomDocente = nomDocente;
	}

	public String getNumDni() {
		return this.numDni;
	}

	public void setNumDni(String numDni) {
		this.numDni = numDni;
	}
}