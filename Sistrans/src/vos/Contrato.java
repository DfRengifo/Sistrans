package vos;

import java.sql.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class Contrato {
	@JsonProperty(value="descripcion")
	private String descripcion;
	
	@JsonProperty(value="fechaInicial")
	private Date fechaInicial;
	
	@JsonProperty(value="fechaFinal")
	private Date fechaFinal;
	
	@JsonProperty(value="idContrato")
	private Long idContrato;
	
	@JsonProperty(value="noches")
	private Long noches;
	
	@JsonProperty(value="costoTotal")
	private Long costoTotal;
	
	@JsonProperty(value="idApartamento")
	private Long idApartamento;
	
	@JsonProperty(value="idHabitacion")
	private Long idHabitacion;

	@JsonProperty(value="idCliente")
	private Long idCliente;
	
	@JsonProperty(value="idOperador")
	private Long idOperador;

	
	
	
	public Contrato(@JsonProperty(value="descripcion")String descripcion,@JsonProperty(value="fechaInicial") Date fechaInicial,@JsonProperty(value="fechaFinal") Date fechaFinal,@JsonProperty(value="idContrato") Long idContrato,@JsonProperty(value="noches") Long noches,
			@JsonProperty(value="costoTotal")Long costoTotal,@JsonProperty(value="idApartamento") Long idApartamento,@JsonProperty(value="idHabitacion") Long idHabitacion, 	@JsonProperty(value="idCliente") Long idCliente,@JsonProperty(value="idOperador") Long idOperador) {
		super();
		this.descripcion = descripcion;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.idContrato = idContrato;
		this.noches = noches;
		this.costoTotal = costoTotal;
		this.idApartamento = idApartamento;
		this.idHabitacion = idHabitacion;
		this.idCliente = idCliente;
		this.idOperador = idOperador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	public Long getNoches() {
		return noches;
	}

	public void setNoches(Long noches) {
		this.noches = noches;
	}

	public Long getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(Long costoTotal) {
		this.costoTotal = costoTotal;
	}

	public Long getIdApartamento() {
		return idApartamento;
	}

	public void setIdApartamento(Long idApartamento) {
		this.idApartamento = idApartamento;
	}

	public Long getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(Long idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(Long idOperador) {
		this.idOperador = idOperador;
	}
	
	
	
	
}
