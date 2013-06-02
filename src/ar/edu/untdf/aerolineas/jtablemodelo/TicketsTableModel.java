/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.jtablemodelo;

import ar.edu.untdf.aerolineas.AerolineasApp;
import ar.edu.untdf.aerolineas.controller.TicketJpaController;
import ar.edu.untdf.aerolineas.modelo.Ticket;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matias
 */
public class TicketsTableModel extends AbstractTableModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TicketJpaController ticketC;
    Object[] Tickets;
    public TicketsTableModel(){ 
        super();
       ticketC=AerolineasApp.getTicketC();
        this.Tickets= ticketC.findTicketEntities().toArray();
    }
    @Override
  public int getRowCount(){
      return ticketC.getTicketCount();
  };
  
    @Override
  public int getColumnCount(){
  return 5;
  };
    @Override
  public Object getValueAt(int row, int column){
    switch(column){
        case 0:return ((Ticket)Tickets[row]).getIdTicket();
        case 1:return ((Ticket)Tickets[row]).getCliente().getName();
        case 2:return ((Ticket)Tickets[row]).getVuelo().getAeropuerto1().getCuidad();
        case 3:return ((Ticket)Tickets[row]).getVuelo().getAeropuerto2().getCuidad();
        case 4:return ((Ticket)Tickets[row]).getVuelo().getPrecio();

        default:return null;
    }};
  public   String getColumnName(int columnIndex) {
    switch(columnIndex){
        case 0:return "id";
        case 1:return "cliente";
        case 2:return "desde";
        case 3:return "hasta";
        case 4:return "precio";

        default:return null;
    }}     

}
