package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="examen")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "crear_examen", procedureName = "f_crear_examen", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_examen", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_puede_retroceder", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_encuesta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_salto_pregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipo_examen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		
		@NamedStoredProcedureQuery(name = "crear_examen_normalizado", procedureName = "f_crear_examen_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_examen", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_puede_retroceder", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_encuesta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_salto_pregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipo_examen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	
		@NamedStoredProcedureQuery(name = "verificar_cantidad_preguntas_usuario", procedureName = "f_verificar_cantidad_preguntas_usuario", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
@NamedStoredProcedureQuery(name = "verificar_cantidad_preguntas_usuario_normalizado", procedureName = "f_verificar_cantidad_preguntas_usuario_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "confirmar_examen", procedureName = "f_confirmar_examen", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamenes", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_url_examen_blanco", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_url_examen_respuestas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "url_examen_blanco_resumido", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "url_examen_respuestas_resumido", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "confirmar_examen_normalizado", procedureName = "f_confirmar_examen_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamenes", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_url_examen_blanco", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_url_examen_respuestas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "url_examen_blanco_resumido", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "url_examen_respuestas_resumido", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "listar_examenes", procedureName = "f_listar_examenes", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "listar_examenes_normalizado", procedureName = "f_listar_examenes_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
					
		@NamedStoredProcedureQuery(name = "eliminar_examen", procedureName = "f_eliminar_examen", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "eliminar_examen_normalizado", procedureName = "f_eliminar_examen_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "editar_examen", procedureName = "f_editar_examen", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_examen", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_puede_retroceder", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_encuesta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_salto_pregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "editar_examen_normalizado", procedureName = "f_editar_examen_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_examen", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_puede_retroceder", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_encuesta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_salto_pregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "obtener_preguntas_curso", procedureName = "f_obtener_preguntas_curso", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "obtener_preguntas_curso_normalizado", procedureName = "f_obtener_preguntas_curso_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_reporte_notas_dia", procedureName = "funcion_reporte_notas_dia", parameters = {

                @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_reporte_notas_dia_normalizado", procedureName = "funcion_reporte_notas_dia_normalizado", parameters = {

                @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_detalle_examen", procedureName = "funcion_listar_detalle_examen", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class)}),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_detalle_examen_normalizado", procedureName = "funcion_listar_detalle_examen_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class)}),
		
		@NamedStoredProcedureQuery(name = "f_crear_examen_temas", procedureName = "f_crear_examen_temas", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_examen", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_puede_retroceder", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_encuesta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_salto_pregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipo_examen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_lista_temas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_crear_examen_temas_normalizado", procedureName = "f_crear_examen_temas_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_examen", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_puede_retroceder", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_encuesta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_salto_pregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipo_examen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_lista_temas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_obtener_preguntas_curso_temas", procedureName = "f_obtener_preguntas_curso_temas", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_lista_temas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_obtener_preguntas_curso_temas_normalizado", procedureName = "f_obtener_preguntas_curso_temas_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_lista_temas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_crear_examen_uni", procedureName = "f_crear_examen_uni", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_examen", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_puede_retroceder", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_encuesta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_salto_pregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipo_examen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		@NamedStoredProcedureQuery(name = "f_crear_examen_uni_normalizado", procedureName = "f_crear_examen_uni_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_examen", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_puede_retroceder", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_encuesta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_salto_pregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipo_examen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_obtener_preguntas_curso_uni", procedureName = "f_obtener_preguntas_curso_uni", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_obtener_preguntas_curso_uni_normalizado", procedureName = "f_obtener_preguntas_curso_uni_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})
public class Examen {

	@Id
	@Column(name="idexamen")
	private int idexamen;
	
	@ManyToOne
	@JoinColumn(name="idarea")
	private AreasCarrera idarea;
	
	@ManyToOne
	@JoinColumn(name="idciclo")
	private Ciclo idciclo;
	
	@Column(name="fecha_examen")
	private Date fecha_examen;
	
	@Column(name="fecha_registro")
	private Date fecha_registro;
	
	@Column(name="hora_inicio")
	private Time hora_inicio;
	
	@Column(name="hora_fin")
	private Time hora_fin;
	
	@Column(name="puede_retroceder")
	private int puede_retroceder;
	
	@Column(name="encuesta")
	private int encuesta;
	
	@Column(name="lista_preguntas")
	private String lista_preguntas;
	
	@Column(name="estado")
	private int estado;
	
	@Column(name="url_examen_blanco")
	private String url_examen_blanco;
	
	@Column(name="url_examen_respuestas")
	private String url_examen_respuestas;
	
	@Column(name="url_examen_blanco_resumido")
	private String url_examen_blanco_resumido;
	
	@Column(name="url_examen_respuestas_resumido")
	private String url_examen_respuestas_resumido;
	
	@Column(name="salto_pregunta")
	private int salto_pregunta;
	
	@Column(name="tipo_examen")
	private int tipo_examen;

	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Examen(int idexamen, AreasCarrera idarea, Ciclo idciclo, Date fecha_examen, Date fecha_registro,
			Time hora_inicio, Time hora_fin, int puede_retroceder, int encuesta, String lista_preguntas, int estado,
			String url_examen_blanco, String url_examen_respuestas, String url_examen_blanco_resumido,
			String url_examen_respuestas_resumido, int salto_pregunta, int tipo_examen) {
		super();
		this.idexamen = idexamen;
		this.idarea = idarea;
		this.idciclo = idciclo;
		this.fecha_examen = fecha_examen;
		this.fecha_registro = fecha_registro;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.puede_retroceder = puede_retroceder;
		this.encuesta = encuesta;
		this.lista_preguntas = lista_preguntas;
		this.estado = estado;
		this.url_examen_blanco = url_examen_blanco;
		this.url_examen_respuestas = url_examen_respuestas;
		this.url_examen_blanco_resumido = url_examen_blanco_resumido;
		this.url_examen_respuestas_resumido = url_examen_respuestas_resumido;
		this.salto_pregunta = salto_pregunta;
		this.tipo_examen = tipo_examen;
	}



	public int getIdexamen() {
		return idexamen;
	}

	public void setIdexamen(int idexamen) {
		this.idexamen = idexamen;
	}

	public AreasCarrera getIdarea() {
		return idarea;
	}

	public void setIdarea(AreasCarrera idarea) {
		this.idarea = idarea;
	}

	public Ciclo getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(Ciclo idciclo) {
		this.idciclo = idciclo;
	}

	public Date getFecha_examen() {
		return fecha_examen;
	}

	public void setFecha_examen(Date fecha_examen) {
		this.fecha_examen = fecha_examen;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Time getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(Time hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public Time getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(Time hora_fin) {
		this.hora_fin = hora_fin;
	}

	public int getPuede_retroceder() {
		return puede_retroceder;
	}

	public void setPuede_retroceder(int puede_retroceder) {
		this.puede_retroceder = puede_retroceder;
	}

	public int getEncuesta() {
		return encuesta;
	}

	public void setEncuesta(int encuesta) {
		this.encuesta = encuesta;
	}

	public String getLista_preguntas() {
		return lista_preguntas;
	}

	public void setLista_preguntas(String lista_preguntas) {
		this.lista_preguntas = lista_preguntas;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getUrl_examen_blanco() {
		return url_examen_blanco;
	}

	public void setUrl_examen_blanco(String url_examen_blanco) {
		this.url_examen_blanco = url_examen_blanco;
	}

	public String getUrl_examen_respuestas() {
		return url_examen_respuestas;
	}

	public void setUrl_examen_respuestas(String url_examen_respuestas) {
		this.url_examen_respuestas = url_examen_respuestas;
	}

	public int getSalto_pregunta() {
		return salto_pregunta;
	}

	public void setSalto_pregunta(int salto_pregunta) {
		this.salto_pregunta = salto_pregunta;
	}

	public int getTipo_examen() {
		return tipo_examen;
	}

	public void setTipo_examen(int tipo_examen) {
		this.tipo_examen = tipo_examen;
	}

	public String getUrl_examen_blanco_resumido() {
		return url_examen_blanco_resumido;
	}

	public void setUrl_examen_blanco_resumido(String url_examen_blanco_resumido) {
		this.url_examen_blanco_resumido = url_examen_blanco_resumido;
	}

	public String getUrl_examen_respuestas_resumido() {
		return url_examen_respuestas_resumido;
	}

	public void setUrl_examen_respuestas_resumido(String url_examen_respuestas_resumido) {
		this.url_examen_respuestas_resumido = url_examen_respuestas_resumido;
	}

	
	
}
