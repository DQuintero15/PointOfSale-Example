/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.storehouse.frames;

import es.storehouse.models.StoreException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author dquintero
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Inventory inventoryWindow;
    Providers providersWindow;
    Sales salesWindow;
    Orders ordersWindow;

    public Principal() throws StoreException {

        initComponents();
        init();

    }

    private void init() {
        setResizable(false);
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("contegral.jpg"));
        Image image = icon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){

            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.drawImage(image, 0, 0, this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        menu_Inventory = new javax.swing.JMenu();
        menu_Provider = new javax.swing.JMenu();
        menu_Sales = new javax.swing.JMenu();
        menu_order = new javax.swing.JMenu();
        menu_reports = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTOR DE VENTAS CASA VIEJA (CONTEGRAL)");

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );

        menu_Inventory.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("icons8-open-box-48.png")));
        menu_Inventory.setText("Inventario          ");
        menu_Inventory.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        menu_Inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_InventoryMouseClicked(evt);
            }
        });
        menuBar.add(menu_Inventory);

        menu_Provider.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("icons8-supplier-48.png")));
        menu_Provider.setText("Proveedores          ");
        menu_Provider.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        menu_Provider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_ProviderMouseClicked(evt);
            }
        });
        menuBar.add(menu_Provider);

        menu_Sales.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("icons8-cash-register-48.png")));
        menu_Sales.setText("Ventas          ");
        menu_Sales.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        menu_Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_SalesMouseClicked(evt);
            }
        });
        menuBar.add(menu_Sales);

        menu_order.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("icons8-delivered-48.png")));
        menu_order.setText("Pedidos          ");
        menu_order.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        menu_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_orderMouseClicked(evt);
            }
        });
        menuBar.add(menu_order);

        menu_reports.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("icons8-business-report-48.png")));
        menu_reports.setText("Reportes          ");
        menu_reports.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        menuBar.add(menu_reports);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_InventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_InventoryMouseClicked
        if (inventoryWindow == null || inventoryWindow.isClosed()) {
            try {
                // Instanciacion del inventario
                inventoryWindow = new Inventory();
            } catch (StoreException ex) {
                // Tratar excepcion si no se crea el inventario
                System.exit(3);
            }
            desktopPane.add(inventoryWindow);
            inventoryWindow.setBounds(desktopPane.getX(), desktopPane.getY(), desktopPane.getWidth(), desktopPane.getHeight());
            inventoryWindow.setVisible(true);
        }
    }//GEN-LAST:event_menu_InventoryMouseClicked

    private void menu_ProviderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ProviderMouseClicked
        // TODO add your handling code here:
        if (providersWindow == null || inventoryWindow.isClosed()) {
            // Instanciacion del inventario
            providersWindow = new Providers();
            desktopPane.add(providersWindow);
            providersWindow.setBounds(desktopPane.getX(), desktopPane.getY(), desktopPane.getWidth(), desktopPane.getHeight());
            providersWindow.setVisible(true);
        }
    }//GEN-LAST:event_menu_ProviderMouseClicked

    private void menu_SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_SalesMouseClicked
        // TODO add your handling code here:
        if (salesWindow == null || salesWindow.isClosed()) {
            // Instanciacion del inventario
            salesWindow = new Sales();
            desktopPane.add(salesWindow);
            salesWindow.setBounds(desktopPane.getX(), desktopPane.getY(), desktopPane.getWidth(), desktopPane.getHeight());
            salesWindow.setVisible(true);
        }
    }//GEN-LAST:event_menu_SalesMouseClicked

    private void menu_orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_orderMouseClicked
        // TODO add your handling code here:
        if (ordersWindow == null || ordersWindow.isClosed()) {
            // Instanciacion del inventario
            ordersWindow = new Orders();
            desktopPane.add(ordersWindow);
            ordersWindow.setBounds(desktopPane.getX(), desktopPane.getY(), desktopPane.getWidth(), desktopPane.getHeight());
            ordersWindow.setVisible(true);
        }
    }//GEN-LAST:event_menu_orderMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws StoreException {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (StoreException ex) {
                    try {
                        throw new StoreException(ex);
                    } catch (StoreException ex1) {

                    }
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menu_Inventory;
    private javax.swing.JMenu menu_Provider;
    private javax.swing.JMenu menu_Sales;
    private javax.swing.JMenu menu_order;
    private javax.swing.JMenu menu_reports;
    // End of variables declaration//GEN-END:variables
}
