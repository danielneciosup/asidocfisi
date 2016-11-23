package pe.edu.sistemas.asidoc.dao.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the docente database table.
 * 
 */
@Entity
@NamedQuery(name="Docente.findAll", query="SELECT d FROM Docente d")
public class Docente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id_docente")
	private Integer idDocente;

	@Column(name="ape_materno")
	private String apeMaterno;

	@Column(name="ape_paterno")
	private String apePaterno;

	@Column(name="clave_sistema")
	private String claveSistema;

	@Column(name="cod_docente")
	private String codDocente;

	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name="fe_nacimiento")
	private Date feNacimiento;

	@Column(name="nom_docente")
	private String nomDocente;

	@Column(name="num_dni")
	private String numDni;

	//bi-directional many-to-one association to Foto
	@OneToMany(mappedBy="docente")
	private List<Foto> fotos;

	//bi-directional many-to-one association to HorarioCurso
	@OneToMany(mappedBy="docente")
	private List<HorarioCurso> horarioCursos;

	public Docente() {
	}

	public Integer getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(Integer idDocente) {
		this.idDocente = idDocente;
	}

	public String getApeMaterno() {
		return this.apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getApePaterno() {
		return this.apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getClaveSistema() {
		return this.claveSistema;
	}

	public void setClaveSistema(String claveSistema) {
		this.claveSistema = claveSistema;
	}

	public String getCodDocente() {
		return this.codDocente;
	}

	public void setCodDocente(String codDocente) {
		this.codDocente = codDocente;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFeNacimiento() {
		return this.feNacimiento;
	}

	public void setFeNacimiento(Date feNacimiento) {
		this.feNacimiento = feNacimiento;
	}

	public String getNomDocente() {
		return this.nomDocente;
	}

	public void setNomDocente(String nomDocente) {
		this.nomDocente = nomDocente;
	}

	public String getNumDni() {
		return this.numDni;
	}

	public void setNumDni(String numDni) {
		this.numDni = numDni;
	}

	public List<Foto> getFotos() {
		return this.fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	public Foto addFoto(Foto foto) {
		getFotos().add(foto);
		foto.setDocente(this);

		return foto;
	}

	public Foto removeFoto(Foto foto) {
		getFotos().remove(foto);
		foto.setDocente(null);

		return foto;
	}

	public List<HorarioCurso> getHorarioCursos() {
		return this.horarioCursos;
	}

	public void setHorarioCursos(List<HorarioCurso> horarioCursos) {
		this.horarioCursos = horarioCursos;
	}

	public HorarioCurso addHorarioCurso(HorarioCurso horarioCurso) {
		getHorarioCursos().add(horarioCurso);
		horarioCurso.setDocente(this);

		return horarioCurso;
	}

	public HorarioCurso removeHorarioCurso(HorarioCurso horarioCurso) {
		getHorarioCursos().remove(horarioCurso);
		horarioCurso.setDocente(null);

		return horarioCurso;
	}

}