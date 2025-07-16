package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.Table;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@Table(name = "ciclos")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "listar_ciclos", procedureName = "f_listar_ciclos", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_ciclos_por_usuario", procedureName = "f_listar_ciclos_por_usuario", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "listar_ciclos_con_banco", procedureName = "f_listar_ciclos_con_banco", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "filtrar_estudiantes_ciclo", procedureName = "f_filtrar_estudiantes_ciclo", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_ciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "listar_ciclos_universidad", procedureName = "f_listar_ciclos_universidad", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_universidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_ciclos_banco_preguntas_universidad", procedureName = "f_listar_ciclos_banco_preguntas_universidad", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_universidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_ciclos_mantenimiento", procedureName = "f_listar_ciclos_mantenimiento", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_condicion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

//		@NamedStoredProcedureQuery(name = "f_eliminar_ciclo", procedureName = "f_eliminar_ciclo", parameters = {
//
//				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
//				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

//		@NamedStoredProcedureQuery(name = "f_insertar_ciclos", procedureName = "f_insertar_ciclos", parameters = {
//
//				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
//				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_ciclo", type = String.class),
//				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio", type = Double.class),
//				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

//		@NamedStoredProcedureQuery(name = "f_actualizar_ciclo", procedureName = "f_actualizar_ciclo", parameters = {
//
//				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_ciclo", type = Integer.class),
//				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_ciclo", type = String.class),
//				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio", type = Double.class),
//				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_visibilidad_landing_ciclos", procedureName = "f_visibilidad_landing_ciclos", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_ciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_visible", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_insertar_ciclos", procedureName = "f_insertar_ciclos", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idaula", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idturno", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idnumeracion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero_aula", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_salones", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_actualizar_ciclo", procedureName = "f_actualizar_ciclo", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_ciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idaula", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idturno", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idnumeracion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero_aula", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idasignacionaula", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsalon", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_eliminar_ciclo", procedureName = "f_eliminar_ciclo", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idasignacionaula", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})
public class Ciclo {

	@Id
	@Column(name = "idciclo")
	private int idciclo;

	@ManyToOne
	@JoinColumn(name = "iduniversidad")
	private Universidad iduniversidad;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "precio")
	private double precio;

	@Column(name = "fecha_creacion")
	private Date fecha_creacion;

	@Column(name = "visible_landing")
	private int visible_landing;

	public Ciclo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciclo(int idciclo, Universidad iduniversidad, String descripcion, double precio, Date fecha_creacion,
			int visible_landing) {
		super();
		this.idciclo = idciclo;
		this.iduniversidad = iduniversidad;
		this.descripcion = descripcion;
		this.precio = precio;
		this.fecha_creacion = fecha_creacion;
		this.visible_landing = visible_landing;
	}

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}

	public Universidad getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(Universidad iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getVisible_landing() {
		return visible_landing;
	}

	public void setVisible_landing(int visible_landing) {
		this.visible_landing = visible_landing;
	}

}
