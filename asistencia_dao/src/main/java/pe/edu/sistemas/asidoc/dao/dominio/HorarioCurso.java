package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the horario_curso database table.
 * 
 */
@Entity
@Table(name="horario_curso")
@NamedQuery(name="HorarioCurso.findAll", query="SELECT h FROM HorarioCurso h")
public class HorarioCurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id_horario_curso")
	private Integer idHorarioCurso;

	private String estado;

	@Column(name="nom_grupo")
	private String nomGrupo;

	@Column(name="nom_tipo_clase")
	private String nomTipoClase;

	private String semestre;

	//bi-directional many-to-one association to Asistencia
	@OneToMany(mappedBy="horarioCurso")
	private List<Asistencia> asistencias;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso curso;

	//bi-directional many-to-one association to Docente
	@ManyToOne
	@JoinColumn(name="id_docente")
	private Docente docente;

	//bi-directional many-to-one association to Horario
	@ManyToOne
	@JoinColumn(name="id_horario")
	private Horario horario;

	public HorarioCurso() {
	}

	public Integer getIdHorarioCurso() {
		return this.idHorarioCurso;
	}

	public void setIdHorarioCurso(Integer idHorarioCurso) {
		this.idHorarioCurso = idHorarioCurso;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNomGrupo() {
		return this.nomGrupo;
	}

	public void setNomGrupo(String nomGrupo) {
		this.nomGrupo = nomGrupo;
	}

	public String getNomTipoClase() {
		return this.nomTipoClase;
	}

	public void setNomTipoClase(String nomTipoClase) {
		this.nomTipoClase = nomTipoClase;
	}

	public String getSemestre() {
		return this.semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public List<Asistencia> getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public Asistencia addAsistencia(Asistencia asistencia) {
		getAsistencias().add(asistencia);
		asistencia.setHorarioCurso(this);

		return asistencia;
	}

	public Asistencia removeAsistencia(Asistencia asistencia) {
		getAsistencias().remove(asistencia);
		asistencia.setHorarioCurso(null);

		return asistencia;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Docente getDocente() {
		return this.docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Horario getHorario() {
		return this.horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

}