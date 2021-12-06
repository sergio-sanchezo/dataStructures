/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.DefaultListModel;

/**
 *
 * @author Hp
 */
public class InterfazUsuario extends javax.swing.JFrame {

    linkedList listComponentes = new linkedList();
    linkedList listTarjetaMadre = new linkedList();
    linkedList listCPU = new linkedList();
    linkedList listComponentesUsuario = new linkedList();
    public InterfazUsuario() {
        initComponents();
    }
    public InterfazUsuario(linkedList _listTM,linkedList _listCPU) {
        initComponents();
        this.listTarjetaMadre = _listTM;
        this.listCPU = _listCPU;
    }
    public void actualizarLista(linkedList list){
        this.listComponentes = list;
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 1; i < listComponentes.sizeLinkedList()+1; i++) {
            modelo.addElement(listComponentes.getOne(i).toString());
        }
        listaComponentesDis.setModel(modelo);
    }
    public void actualizarListaUsuario(linkedList list){
        this.listComponentesUsuario = list;
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 1; i < listComponentesUsuario.sizeLinkedList()+1; i++) {
            modelo.addElement(listComponentesUsuario.getOne(i).toString());
        }
        listaUsuario.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSeleComponentes = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaUsuario = new javax.swing.JList<>();
        listarComponentes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaComponentesDis = new javax.swing.JList<>();
        botonSeleccionar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText(">>>");

        jLabel1.setText("Listar:");

        jLabel3.setText("<<<");

        listSeleComponentes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Tarjeta Madre", "Graficadora", "CPU" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listSeleComponentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSeleComponentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(listSeleComponentes);

        listaUsuario.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaUsuario);

        listarComponentes.setText("Listar");
        listarComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarComponentesActionPerformed(evt);
            }
        });

        jLabel4.setText("Mis componentes:");

        listaComponentesDis.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaComponentesDis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaComponentesDis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaComponentesDisMouseClicked(evt);
            }
        });
        listaComponentesDis.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaComponentesDisValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaComponentesDis);

        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonSeleccionar)
                                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listarComponentes)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(201, 201, 201))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(listarComponentes)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(34, 34, 34)
                            .addComponent(jLabel4))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(botonSeleccionar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar)
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarComponentesActionPerformed
        String seleccion = listSeleComponentes.getSelectedValue();
        if(seleccion == "Tarjeta Madre"){
            actualizarLista(this.listTarjetaMadre);
        }
        if(seleccion == "CPU"){
            actualizarLista(this.listCPU);
        }
        if(seleccion == "Graficadora"){
        
        }
    }//GEN-LAST:event_listarComponentesActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int seleccion = listaUsuario.getSelectedIndex();
        seleccion = seleccion+1;
        listComponentesUsuario.popByIndex(seleccion);
        actualizarListaUsuario(listComponentesUsuario);
        listComponentesUsuario.printRecursive();
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        int seleccion = listaComponentesDis.getSelectedIndex();
        seleccion = seleccion+1;
        listComponentesUsuario.pushBack(listComponentes.getOne(seleccion));
        actualizarListaUsuario(listComponentesUsuario);
        listComponentesUsuario.printRecursive();
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void listaComponentesDisValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaComponentesDisValueChanged
        
    }//GEN-LAST:event_listaComponentesDisValueChanged

    private void listaComponentesDisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaComponentesDisMouseClicked
        
    }//GEN-LAST:event_listaComponentesDisMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listSeleComponentes;
    private javax.swing.JList<String> listaComponentesDis;
    private javax.swing.JList<String> listaUsuario;
    private javax.swing.JButton listarComponentes;
    // End of variables declaration//GEN-END:variables
}
