package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Cliente extends Usuario{
	
	@JsonProperty(value="nombre")
	private String nombre;
	
	
	public Cliente(@JsonProperty(value="usuario") String usuario,
			@JsonProperty(value="contrasena")String contrasena,@JsonProperty(value="id") Long id,@JsonProperty(value="nombre") String nombre) {
		super(usuario, contrasena, id);
		this.nombre=nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
