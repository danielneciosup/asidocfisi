package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the HORARIO database table.
 * 
 */
@Entity
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID_HORARIO")
	private long idHorario;

	@Column(name="HO_FIN")
	private Timestamp hoFin;

	@Column(name="HO_INICIO")
	private Timestamp hoInicio;

	@Column(name="NOM_DIA")
	private String nomDia;

	public Horario() {
	}

	public long getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(long idHorario) {
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
}