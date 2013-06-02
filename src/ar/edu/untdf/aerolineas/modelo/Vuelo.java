package ar.edu.untdf.aerolineas.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the vuelo database table.
 * 
 */
@Entity
public class Vuelo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_vuelo")
	private int idVuelo;

	private double precio;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="vuelo", fetch=FetchType.EAGER)
	private List<Ticket> tickets;

	//bi-directional many-to-one association to Aeropuerto
	@ManyToOne
	@JoinColumn(name="aeropuerto_id_origen")
	private Aeropuerto aeropuerto1;

	//bi-directional many-to-one association to Aeropuerto
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="aeropuerto_id_destino")
	private Aeropuerto aeropuerto2;

	public Vuelo() {
	}

	public int getIdVuelo() {
		return this.idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setVuelo(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setVuelo(null);

		return ticket;
	}

	public Aeropuerto getAeropuerto1() {
		return this.aeropuerto1;
	}

	public void setAeropuerto1(Aeropuerto aeropuerto1) {
		this.aeropuerto1 = aeropuerto1;
	}

	public Aeropuerto getAeropuerto2() {
		return this.aeropuerto2;
	}

	public void setAeropuerto2(Aeropuerto aeropuerto2) {
		this.aeropuerto2 = aeropuerto2;
	}

	 public String toString(){
	        return this.getAeropuerto1().getCuidad() + " a " + this.getAeropuerto2().getCuidad();
	        }
}