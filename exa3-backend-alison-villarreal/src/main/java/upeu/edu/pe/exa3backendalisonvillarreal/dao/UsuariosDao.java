package upeu.edu.pe.exa3backendalisonvillarreal.dao;

import java.util.Map;

import upeu.edu.pe.exa3backendalisonvillarreal.entity.Usuarios;

public interface UsuariosDao {
	Usuarios validarUsuario(String nomuser);
	Map<String, Object> datosUsuario(String username);

}
