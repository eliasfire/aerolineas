/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.jtablemodelo;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import ar.edu.untdf.aerolineas.controller.ClienteJpaController;
import ar.edu.untdf.aerolineas.modelo.Cliente;

/**
 *
 * @author Martin
 */
public class ClienteComboBoxModel extends DefaultComboBoxModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClienteComboBoxModel(ClienteJpaController ex){
     List<Cliente> a=ex.findClienteEntities();
     for(Cliente m:a)this.addElement(m);
    };
   
   
}
