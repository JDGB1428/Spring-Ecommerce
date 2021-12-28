package com.juan.marketplaces.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import java.util.Date;

@Table(name = "orden")
@Entity
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numero;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date fCreacion;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date fRecibida;
	
	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalleorden;
	
	
	public Orden() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Orden(Long id, String numero, Date fCreacion, Date fRecibida, double total, Usuario usuario) {
		super();
		this.id = id;
		this.numero = numero;
		this.fCreacion = fCreacion;
		this.fRecibida = fRecibida;
		this.total = total;
		this.usuario = usuario;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getfCreacion() {
		return fCreacion;
	}

	public void setfCreacion(Date fCreacion) {
		this.fCreacion = fCreacion;
	}

	public Date getfRecibida() {
		return fRecibida;
	}

	public void setfRecibida(Date fRecibida) {
		this.fRecibida = fRecibida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public DetalleOrden getDetalleorden() {
		return detalleorden;
	}

	public void setDetalleorden(DetalleOrden detalleorden) {
		this.detalleorden = detalleorden;
	}


	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fCreacion=" + fCreacion + ", fRecibida=" + fRecibida
				+ ", total=" + total + ", usuario=" + usuario + ", detalleorden=" + detalleorden + "]";
	}

	
	
	
}
