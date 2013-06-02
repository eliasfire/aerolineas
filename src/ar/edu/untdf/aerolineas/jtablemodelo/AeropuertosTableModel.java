/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.jtablemodelo;

import ar.edu.untdf.aerolineas.AerolineasApp;
import ar.edu.untdf.aerolineas.controller.AeropuertoJpaController;
import ar.edu.untdf.aerolineas.modelo.Aeropuerto;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Abraham
 */
public class AeropuertosTableModel extends AbstractTableModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AeropuertoJpaController aeropuertoC;
	Object[] aeropuertos;
    public AeropuertosTableModel(){ 
        super();
       aeropuertoC=AerolineasApp.getAeropuertoC();
        this.aeropuertos= aeropuertoC.findAeropuertoEntities().toArray();
    }
    @Override
  public int getRowCount(){
      return aeropuertoC.getAeropuertoCount();
  };
  
    @Override
  public int getColumnCount(){
  return 4;
  };
    @Override
  public Object getValueAt(int row, int column){
    switch(column){
        case 0:return ((Aeropuerto) aeropuertos[row]).getIdAeropuerto();
        case 1:return ((Aeropuerto) aeropuertos[row]).getCodigo();
        case 2:return ((Aeropuerto) aeropuertos[row]).getCuidad();
        case 3:return ((Aeropuerto) aeropuertos[row]).getPais();
        default:return null;
    }};
  public   String getColumnName(int columnIndex) {
    switch(columnIndex){
        case 0:return "id";
        case 1:return "codigo";
        case 2:return "cuidad";
        case 3:return "pais";
        default:return null;
    }}     

}
