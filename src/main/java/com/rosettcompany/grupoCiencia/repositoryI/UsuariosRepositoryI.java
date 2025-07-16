package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Usuarios;

@Repository
public interface UsuariosRepositoryI extends CrudRepository<Usuarios, Integer> {

	@Procedure(name = "funcion_inicio_sesion")
	public String InicioSesion(@Param("in_user") String usuario, @Param("in_password") String contrasenia);

	@Procedure(name = "registrar_usuario")
	public String insertarUsuario(@Param("in_nombres") String nombres, @Param("in_apellidos") String apellidos,
			@Param("in_dni") String dni, @Param("in_usuario") String usuario,
			@Param("in_contrasenia") String contrasenia, @Param("in_celular") String celular,
			@Param("in_perfil") String perfil, @Param("in_foto_perfil") String foto_perfil,
			@Param("in_ciclos") String ciclos, @Param("in_idsede") int idsede);

	@Procedure(name = "listar_usuarios")
	public String listarUsuarios(@Param("in_id_usuario") int idusuario);

	@Procedure(name = "buscar_usuarios")
	public String buscarUsuario(@Param("in_condicion") String nombres);

	@Procedure(name = "f_buscar_usuarios_por_dni")
	public String f_buscar_usuarios_por_dni(@Param("in_dni") String dni);

	@Procedure(name = "editar_usuario")
	public String editarUsuario(@Param("in_id_usuario") int idusuario, @Param("in_nombres") String nombres,
			@Param("in_apellidos") String apellidos, @Param("in_dni") String dni, @Param("in_celular") String celular,
			@Param("in_perfil") String perfil, @Param("in_foto_perfil") String foto_perfil,
			@Param("in_idsede") int idsede, @Param("in_ciclos") String ciclos);

	@Procedure(name = "validar_dni_unico_usuario")
	public String validarDniUsuario(@Param("in_id_usuario") int idusuario, @Param("in_dni") String dni);

	@Procedure(name = "cambiar_contrasenia")
	public String cambiarPass(@Param("in_id_usuario") int idusuario, @Param("in_pass") String contrasenia);

	@Procedure(name = "listar_usuario_preguntas")
	public String listarUsuariosPreguntas(@Param("in_idusuario") int idusuario);
	
	@Procedure(name = "f_listar_usuario_docente")
	public String f_listar_usuario_docente();
	
	@Procedure(name = "f_eliminar_usuario")
	public String eliminarUsuario(@Param("in_id_usuario") int idusuario);

	@Procedure(name = "f_listar_perfiles")
	public String f_listar_perfiles();
	
	@Procedure(name = "f_listar_asignacion_aulas_idusuario")
	public String f_listar_asignacion_aulas_idusuario(@Param("in_idusuario") int idusuario);

}
