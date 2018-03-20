package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class ServicioHotel {

	@JsonProperty(value="descripcion")
	private String descripcion;
	
	@JsonProperty(value="idServicioHotel")
	private Long idServicioHotel;
	
	@JsonProperty(value="idHotel")
	private Long idHotel;
	
	@JsonProperty(value="tipo")
	private String tipo;
	
	public ServicioHotel(@JsonProperty(value="tipo")String tipo,
			@JsonProperty(value="descripcion")String descripcion,
			@JsonProperty(value="idServicioHotel") Long idServicioHotel,@JsonProperty(value="idHotel") Long idHotel) {
		super();
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.idServicioHotel = idServicioHotel;
		this.idHotel = idHotel;
	}

	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdServicioHotel() {
		return idServicioHotel;
	}

	public void setIdServicioHotel(Long idServicioHotel) {
		this.idServicioHotel = idServicioHotel;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	
	
}
