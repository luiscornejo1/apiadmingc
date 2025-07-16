package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;
import java.sql.Time;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Historial;

@Repository
public interface HistorialRepositoryI extends CrudRepository<Historial, Integer>{

	@Procedure(name="listar_historial")
	public String listarHistorialPorUsuario(
			@Param("in_id_usuario") int idusuario
			);
	
	@Procedure(name="f_insertar_historial_seguimiento")
	public String insertarHistorial(
			@Param("in_id_usuario") int idusuario,
			@Param("in_fecha") Date fecha ,
			@Param("in_hora") Time hora,
			@Param("in_actividad") String actividad
			);
}
