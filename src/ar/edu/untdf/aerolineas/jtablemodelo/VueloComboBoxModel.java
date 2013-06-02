/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.jtablemodelo;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import ar.edu.untdf.aerolineas.controller.AeropuertoJpaController;
import ar.edu.untdf.aerolineas.controller.VueloJpaController;
import ar.edu.untdf.aerolineas.modelo.Aeropuerto;
import ar.edu.untdf.aerolineas.modelo.Vuelo;

/**
 *
 * @author Martin
 */
public class VueloComboBoxModel extends DefaultComboBoxModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VueloComboBoxModel(VueloJpaController ex){
     List<Vuelo> a=ex.findVueloEntities();
     for(Vuelo m:a)this.addElement(m);
    };
   
   
}
