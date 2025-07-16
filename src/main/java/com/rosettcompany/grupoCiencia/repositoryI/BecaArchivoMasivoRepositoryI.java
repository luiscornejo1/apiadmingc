package com.rosettcompany.grupoCiencia.repositoryI;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Ciclo;
import com.rosettcompany.grupoCiencia.repository.BecaArchivoMasivo;

@Repository
public interface BecaArchivoMasivoRepositoryI
		extends CrudRepository<BecaArchivoMasivo, Integer> {
	
	@Procedure(name = "f_insertar_archivo_becas_masivo")
	public String f_insertar_archivo_becas_masivo(
			@Param("in_nombre") String nombre,
			@Param("in_url") String url,
			@Param("in_usuario") Integer usuario_subida);
	
	@Procedure(name = "f_listar_archivo_becas_masivo")
	public String f_listar_archivo_becas_masivo(
			@Param("in_offset") int offset,
			@Param("in_limit") int limit);

}