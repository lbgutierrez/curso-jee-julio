package cl.ibm.residencia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="res_residente")
@NamedQuery(name="Residente.findAll", query="SELECT r FROM Residente r")
public class Residente implements Serializable {

	private static final long serialVersionUID = 6446792229765369730L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="res_id", updatable = false, nullable = false)
	private Integer id;

	@Column(name="res_rut")
	private String rut;
	
	@Column(name="res_nombre")
	private String nombre;
	
	@Column(name="res_residente")
	private Boolean residente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getResidente() {
		return residente;
	}

	public void setResidente(Boolean residente) {
		this.residente = residente;
	}

}
