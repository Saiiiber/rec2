/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author u10549640177
 */
public class JFrmPrincipal extends javax.swing.JFrame {

  

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setTitle("Sistema Vendas");
        setExtendedState(MAXIMIZED_BOTH);
         JFrmLogin1 JFrmLogin = new JFrmLogin1();
            JFrmLogin.dispose();
       
        
    }

  

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMmuSair = new javax.swing.JMenu();
        jMmuUsuarios = new javax.swing.JMenuItem();
        jMmuEntrega = new javax.swing.JMenuItem();
        jMmuVendedor = new javax.swing.JMenuItem();
        jMmuProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMmuSairr = new javax.swing.JMenuItem();
        jMmuCompras_Vendas = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToolBar1.setRollover(true);

        jButton1.setText("Entrar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setText("Visitar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setText("Sobre");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jMmuSair.setMnemonic('C');
        jMmuSair.setText("Cadastros");
        jMmuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuSairActionPerformed(evt);
            }
        });

        jMmuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMmuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMmuUsuarios.setMnemonic('u');
        jMmuUsuarios.setText("Usuarios");
        jMmuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuUsuariosActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuUsuarios);

        jMmuEntrega.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMmuEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sucesso-do-carrinho-de-compras-30.png"))); // NOI18N
        jMmuEntrega.setMnemonic('c');
        jMmuEntrega.setText("Entrega");
        jMmuEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuEntregaActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuEntrega);

        jMmuVendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMmuVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-grupo-de-usuário-mulher-mulher-30.png"))); // NOI18N
        jMmuVendedor.setMnemonic('f');
        jMmuVendedor.setText("Vendedor");
        jMmuVendedor.setMaximumSize(new java.awt.Dimension(32667, 32767));
        jMmuVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuVendedorActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuVendedor);

        jMmuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMmuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto.png"))); // NOI18N
        jMmuProduto.setMnemonic('p');
        jMmuProduto.setText("Produto");
        jMmuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuProdutoActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuProduto);
        jMmuSair.add(jSeparator1);

        jMmuSairr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMmuSairr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMmuSairr.setMnemonic('s');
        jMmuSairr.setText("Sair");
        jMmuSairr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuSairrActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuSairr);

        jMenuBar1.add(jMmuSair);

        jMmuCompras_Vendas.setMnemonic('m');
        jMmuCompras_Vendas.setText("Movimentos");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-mega-sales-30.png"))); // NOI18N
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMmuCompras_Vendas.add(jMnuVendas);

        jMenuBar1.add(jMmuCompras_Vendas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 452, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMmuSairrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuSairrActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMmuSairrActionPerformed

    private void jMmuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuSairActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMmuSairActionPerformed

    private void jMmuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuUsuariosActionPerformed
        // TODO add your handling code here:
         JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(this, true);
                jDlgUsuarios.setVisible(true);
                
    }//GEN-LAST:event_jMmuUsuariosActionPerformed

    private void jMmuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuProdutoActionPerformed

JDlgProdutoNovo JDlgProduto = new JDlgProdutoNovo(this, true);
                JDlgProduto.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMmuProdutoActionPerformed

    private void jMmuVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuVendedorActionPerformed
      JDlgVendedorNovo JDlgVendedor = new JDlgVendedorNovo(this, true);
                JDlgVendedor.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jMmuVendedorActionPerformed

    private void jMmuEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuEntregaActionPerformed
        // TODO add your handling code here:
        JDlgEntrega JDlgEntrega = new JDlgEntrega(this, true);
                JDlgEntrega.setVisible(true);
    }//GEN-LAST:event_jMmuEntregaActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMnuVendasActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 JFrmLogin1 JFrmLogin = new JFrmLogin1();
            JFrmLogin.setVisible(true) ;
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMmuCompras_Vendas;
    private javax.swing.JMenuItem jMmuEntrega;
    private javax.swing.JMenuItem jMmuProduto;
    private javax.swing.JMenu jMmuSair;
    private javax.swing.JMenuItem jMmuSairr;
    private javax.swing.JMenuItem jMmuUsuarios;
    private javax.swing.JMenuItem jMmuVendedor;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
