package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the horario database table.
 * 
 */
@Entity
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id_horario")
	private Integer idHorario;

	@Column(name="ho_fin")
	private Timestamp hoFin;

	@Column(name="ho_inicio")
	private Timestamp hoInicio;

	@Column(name="nom_dia")
	private String nomDia;

	//bi-directional many-to-one association to HorarioCurso
	@OneToMany(mappedBy="horario")
	private List<HorarioCurso> horarioCursos;

	public Horario() {
	}

	public Integer getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public Timestamp getHoFin() {
		return this.hoFin;
	}

	public void setHoFin(Timestamp hoFin) {
		this.hoFin = hoFin;
	}

	public Timestamp getHoInicio() {
		return this.hoInicio;
	}

	public void setHoInicio(Timestamp hoInicio) {
		this.hoInicio = hoInicio;
	}

	public String getNomDia() {
		return this.nomDia;
	}

	public void setNomDia(String nomDia) {
		this.nomDia = nomDia;
	}

	public List<HorarioCurso> getHorarioCursos() {
		return this.horarioCursos;
	}

	public void setHorarioCursos(List<HorarioCurso> horarioCursos) {
		this.horarioCursos = horarioCursos;
	}

	public HorarioCurso addHorarioCurso(HorarioCurso horarioCurso) {
		getHorarioCursos().add(horarioCurso);
		horarioCurso.setHorario(this);

		return horarioCurso;
	}

	public HorarioCurso removeHorarioCurso(HorarioCurso horarioCurso) {
		getHorarioCursos().remove(horarioCurso);
		horarioCurso.setHorario(null);

		return horarioCurso;
	}

}