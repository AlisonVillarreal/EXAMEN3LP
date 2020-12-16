package upeu.edu.pe.exa3backendalisonvillarreal.service;

import java.util.Map;

import upeu.edu.pe.exa3backendalisonvillarreal.entity.Usuarios;

public interface UsuarioService {
	Usuarios validarUsuario(String nomuser);
	Map<String, Object> datosUsuario(String username);
}
