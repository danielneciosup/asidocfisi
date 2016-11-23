package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the asistencia database table.
 * 
 */
@Entity
@NamedQuery(name="Asistencia.findAll", query="SELECT a FROM Asistencia a")
public class Asistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id_asistencia")
	private Integer idAsistencia;

	@Temporal(TemporalType.DATE)
	@Column(name="fe_registro")
	private Date feRegistro;

	@Column(name="tipo_asistencia")
	private String tipoAsistencia;

	private String validacion;

	//bi-directional many-to-one association to HorarioCurso
	@ManyToOne
	@JoinColumn(name="id_horario_curso")
	private HorarioCurso horarioCurso;

	//bi-directional many-to-one association to AsistenciaDetalle
	@OneToMany(mappedBy="asistencia")
	private List<AsistenciaDetalle> asistenciaDetalles;

	public Asistencia() {
	}

	public Integer getIdAsistencia() {
		return this.idAsistencia;
	}

	public void setIdAsistencia(Integer idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	public Date getFeRegistro() {
		return this.feRegistro;
	}

	public void setFeRegistro(Date feRegistro) {
		this.feRegistro = feRegistro;
	}

	public String getTipoAsistencia() {
		return this.tipoAsistencia;
	}

	public void setTipoAsistencia(String tipoAsistencia) {
		this.tipoAsistencia = tipoAsistencia;
	}

	public String getValidacion() {
		return this.validacion;
	}

	public void setValidacion(String validacion) {
		this.validacion = validacion;
	}

	public HorarioCurso getHorarioCurso() {
		return this.horarioCurso;
	}

	public void setHorarioCurso(HorarioCurso horarioCurso) {
		this.horarioCurso = horarioCurso;
	}

	public List<AsistenciaDetalle> getAsistenciaDetalles() {
		return this.asistenciaDetalles;
	}

	public void setAsistenciaDetalles(List<AsistenciaDetalle> asistenciaDetalles) {
		this.asistenciaDetalles = asistenciaDetalles;
	}

	public AsistenciaDetalle addAsistenciaDetalle(AsistenciaDetalle asistenciaDetalle) {
		getAsistenciaDetalles().add(asistenciaDetalle);
		asistenciaDetalle.setAsistencia(this);

		return asistenciaDetalle;
	}

	public AsistenciaDetalle removeAsistenciaDetalle(AsistenciaDetalle asistenciaDetalle) {
		getAsistenciaDetalles().remove(asistenciaDetalle);
		asistenciaDetalle.setAsistencia(null);

		return asistenciaDetalle;
	}

}