package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "asignacion_alumnos_aulas")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_insertar_asignacion_alumnos_aulas", procedureName = "f_insertar_asignacion_alumnos_aulas", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idestudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idaula", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_editar_asignacion_alumnos_aulas", procedureName = "f_editar_asignacion_alumnos_aulas", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idestudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idasignacionaula", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})

public class AsignacionAlumnoAula {
	@Id
    @Column(name = "idasignacion")
    private int idAsignacion;

    @Column(name = "idestudiante")
    private int idEstudiante;

    @Column(name = "idasignacionaula")
    private int idAula;

    @Column(name = "fecha_asignacion")
    private Date fechaAsignacion;
    
    private int idsolicitud;

    private int idciclo;
    
    

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}

	public AsignacionAlumnoAula(int idAsignacion, int idEstudiante, int idAula, Date fechaAsignacion, int idsolicitud) {
		super();
		this.idAsignacion = idAsignacion;
		this.idEstudiante = idEstudiante;
		this.idAula = idAula;
		this.fechaAsignacion = fechaAsignacion;
		this.idsolicitud = idsolicitud;
	}

	public int getIdsolicitud() {
		return idsolicitud;
	}

	public void setIdsolicitud(int idsolicitud) {
		this.idsolicitud = idsolicitud;
	}

	public int getIdAsignacion() {
		return idAsignacion;
	}

	public void setIdAsignacion(int idAsignacion) {
		this.idAsignacion = idAsignacion;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public int getIdAula() {
		return idAula;
	}

	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public AsignacionAlumnoAula(int idAsignacion, int idEstudiante, int idAula, Date fechaAsignacion) {
		super();
		this.idAsignacion = idAsignacion;
		this.idEstudiante = idEstudiante;
		this.idAula = idAula;
		this.fechaAsignacion = fechaAsignacion;
	}

	public AsignacionAlumnoAula() {
		super();
	}
}