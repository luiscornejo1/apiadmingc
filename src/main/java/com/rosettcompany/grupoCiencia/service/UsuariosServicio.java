package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Usuarios;
import com.rosettcompany.grupoCiencia.repositoryI.UsuariosRepositoryI;

@Service
public class UsuariosServicio {
	
	@Autowired
	private UsuariosRepositoryI usuariosRepositoryI;
	
	
	public String InicioSesion(Usuarios usuarios) throws Exception{
		return usuariosRepositoryI.InicioSesion(
				usuarios.getUsuario(),
				usuarios.getContrasenia());
	}
	
	public String insertarUsuario(Usuarios usuarios) {
		return usuariosRepositoryI.insertarUsuario(
				usuarios.getNombres(),
				usuarios.getApellidos(),
				usuarios.getDni(),
				usuarios.getUsuario(),
				usuarios.getContrasenia(),
				usuarios.getCelular(),
				usuarios.getPerfil(),
				usuarios.getFoto_perfil(),
				usuarios.ciclos,
				usuarios.idsede);
	}
	
	public String listarUsuarios(int idusuario) {
		return usuariosRepositoryI.listarUsuarios(idusuario);
	}

	public String buscarUsuario(Usuarios usuarios) {
		return usuariosRepositoryI.buscarUsuario(usuarios.getNombres());
	}
	
	public String f_buscar_usuarios_por_dni(Usuarios usuarios) {
		return usuariosRepositoryI.f_buscar_usuarios_por_dni(usuarios.getDni());
	}
	
	public String editarUsuario(Usuarios usuarios) {
		return usuariosRepositoryI.editarUsuario(
				usuarios.getIdusuario(),
				usuarios.getNombres(),
				usuarios.getApellidos(),
				usuarios.getDni(),
				usuarios.getCelular(),
				usuarios.getPerfil(),
				usuarios.getFoto_perfil(),
				usuarios.idsede,
				usuarios.ciclos);
	}
	
	public String validarDniUsuario(Usuarios usuarios) {
		return usuariosRepositoryI.validarDniUsuario(
				usuarios.getIdusuario(),
				usuarios.getDni());
	}
	
	public String cambiarPass(Usuarios usuarios) {
		return usuariosRepositoryI.cambiarPass(
				usuarios.getIdusuario(),
				usuarios.getContrasenia());
	}
	
	public String listarUsuariosPreguntas(int idusuario) {
		return usuariosRepositoryI.listarUsuariosPreguntas(idusuario);
	}
	
	public String eliminarUsuario(int idusuario) {
		return usuariosRepositoryI.eliminarUsuario(idusuario);
	}
	
	public String f_listar_usuario_docente() {
		return usuariosRepositoryI.f_listar_usuario_docente();
	}
	
	public String f_listar_perfiles() {
		return usuariosRepositoryI.f_listar_perfiles();
	}
	
	public String f_listar_asignacion_aulas_idusuario(int idusuario) {
		return usuariosRepositoryI.f_listar_asignacion_aulas_idusuario(idusuario);
	}
}
