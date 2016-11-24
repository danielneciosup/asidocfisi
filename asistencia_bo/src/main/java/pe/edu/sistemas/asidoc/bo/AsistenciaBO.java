package pe.edu.sistemas.asidoc.bo;

// Generated 23-nov-2016 14:14:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Asistencia generated by hbm2java
 */
public class AsistenciaBO implements java.io.Serializable {

	private int idAsistencia;
	private HorarioCursoBO horarioCurso;
	private String tipoAsistencia;
	private Date feRegistro;
	private char validacion;
	
	public AsistenciaBO() {
	}

	public AsistenciaBO(int idAsistencia, HorarioCursoBO horarioCurso,
			String tipoAsistencia, Date feRegistro, char validacion) {
		this.idAsistencia = idAsistencia;
		this.horarioCurso = horarioCurso;
		this.tipoAsistencia = tipoAsistencia;
		this.feRegistro = feRegistro;
		this.validacion = validacion;
	}
	
	public int getIdAsistencia() {
		return this.idAsistencia;
	}

	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	public HorarioCursoBO getHorarioCurso() {
		return this.horarioCurso;
	}

	public void setHorarioCurso(HorarioCursoBO horarioCurso) {
		this.horarioCurso = horarioCurso;
	}

	public String getTipoAsistencia() {
		return this.tipoAsistencia;
	}

	public void setTipoAsistencia(String tipoAsistencia) {
		this.tipoAsistencia = tipoAsistencia;
	}

	public Date getFeRegistro() {
		return this.feRegistro;
	}

	public void setFeRegistro(Date feRegistro) {
		this.feRegistro = feRegistro;
	}

	public char getValidacion() {
		return this.validacion;
	}

	public void setValidacion(char validacion) {
		this.validacion = validacion;
	}
}
