package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Recurso;

@Repository
public interface RecursoRepositoryI  extends CrudRepository<Recurso,Integer>{

	
	
	
	@Procedure(name="funcion_registrar_recurso")
	public String RegistrarRecursos(
			@Param("n_idanio") int n_idanio,
			@Param("n_idcurso") int n_idcurso,
			@Param("n_idciclo") int n_idciclo,
			@Param("n_nombre") String n_nombre,
			@Param("n_mes") int n_mes,
			@Param("n_ruta_recurso") String n_ruta_recurso
			);
	@Procedure(name="funcion_listar_recursos_administrador")
	public String ListarRecursosAdministrador(
			@Param("in_idcurso") int n_idcurso,
			@Param("in_idanio") int n_idanio,
			@Param("in_idciclo") int n_idciclo,
			@Param("in_mes") int n_mes
			);
	
	@Procedure(name="funcion_eliminar_recurso")
	public String EliminarRecurso(
			@Param("in_idrecurso") int in_idrecurso
			);
	
	@Procedure(name="f_actualizar_orden_recurso")
    public String ActualizarOrdenRecursos(
            @Param("lista_recursos") String lista_recursos
            );
}
