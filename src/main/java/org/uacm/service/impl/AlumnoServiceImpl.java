package org.uacm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uacm.domain.Alumno;
import org.uacm.domain.AlumnoRepository;
import org.uacm.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	public Iterable<Alumno> consultarAlumnos(){
		return alumnoRepository.findAll();
	}

}
