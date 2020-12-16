package upeu.edu.pe.exa3backendalisonvillarreal.service;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import upeu.edu.pe.exa3backendalisonvillarreal.entity.Personas;

public interface PersonasService {
	int create(Personas p);
	int update(Personas p);
	int update(int id);
	int delete(int id);
	List<Personas> readHola(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();
	List<GrantedAuthority> buscarRolUser(int iduser);
	void convertitMap(Map<String, Object> map);
}