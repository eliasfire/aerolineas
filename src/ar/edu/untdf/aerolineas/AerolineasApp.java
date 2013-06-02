/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas;

import ar.edu.untdf.aerolineas.controller.AeropuertoJpaController;
import ar.edu.untdf.aerolineas.controller.ClienteJpaController;
import ar.edu.untdf.aerolineas.controller.TicketJpaController;
import ar.edu.untdf.aerolineas.controller.VueloJpaController;
import ar.edu.untdf.aerolineas.modelo.Cliente;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Matias
 */
public class AerolineasApp {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aerolineas");
    private static ClienteJpaController clienteC=new ClienteJpaController(emf);;
    private static TicketJpaController ticketC=new TicketJpaController(emf);
    private static AeropuertoJpaController aeropuertoC=new AeropuertoJpaController(emf);
    private static VueloJpaController vueloC=new VueloJpaController(emf);


    public static ClienteJpaController getClienteC() {
        return clienteC;
    }

    public static void setClienteC(ClienteJpaController clienteC) {
        AerolineasApp.clienteC = clienteC;
    }

    
    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        AerolineasApp.emf = emf;
    }

   	public static AeropuertoJpaController getAeropuertoC() {
		return aeropuertoC;
	}

	public static void setAeropuertoC(AeropuertoJpaController aeropuertoC) {
		AerolineasApp.aeropuertoC = aeropuertoC;
	}

	public static VueloJpaController getVueloC() {
		return vueloC;
	}

	public static void setVueloC(VueloJpaController vueloC) {
		AerolineasApp.vueloC = vueloC;
	}
	
	 public static void main(String args[]) {
	        //TypedQuery<Cliente> q=ClientesApp.getClienteC().getEntityManager().createQuery("select e from Cliente as e where e.apellido='gel'",Cliente.class);
	        //List<Cliente> l =q.getResultList();
	        //for(Cliente c:l) System.out.println(c.getNombre());
	        Cliente c= AerolineasApp.clienteC.findCliente(new Long(53));
	        System.out.println(c.getName());
	    }

	public static TicketJpaController getTicketC() {
		return ticketC;
	}

	public static void setTicketC(TicketJpaController ticketC) {
		AerolineasApp.ticketC = ticketC;
	}

   
}
