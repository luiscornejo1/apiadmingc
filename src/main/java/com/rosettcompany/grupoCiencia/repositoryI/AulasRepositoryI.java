package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.AulasEntity;

@Repository
public interface AulasRepositoryI extends CrudRepository<AulasEntity, Integer> {
	@Procedure(name = "f_listar_aulas")
	public String f_listar_aulas();
	
	@Procedure(name = "f_listar_aulas_por_ciclo")
	public String f_listar_aulas_por_ciclo(@Param("in_idusuario") int idusuario);

	@Procedure(name = "f_insertar_aula")
	public String f_insertar_aula(@Param("in_iduniversidad") int iduniversidad, @Param("in_nombre") String nombre,
			@Param("in_areas") String areas);

	@Procedure(name = "f_actualizar_aula")
	public String f_actualizar_aula(@Param("in_idaula") int idaula, @Param("in_nombre") String nombre,
			@Param("in_iduniversidad") int iduniversidad, @Param("in_areas") String areas);

	@Procedure(name = "f_eliminar_aula")
	public String f_eliminar_aula(@Param("in_idaula") int idaula);
}
