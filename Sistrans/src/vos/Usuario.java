package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Usuario {

	@JsonProperty(value="usuario")
	private String usuario;
	
	@JsonProperty(value="contrasena")	
	private String contrasena;
	
	@JsonProperty(value="id")
	private Long id;

	
	
	
	public Usuario(@JsonProperty(value="usuario") String usuario, @JsonProperty(value="contrasena")String contrasena,@JsonProperty(value="idUsuario") Long id) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.id = id;
	}

	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
	
}
