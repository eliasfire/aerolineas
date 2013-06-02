/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.jtablemodelo;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import ar.edu.untdf.aerolineas.views.Tickets;

/**
 *
 * @author Matias
 */
    public class TicketsTableListener implements ListSelectionListener {
    Tickets form;
    int rowSelected=0;

    // It is necessary to keep the table since it is not possible
    // to determine the table from the event's source
    public TicketsTableListener(Tickets form) {
        this.form = form;
    }
    public void valueChanged(ListSelectionEvent e) {
        
        
        // If cell selection is enabled, both row and column change events are fired
        if ( this.rowSelected!=form.getTableTickets().getSelectedRow() && form.getTableTickets().getSelectedRow()>0)
        { 
            System.out.println(form.getTableTickets().getSelectedRow());
          this.rowSelected=form.getTableTickets().getSelectedRow();
        }
 
        if (e.getValueIsAdjusting()) {
            // The mouse button has not yet been released
        }
    }
}

