package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USUARIO database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID_USUARIO")
	private Integer idUsuario;

	private String clave;

	@Column(name="NOM_USUARIO")
	private String nomUsuario;

	//bi-directional many-to-one association to Personal
	@ManyToOne
	@JoinColumn(name="ID_PERSONAL")
	private Personal personal;

	public Usuario() {
	}	

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNomUsuario() {
		return this.nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

}