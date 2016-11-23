package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the curso database table.
 * 
 */
@Entity
@NamedQuery(name="Curso.findAll", query="SELECT c FROM Curso c")
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id_curso")
	private Integer idCurso;

	@Column(name="co_curso")
	private String coCurso;

	@Column(name="nom_curso")
	private String nomCurso;

	@Column(name="nu_creditos")
	private Integer nuCreditos;

	//bi-directional many-to-one association to HorarioCurso
	@OneToMany(mappedBy="curso")
	private List<HorarioCurso> horarioCursos;

	public Curso() {
	}

	public Integer getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(Integer idCurso) {
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

	public Integer getNuCreditos() {
		return this.nuCreditos;
	}

	public void setNuCreditos(Integer nuCreditos) {
		this.nuCreditos = nuCreditos;
	}

	public List<HorarioCurso> getHorarioCursos() {
		return this.horarioCursos;
	}

	public void setHorarioCursos(List<HorarioCurso> horarioCursos) {
		this.horarioCursos = horarioCursos;
	}

	public HorarioCurso addHorarioCurso(HorarioCurso horarioCurso) {
		getHorarioCursos().add(horarioCurso);
		horarioCurso.setCurso(this);

		return horarioCurso;
	}

	public HorarioCurso removeHorarioCurso(HorarioCurso horarioCurso) {
		getHorarioCursos().remove(horarioCurso);
		horarioCurso.setCurso(null);

		return horarioCurso;
	}

}