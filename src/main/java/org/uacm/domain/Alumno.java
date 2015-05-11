package org.uacm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idAlumno;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Integer asistencia;


	
}
