package upeu.edu.pe.exa3backendalisonvillarreal.entity;

public class Usuarios {
	private int idusuario;
	private String username;
	private String password;
	private String estado;
	private int idpersona;
	
	public Usuarios() {
		
	}

	public Usuarios(int idusuario, String username, String password, String estado, int idpersona) {
		super();
		this.idusuario = idusuario;
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.idpersona = idpersona;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	
	

}
