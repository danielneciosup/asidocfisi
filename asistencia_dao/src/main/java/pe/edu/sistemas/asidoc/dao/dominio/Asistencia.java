package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ASISTENCIA database table.
 * 
 */
@Entity
@NamedQuery(name="Asistencia.findAll", query="SELECT a FROM Asistencia a")
public class Asistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID_ASISTENCIA")
	private long idAsistencia;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_REGISTRO")
	private Date feRegistro;

	@Column(name="TIPO_ASISTENCIA")
	private String tipoAsistencia;

	private String validacion;

	//bi-directional many-to-one association to HorarioCurso
	@ManyToOne
	@JoinColumn(name="ID_HORARIO_CURSO")
	private HorarioCurso horarioCurso;

	public Asistencia() {
	}

	public long getIdAsistencia() {
		return this.idAsistencia;
	}

	public void setIdAsistencia(long idAsistencia) {
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
}