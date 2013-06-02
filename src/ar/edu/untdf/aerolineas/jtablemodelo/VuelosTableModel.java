/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.jtablemodelo;

import ar.edu.untdf.aerolineas.AerolineasApp;
import ar.edu.untdf.aerolineas.controller.VueloJpaController;
import ar.edu.untdf.aerolineas.modelo.Vuelo;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matias
 */
public class VuelosTableModel extends AbstractTableModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	VueloJpaController vueloC;
    Object[] Vuelos;
    public VuelosTableModel(){ 
        super();
       vueloC=AerolineasApp.getVueloC();
        this.Vuelos= vueloC.findVueloEntities().toArray();
    }
    @Override
  public int getRowCount(){
      return vueloC.getVueloCount();
  };
  
    @Override
  public int getColumnCount(){
  return 4;
  };
    @Override
  public Object getValueAt(int row, int column){
    switch(column){
        case 0:return ((Vuelo)Vuelos[row]).getIdVuelo();
        case 1:return ((Vuelo)Vuelos[row]).getPrecio();
        case 2:return ((Vuelo)Vuelos[row]).getAeropuerto1().getCodigo();
        case 3:return ((Vuelo)Vuelos[row]).getAeropuerto2().getCodigo();

        default:return null;
    }};
  public   String getColumnName(int columnIndex) {
    switch(columnIndex){
        case 0:return "id";
        case 1:return "precio";
        case 2:return "origen";
        case 3:return "destino";

        default:return null;
    }}     

}
