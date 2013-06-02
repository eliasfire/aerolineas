/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.jtablemodelo;

import ar.edu.untdf.aerolineas.views.Aeropuertos;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Matias
 */
    public class AeropuertosTableListener implements ListSelectionListener {
    Aeropuertos form;
    int rowSelected=0;

    // It is necessary to keep the table since it is not possible
    // to determine the table from the event's source
    public AeropuertosTableListener(Aeropuertos form) {
        this.form = form;
    }
    public void valueChanged(ListSelectionEvent e) {
        
        
        // If cell selection is enabled, both row and column change events are fired
        if ( this.rowSelected!=form.getTableAeropuertos().getSelectedRow() && form.getTableAeropuertos().getSelectedRow()>0)
        { 
            System.out.println(form.getTableAeropuertos().getSelectedRow());
          this.rowSelected=form.getTableAeropuertos().getSelectedRow();
        }
 
        if (e.getValueIsAdjusting()) {
            // The mouse button has not yet been released
        }
    }
}

