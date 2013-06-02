/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.jtablemodelo;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import ar.edu.untdf.aerolineas.controller.AeropuertoJpaController;
import ar.edu.untdf.aerolineas.modelo.Aeropuerto;

/**
 *
 * @author Martin
 */
public class AeropuertoComboBoxModel extends DefaultComboBoxModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AeropuertoComboBoxModel(AeropuertoJpaController ex){
     List<Aeropuerto> a=ex.findAeropuertoEntities();
     for(Aeropuerto m:a)this.addElement(m);
    };
   
   
}
