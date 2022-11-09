package pe.idat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEstudiante;
	private String nombre;
	private String apellido;
	private String grado;
	
	public Integer getIdEstudiante() {
		return idEstudiante;
	}
	public void setIdEstudiante(Integer idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	
}
