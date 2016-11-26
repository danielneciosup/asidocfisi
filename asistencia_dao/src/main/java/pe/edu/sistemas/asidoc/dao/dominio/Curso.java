package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CURSO database table.
 * 
 */
@Entity
@NamedQuery(name="Curso.findAll", query="SELECT c FROM Curso c")
public class Curso implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID_CURSO")
	private long idCurso;

	@Column(name="CO_CURSO")
	private String coCurso;

	@Column(name="NOM_CURSO")
	private String nomCurso;

	@Column(name="NU_CREDITOS")
	private BigDecimal nuCreditos;
	
	public Curso() {
	}

	public long getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}

	public String getCoCurso() {
		return this.coCurso;
	}

	public void setCoCurso(String coCurso) {
		this.coCurso = coCurso;
	}

	public String getNomCurso() {
		return this.nomCurso;
	}

	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}

	public BigDecimal getNuCreditos() {
		return this.nuCreditos;
	}

	public void setNuCreditos(BigDecimal nuCreditos) {
		this.nuCreditos = nuCreditos;
	}
}