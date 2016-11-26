package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USUARIO_ROL database table.
 * 
 */
@Entity
@Table(name="USUARIO_ROL")
@NamedQuery(name="UsuarioRol.findAll", query="SELECT u FROM UsuarioRol u")
public class UsuarioRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuarioRolPK id;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="ID_ROL")
	private Rol rol;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_ROL", referencedColumnName="CLAVE")
	private Usuario usuario;

	public UsuarioRol() {
	}

	public UsuarioRolPK getId() {
		return this.id;
	}

	public void setId(UsuarioRolPK id) {
		this.id = id;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}