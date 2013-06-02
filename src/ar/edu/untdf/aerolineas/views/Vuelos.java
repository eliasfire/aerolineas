/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.aerolineas.views;

import ar.edu.untdf.aerolineas.AerolineasApp;
import ar.edu.untdf.aerolineas.modelo.Aeropuerto;
import ar.edu.untdf.aerolineas.modelo.Vuelo;
import ar.edu.untdf.aerolineas.controller.AeropuertoJpaController;
import ar.edu.untdf.aerolineas.jtablemodelo.AeropuertoComboBoxModel;
import ar.edu.untdf.aerolineas.jtablemodelo.VuelosTableListener;
import ar.edu.untdf.aerolineas.jtablemodelo.VuelosTableModel;

import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
/**
 *
 * @author Matias
 */
public class Vuelos extends javax.swing.JInternalFrame {

    
    private AeropuertoJpaController ex = new AeropuertoJpaController(Persistence.createEntityManagerFactory("aerolineas"));		
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Vuelos
     */
    public Vuelos() {
		setForeground(Color.GREEN);
		setRootPaneCheckingEnabled(false);
		setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setSize(458,448);
		setTitle("Administracion de Vuelos");
		setClosable(true);
        initComponents();
        VuelosTableListener listener = new VuelosTableListener(this);
        tableVuelos.getSelectionModel().addListSelectionListener(listener);
        
        
    }

    public JButton getAceptar() {
        return aceptar;
    }

    public void setAceptar(JButton aceptar) {
        this.aceptar = aceptar;
    }

    public JButton getCancelar() {
        return cancelar;
    }

    public void setCancelar(JButton cancelar) {
        this.cancelar = cancelar;
    }

    public JTextField getFieldApellido() {
        return fieldPrecio;
    }

    public void setFieldApellido(JTextField fieldApellido) {
        this.fieldPrecio = fieldApellido;
    }


   
    public JTable getTableVuelos() {
        return tableVuelos;
    }

    public void setTableVuelos(JTable tableVuelos) {
        this.tableVuelos = tableVuelos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableVuelos = new javax.swing.JTable();
        fieldPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setText("Precio");
        nuevo = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        comboBoxOrigen = new JComboBox<Aeropuerto>();
        comboBoxDestino = new JComboBox<Aeropuerto>();


        tableVuelos.setModel(new ar.edu.untdf.aerolineas.jtablemodelo.VuelosTableModel());
        tableVuelos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableVuelos.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tableVuelos);

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        aceptar.setText("Guardar");
        aceptar.setEnabled(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.setEnabled(false);
        
        comboBoxOrigen.setModel(new AeropuertoComboBoxModel(ex));
        comboBoxOrigen.setSelectedIndex(1);
        comboBoxDestino.setModel(new AeropuertoComboBoxModel(ex));
        comboBoxDestino.setSelectedIndex(1);

        JLabel lblOrigen = new JLabel("Origen");
        
        JLabel lblDestino = new JLabel("Destino");
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(jLabel1)
        			.addGap(11)
        			.addComponent(fieldPrecio, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(nuevo, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(lblOrigen)
        			.addGap(8)
        			.addComponent(comboBoxOrigen, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(aceptar, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(lblDestino)
        			.addGap(4)
        			.addComponent(comboBoxDestino, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(10)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(30)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(4)
        					.addComponent(jLabel1))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(1)
        					.addComponent(fieldPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(nuevo))
        			.addGap(11)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(4)
        					.addComponent(lblOrigen))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(1)
        					.addComponent(comboBoxOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(aceptar))
        			.addGap(11)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(4)
        					.addComponent(lblDestino))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(1)
        					.addComponent(comboBoxDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(cancelar))
        			.addGap(30)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
    fieldPrecio.setText("");
    aceptar.setEnabled(true);
    cancelar.setEnabled(true);
    
    }//GEN-LAST:event_nuevoActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        Vuelo c=new Vuelo();
        c.setPrecio((int) (Long.parseLong(fieldPrecio.getText())));
        c.setAeropuerto1((Aeropuerto) comboBoxOrigen.getSelectedItem());
        c.setAeropuerto2((Aeropuerto) comboBoxDestino.getSelectedItem());
        AerolineasApp.getVueloC().create(c);
        tableVuelos.setModel(new VuelosTableModel());
        aceptar.setEnabled(false);
        cancelar.setEnabled(false);
        
        
    }//GEN-LAST:event_aceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevo;
    private javax.swing.JTable tableVuelos;
    private javax.swing.JComboBox<Aeropuerto> comboBoxDestino;
    private javax.swing.JComboBox<Aeropuerto> comboBoxOrigen;

}
