package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the foto database table.
 * 
 */
@Entity
@NamedQuery(name="Foto.findAll", query="SELECT f FROM Foto f")
public class Foto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id_foto")
	private Integer idFoto;

	@Column(name="bl_estado")
	private String blEstado;

	@Column(name="nom_ruta")
	private String nomRuta;

	//bi-directional many-to-one association to Docente
	@ManyToOne
	@JoinColumn(name="id_docente")
	private Docente docente;

	public Foto() {
	}

	public Integer getIdFoto() {
		return this.idFoto;
	}

	public void setIdFoto(Integer idFoto) {
		this.idFoto = idFoto;
	}

	public String getBlEstado() {
		return this.blEstado;
	}

	public void setBlEstado(String blEstado) {
		this.blEstado = blEstado;
	}

	public String getNomRuta() {
		return this.nomRuta;
	}

	public void setNomRuta(String nomRuta) {
		this.nomRuta = nomRuta;
	}

	public Docente getDocente() {
		return this.docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

}