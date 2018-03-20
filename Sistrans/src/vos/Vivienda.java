package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Vivienda {

	@JsonProperty(value="descripcion")
	private String descripcion;
	
	@JsonProperty(value="ubicacion")
	private String ubicacion;
	
	@JsonProperty(value="menaje")
	private String menaje;
	
	@JsonProperty(value="numeroHabitaciones")
	private Long numeroHabitaciones;
	
	@JsonProperty(value="idPersonaNatural")
	private Long idPersonaNatural;
	
	@JsonProperty(value="precio")
	private Long precio;

	public Vivienda(@JsonProperty(value="descripcion")
	 String descripcion, @JsonProperty(value="ubicacion")
	 String ubicacion, @JsonProperty(value="menaje")
	 String menaje, @JsonProperty(value="numeroHabitaciones")
	 Long numeroHabitaciones, @JsonProperty(value="idPersonaNatural")
	 Long idPersonaNatural, @JsonProperty(value="precio")
	 Long precio)
	{
		this.descripcion = descripcion;
		this.ubicacion= ubicacion;
		this.menaje= menaje;
		this.numeroHabitaciones = numeroHabitaciones;
		this.idPersonaNatural = idPersonaNatural;
		this.precio = precio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getMenaje() {
		return menaje;
	}

	public void setMenaje(String menaje) {
		this.menaje = menaje;
	}

	public Long getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(Long numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public Long getIdPersonaNatural() {
		return idPersonaNatural;
	}

	public void setIdPersonaNatural(Long idPersonaNatural) {
		this.idPersonaNatural = idPersonaNatural;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	
	
	
}
