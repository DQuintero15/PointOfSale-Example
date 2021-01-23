/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.storehouse.frames;

import es.storehouse.models.Product;
import es.storehouse.models.StoreException;
import es.storehouse.mysql.MySQLProductDAO;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dquintero
 */
public final class Sales extends javax.swing.JInternalFrame {

    /**
     * Creates new form Sales
     */
    public Sales() {
        initComponents();

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
        productTable = new RSMaterialComponent.RSTableMetroCustom(){
            public boolean isCellEditable(int row, int column){
                return false;
            }

        };
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesTable = new RSMaterialComponent.RSTableMetroCustom(){
            public boolean isCellEditable(int row, int column){
                return false;
            }

        };
        txt_searchProduct = new RSMaterialComponent.RSTextFieldMaterial();
        btn_searchProduct = new RSMaterialComponent.RSButtonIconTwo();
        bll_totalPrice = new javax.swing.JLabel();
        pnl_totalPrice = new javax.swing.JPanel();
        txt_totalPrice = new javax.swing.JLabel();
        txt_productName = new necesario.TextField();
        txt_productId = new necesario.TextField();
        txt_productStock = new necesario.TextField();
        txt_sellPrice = new necesario.TextField();
        txt_provider = new necesario.TextField();
        btn_addProduct = new newscomponents.RSButtonBigIcon_new();
        btn_deleteProduct = new newscomponents.RSButtonBigIcon_new();
        btn_cancelSale = new newscomponents.RSButtonBigIcon_new();
        dateChooser = new newscomponents.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_productSaleAmount = new necesario.TextField();
        rSButtonIcon_new1 = new newscomponents.RSButtonIcon_new();

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Cantidad", "Precio de Compra", "Precio de Venta", "Proveedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productTable.setBackgoundHead(new java.awt.Color(32, 51, 46));
        productTable.setBackgoundHover(new java.awt.Color(32, 51, 46));
        productTable.setColorPrimaryText(new java.awt.Color(32, 51, 46));
        productTable.setColorSecundaryText(new java.awt.Color(32, 51, 46));
        productTable.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        productTable.setFontHead(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productTable.setFontRowHover(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        productTable.setFontRowSelect(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        productTable.setSelectionBackground(new java.awt.Color(108, 140, 110));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        setClosable(true);
        setTitle("Ventas");

        jPanel1.setBackground(new java.awt.Color(108, 140, 110));

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Cantidad", "Precio de Venta", "Proveedor", "Total", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        salesTable.setBackgoundHead(new java.awt.Color(32, 51, 46));
        salesTable.setBackgoundHover(new java.awt.Color(32, 51, 46));
        salesTable.setColorPrimaryText(new java.awt.Color(32, 51, 46));
        salesTable.setColorSecundaryText(new java.awt.Color(32, 51, 46));
        salesTable.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        salesTable.setFontHead(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        salesTable.setFontRowHover(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        salesTable.setFontRowSelect(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        salesTable.setSelectionBackground(new java.awt.Color(108, 140, 110));
        salesTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                salesTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(salesTable);

        txt_searchProduct.setForeground(new java.awt.Color(108, 140, 110));
        txt_searchProduct.setText("Nombre de Producto....");
        txt_searchProduct.setToolTipText("Presiona ENTER para buscar");
        txt_searchProduct.setColorMaterial(new java.awt.Color(108, 140, 110));
        txt_searchProduct.setPhColor(new java.awt.Color(108, 140, 110));
        txt_searchProduct.setPlaceholder("Nombre de Producto...");
        txt_searchProduct.setSelectionColor(new java.awt.Color(108, 140, 110));
        txt_searchProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_searchProductMouseClicked(evt);
            }
        });
        txt_searchProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchProductKeyReleased(evt);
            }
        });

        btn_searchProduct.setBackground(new java.awt.Color(32, 51, 46));
        btn_searchProduct.setBackgroundHover(new java.awt.Color(32, 51, 46));
        btn_searchProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_searchProduct.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btn_searchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchProductActionPerformed(evt);
            }
        });

        bll_totalPrice.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        bll_totalPrice.setForeground(new java.awt.Color(108, 140, 110));
        bll_totalPrice.setText("Total a Pagar:");

        pnl_totalPrice.setBackground(new java.awt.Color(0, 0, 0));

        txt_totalPrice.setFont(new java.awt.Font("Roboto", 1, 40)); // NOI18N
        txt_totalPrice.setForeground(new java.awt.Color(0, 153, 0));
        txt_totalPrice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txt_totalPrice.setText("0");

        javax.swing.GroupLayout pnl_totalPriceLayout = new javax.swing.GroupLayout(pnl_totalPrice);
        pnl_totalPrice.setLayout(pnl_totalPriceLayout);
        pnl_totalPriceLayout.setHorizontalGroup(
            pnl_totalPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_totalPriceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_totalPriceLayout.setVerticalGroup(
            pnl_totalPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_totalPriceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_productName.setEditable(false);
        txt_productName.setForeground(new java.awt.Color(32, 51, 46));
        txt_productName.setText("Producto...");
        txt_productName.setToolTipText("");
        txt_productName.setEnabled(false);
        txt_productName.setSelectionColor(new java.awt.Color(32, 51, 46));

        txt_productId.setEditable(false);
        txt_productId.setForeground(new java.awt.Color(32, 51, 46));
        txt_productId.setText("ID...");
        txt_productId.setEnabled(false);
        txt_productId.setSelectionColor(new java.awt.Color(32, 51, 46));

        txt_productStock.setEditable(false);
        txt_productStock.setForeground(new java.awt.Color(32, 51, 46));
        txt_productStock.setText("Stock...");
        txt_productStock.setEnabled(false);
        txt_productStock.setSelectionColor(new java.awt.Color(32, 51, 46));

        txt_sellPrice.setEditable(false);
        txt_sellPrice.setForeground(new java.awt.Color(32, 51, 46));
        txt_sellPrice.setText("Precio de Venta...");
        txt_sellPrice.setEnabled(false);
        txt_sellPrice.setSelectionColor(new java.awt.Color(32, 51, 46));

        txt_provider.setEditable(false);
        txt_provider.setForeground(new java.awt.Color(32, 51, 46));
        txt_provider.setText("Proveedor...");
        txt_provider.setEnabled(false);
        txt_provider.setSelectionColor(new java.awt.Color(32, 51, 46));

        btn_addProduct.setBackground(new java.awt.Color(38, 169, 94));
        btn_addProduct.setText("Añadir Producto");
        btn_addProduct.setBgHover(new java.awt.Color(38, 169, 94));
        btn_addProduct.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        btn_addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProductActionPerformed(evt);
            }
        });

        btn_deleteProduct.setBackground(new java.awt.Color(241, 196, 15));
        btn_deleteProduct.setText("Retirar Producto");
        btn_deleteProduct.setBgHover(new java.awt.Color(241, 196, 15));
        btn_deleteProduct.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.REMOVE_CIRCLE);

        btn_cancelSale.setBackground(new java.awt.Color(168, 1, 1));
        btn_cancelSale.setText("Cancelar Venta");
        btn_cancelSale.setBgHover(new java.awt.Color(168, 1, 1));
        btn_cancelSale.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);

        dateChooser.setBackground(new java.awt.Color(35, 35, 36));
        dateChooser.setBgColor(new java.awt.Color(35, 35, 36));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 35, 36));
        jLabel1.setText("Fecha de Venta:");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 35, 36));
        jLabel2.setText("Cantidad:");

        txt_productSaleAmount.setForeground(new java.awt.Color(32, 51, 46));
        txt_productSaleAmount.setToolTipText("");
        txt_productSaleAmount.setPlaceholder("Digite la cantidad");
        txt_productSaleAmount.setSelectionColor(new java.awt.Color(32, 51, 46));

        rSButtonIcon_new1.setBackground(new java.awt.Color(38, 169, 94));
        rSButtonIcon_new1.setText("Generar Compra");
        rSButtonIcon_new1.setBackgroundHover(new java.awt.Color(38, 169, 94));
        rSButtonIcon_new1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonIcon_new1.setIconTextGap(10);
        rSButtonIcon_new1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD_SHOPPING_CART);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 369, Short.MAX_VALUE)
                        .addComponent(bll_totalPrice)
                        .addGap(51, 51, 51)
                        .addComponent(rSButtonIcon_new1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(pnl_totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_productId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_productName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_provider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_productStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_sellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_productSaleAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btn_addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancelSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_productId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_provider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_productStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_sellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cancelSale, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_productSaleAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_searchProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(btn_searchProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(215, 215, 215)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(pnl_totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bll_totalPrice)
                            .addComponent(rSButtonIcon_new1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_productTableMouseClicked

    private void search() {
        String name = txt_searchProduct.getText().trim();
        if (name.isEmpty()) {
            return;
        }
        try {
            Product p = new MySQLProductDAO().searchProduct(name);

            txt_productName.setText(p.getName());
            txt_productId.setText(String.valueOf(p.getProductId()));
            txt_provider.setText(p.getProvider());
            txt_productStock.setText(String.valueOf(p.getAmount()));
            txt_sellPrice.setText(String.valueOf(p.getSellPrice()));

        } catch (StoreException e) {

        }
        txt_searchProduct.setText("");
    }

    private void txt_searchProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_searchProductMouseClicked
        // TODO add your handling code here:
        txt_searchProduct.setText("");
    }//GEN-LAST:event_txt_searchProductMouseClicked

    private void btn_searchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchProductActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_btn_searchProductActionPerformed

    private void txt_searchProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchProductKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            search();
        }
    }//GEN-LAST:event_txt_searchProductKeyReleased

    private void btn_addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProductActionPerformed
        // TODO add your handling code here:

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        int stock = Integer.parseInt(txt_productSaleAmount.getText());
        Double sellPrice = Double.parseDouble(txt_sellPrice.getText());
        Object[] data = new Object[7];
        data[0] = txt_productId.getText();
        data[1] = txt_productName.getText();
        data[2] = txt_productSaleAmount.getText();
        data[3] = txt_sellPrice.getText();
        data[4] = txt_provider.getText();
        data[5] = (stock) * (sellPrice);
        data[6] = dateFormat.format(dateChooser.getDate());

        model.addRow(data);

        Double totalPrice = 0.0;
        Double columnValue = 0.0;

        if (salesTable.getRowCount() > 0) {
            for (int i = 0; i < salesTable.getRowCount(); i++) {
                columnValue = Double.parseDouble(salesTable.getValueAt(i, 5).toString());
                totalPrice += columnValue;

            }

        }
        txt_totalPrice.setText(String.valueOf(totalPrice));
    }//GEN-LAST:event_btn_addProductActionPerformed

    private void salesTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salesTableKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();
        int[] rows = salesTable.getSelectedRows();
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (salesTable.getSelectedRow() >= 0) {
                for (int i = 0; i < rows.length; i++) {
                    model.removeRow(rows[i]);
                }
            }

        }
    }//GEN-LAST:event_salesTableKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bll_totalPrice;
    private newscomponents.RSButtonBigIcon_new btn_addProduct;
    private newscomponents.RSButtonBigIcon_new btn_cancelSale;
    private newscomponents.RSButtonBigIcon_new btn_deleteProduct;
    private RSMaterialComponent.RSButtonIconTwo btn_searchProduct;
    private newscomponents.RSDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnl_totalPrice;
    private RSMaterialComponent.RSTableMetroCustom productTable;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new1;
    private RSMaterialComponent.RSTableMetroCustom salesTable;
    private necesario.TextField txt_productId;
    private necesario.TextField txt_productName;
    private necesario.TextField txt_productSaleAmount;
    private necesario.TextField txt_productStock;
    private necesario.TextField txt_provider;
    private RSMaterialComponent.RSTextFieldMaterial txt_searchProduct;
    private necesario.TextField txt_sellPrice;
    private javax.swing.JLabel txt_totalPrice;
    // End of variables declaration//GEN-END:variables
}