/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.jtablemodelo;

import ar.edu.untdf.aerolineas.AerolineasApp;
import ar.edu.untdf.aerolineas.controller.ClienteJpaController;
import ar.edu.untdf.aerolineas.modelo.Cliente;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matias
 */
public class ClienteTableModel extends AbstractTableModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ClienteJpaController clienteC;
    Object[] clientes;
    public ClienteTableModel(){ 
        super();
       clienteC=AerolineasApp.getClienteC();
        this.clientes= clienteC.findClienteEntities().toArray();
    }
    @Override
  public int getRowCount(){
      return clienteC.getClienteCount();
  };
  
    @Override
  public int getColumnCount(){
  return 3;
  };
    @Override
  public Object getValueAt(int row, int column){
    switch(column){
        case 0:return ((Cliente)clientes[row]).getIdCliente();
        case 1:return ((Cliente)clientes[row]).getName();
        case 2:return ((Cliente)clientes[row]).getVersion();
        default:return null;
    }};
  public   String getColumnName(int columnIndex) {
    switch(columnIndex){
        case 0:return "id";
        case 1:return "nombre";
        case 2:return "version";
        default:return null;
    }}     

}
