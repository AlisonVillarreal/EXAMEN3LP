package upeu.edu.pe.exa3backendalisonvillarreal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import upeu.edu.pe.exa3backendalisonvillarreal.dao.RolesDao;
import upeu.edu.pe.exa3backendalisonvillarreal.dao.UsuariosDao;
import upeu.edu.pe.exa3backendalisonvillarreal.entity.Usuarios;

@Service("userService")
public class UsuarioService implements UserDetailsService{
	Gson g = new Gson();
	   @Autowired
		private UsuariosDao usuariosDao;
	   @Autowired
		private RolesDao rolesDao;
	   
		@Override
		@Transactional(readOnly = true)
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
			Usuarios usuarios = usuariosDao.validarUsuario(username);
			System.out.println(g.toJson(usuarios.getUsername()));
			//System.out.println(g.toJson(rolDao.buscarRolUser(usuario.getIdusuario())));
			UserDetails details = new User(usuarios.getUsername(),usuarios.getPassword(),rolesDao.buscarRolUser(usuarios.getIdusuario()));
			//System.out.println("hola: "+g.toJson(details));
			return details;
		}
}
