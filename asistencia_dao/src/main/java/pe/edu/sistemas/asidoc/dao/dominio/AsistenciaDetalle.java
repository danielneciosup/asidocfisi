package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the asistencia_detalle database table.
 * 
 */
@Entity
@Table(name="asistencia_detalle")
@NamedQuery(name="AsistenciaDetalle.findAll", query="SELECT a FROM AsistenciaDetalle a")
public class AsistenciaDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id_detalle")
	private Integer idDetalle;

	private Timestamp hora;

	@Column(name="ruta_foto")
	private String rutaFoto;

	@Column(name="tipo_marcacion")
	private String tipoMarcacion;

	@Column(name="tipo_registro")
	private String tipoRegistro;

	//bi-directional many-to-one association to Asistencia
	@ManyToOne
	@JoinColumn(name="id_asistencia")
	private Asistencia asistencia;

	public AsistenciaDetalle() {
	}

	public Integer getIdDetalle() {
		return this.idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Timestamp getHora() {
		return this.hora;
	}

	public void setHora(Timestamp hora) {
		this.hora = hora;
	}

	public String getRutaFoto() {
		return this.rutaFoto;
	}

	public void setRutaFoto(String rutaFoto) {
		this.rutaFoto = rutaFoto;
	}

	public String getTipoMarcacion() {
		return this.tipoMarcacion;
	}

	public void setTipoMarcacion(String tipoMarcacion) {
		this.tipoMarcacion = tipoMarcacion;
	}

	public String getTipoRegistro() {
		return this.tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public Asistencia getAsistencia() {
		return this.asistencia;
	}

	public void setAsistencia(Asistencia asistencia) {
		this.asistencia = asistencia;
	}

}