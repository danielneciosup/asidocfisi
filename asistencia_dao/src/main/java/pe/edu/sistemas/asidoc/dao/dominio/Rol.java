package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ROL database table.
 * 
 */
@Entity
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID_ROL")
	private long idRol;

	@Column(name="NOM_ROL")
	private String nomRol;

	public Rol() {
	}

	public long getIdRol() {
		return this.idRol;
	}

	public void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public String getNomRol() {
		return this.nomRol;
	}

	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}
}