package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Ciclo;

@Repository
public interface CicloRepositoryI extends CrudRepository<Ciclo, Integer> {

	@Procedure(name = "listar_ciclos")
	public String listarCiclos(@Param("in_id_usuario") int idusuario);

	@Procedure(name = "f_listar_ciclos_por_usuario")
	public String f_listar_ciclos_por_usuario(@Param("in_idusuario") int idusuario);

	@Procedure(name = "listar_ciclos_con_banco")
	public String listarCiclosBanco(@Param("in_id_usuario") int idusuario);

	@Procedure(name = "filtrar_estudiantes_ciclo")
	public String filtrarEstudiantesPorCiclo(@Param("in_id_ciclo") int idciclo);

	@Procedure(name = "listar_ciclos_universidad")
	public String listarCiclosPorUniversidad(@Param("in_id_universidad") int iduniversidad);

	@Procedure(name = "f_listar_ciclos_banco_preguntas_universidad")
	public String f_listar_ciclos_banco_preguntas_universidad(@Param("in_id_universidad") int iduniversidad);

	@Procedure(name = "f_listar_ciclos_mantenimiento")
	public String listarCiclosMantenimiento(@Param("in_idusuario") int idusuario,
			@Param("in_condicion") String condicion);

	@Procedure(name = "f_eliminar_ciclo")
	public String eliminarCiclo(@Param("in_idciclo") int idciclo, @Param("in_idasignacionaula") int idasignacionaula);

//	@Procedure(name="f_insertar_ciclos")
//	public String insertarCiclo(
//			@Param("in_iduniversidad") int iduniversidad,
//			@Param("in_nombre_ciclo") String nombre,
//			@Param("in_precio") double precio
//			);

//	@Procedure(name="f_actualizar_ciclo")
//	public String editarCiclo(
//			@Param("in_id_ciclo") int idciclo,
//			@Param("in_nombre_ciclo") String nombre,
//			@Param("in_precio") double precio
//			);

	@Procedure(name = "f_visibilidad_landing_ciclos")
	public String cambiarVisibilidadCiclo(@Param("in_id_ciclo") int idciclo, @Param("in_visible") int visible);

	@Procedure(name = "f_obtener_aulas_por_ciclo")
	public String listarAula(@Param("idciclo_input") int idciclo);

	@Procedure(name = "f_insertar_ciclos")
	public String insertarCiclo(@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclonormalizado") int idciclonormalizado, @Param("in_idaula") int idaula,
			@Param("in_idmodalidad") int idmodalidad, @Param("in_idsede") int idsede, @Param("in_idturno") int idturno,
			@Param("in_idnumeracion") int idnumeracion, @Param("in_numero_aula") int numero_aula,
			@Param("in_precio") double precio, @Param("in_salones") String salones);

	@Procedure(name = "f_actualizar_ciclo")
	public String editarCiclo(@Param("in_id_ciclo") int idciclo, @Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclonormalizado") int idciclonormalizado, @Param("in_idaula") int idaula,
			@Param("in_idmodalidad") int idmodalidad, @Param("in_idsede") int idsede, @Param("in_idturno") int idturno,
			@Param("in_idnumeracion") int idnumeracion, @Param("in_numero_aula") int numero_aula,
			@Param("in_precio") double precio, @Param("in_idasignacionaula") int idasignacionaula,
			@Param("in_idsalon") int idsalon);

}
