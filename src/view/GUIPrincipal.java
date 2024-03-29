/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author cralves
 */
public class GUIPrincipal extends javax.swing.JFrame implements InternalFrameListener {

    private boolean flagGUICadProdutos = false;
    private boolean flagGUIManutencaoProdutos = false;
    private boolean flagGUIManutencaoColaborador = false;
    private boolean flagGUIClientes = false;

    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
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

        jdpAreaDeTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiColaborador = new javax.swing.JMenuItem();
        jmiCliente = new javax.swing.JMenuItem();
        jmiFornecedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiManuProduto = new javax.swing.JMenuItem();
        jmiManuColaborador = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        javax.swing.GroupLayout jdpAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jdpAreaDeTrabalho);
        jdpAreaDeTrabalho.setLayout(jdpAreaDeTrabalhoLayout);
        jdpAreaDeTrabalhoLayout.setHorizontalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1234, Short.MAX_VALUE)
        );
        jdpAreaDeTrabalhoLayout.setVerticalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jmiColaborador.setText("Colaborador");
        jmiColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiColaboradorActionPerformed(evt);
            }
        });
        jmiColaborador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiColaboradorKeyPressed(evt);
            }
        });
        jMenu1.add(jmiColaborador);

        jmiCliente.setText("Clientes");
        jmiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteActionPerformed(evt);
            }
        });
        jmiCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiClienteKeyPressed(evt);
            }
        });
        jMenu1.add(jmiCliente);

        jmiFornecedor.setText("Fornecedor");
        jMenu1.add(jmiFornecedor);
        jMenu1.add(jSeparator1);

        jmiProduto.setText("Produto");
        jmiProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutoActionPerformed(evt);
            }
        });
        jmiProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiProdutoKeyPressed(evt);
            }
        });
        jMenu1.add(jmiProduto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manutenção");

        jmiManuProduto.setText("Produto");
        jmiManuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManuProdutoActionPerformed(evt);
            }
        });
        jmiManuProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiManuProdutoKeyPressed(evt);
            }
        });
        jMenu2.add(jmiManuProduto);

        jmiManuColaborador.setText("Colaborador");
        jmiManuColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManuColaboradorActionPerformed(evt);
            }
        });
        jmiManuColaborador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiManuColaboradorKeyPressed(evt);
            }
        });
        jMenu2.add(jmiManuColaborador);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");

        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmiSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiSairKeyPressed(evt);
            }
        });
        jMenu3.add(jmiSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpAreaDeTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpAreaDeTrabalho)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Métodos Criados
    private void abrirGUIColaborador() {
        //Criar um objeto e instanciar a classe
        GUICadColaborador gc = new GUICadColaborador();

        //Adicionando o objeto na Área de Trabalho
        jdpAreaDeTrabalho.add(gc);

        //Setando a visibilidade "true" para a janela surgir para o usuário
        gc.setVisible(true);
    }//fecha o método abrirGUIColadorador

    private void abrirGUICadProdutos() {

        if (!flagGUICadProdutos) {
            GUICadProdutos gcp = new GUICadProdutos();
            jdpAreaDeTrabalho.add(gcp);
            gcp.setVisible(true);
            
            flagGUICadProdutos = true;
            
            gcp.addInternalFrameListener(this);
        }
    }//fim do método abrirGUICadProdutos
    
    private void abrirGUIManutencaoProdutos(){
        if(!flagGUIManutencaoProdutos){
            GUIManutencaoProdutos gmp = new GUIManutencaoProdutos();
            jdpAreaDeTrabalho.add(gmp);
            gmp.setVisible(true);
            
            flagGUIManutencaoProdutos=true;
            gmp.addInternalFrameListener(this);
            
        }
    }//fim do método abrirGUIManutencaoProdutos
    
    private void abrirGUIManutencaoColaborador() {

        if (!flagGUIManutencaoColaborador) {
            GUIManutencaoColaborador gmc = new GUIManutencaoColaborador();
            jdpAreaDeTrabalho.add(gmc);
            gmc.setVisible(true);
            
            flagGUIManutencaoColaborador = true;
            
            gmc.addInternalFrameListener(this);
        }
    }
    
    private void abrirGUIClientes(){
        
        if (!flagGUIClientes) {
            GUIClientes gc = new GUIClientes();
            jdpAreaDeTrabalho.add(gc);
            gc.setVisible(true);
            
            flagGUIClientes = true;
            
            gc.addInternalFrameListener(this);
        }
        
    }
    
    

    //Eventos Gerados
    private void jmiColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiColaboradorActionPerformed
        abrirGUIColaborador();
    }//GEN-LAST:event_jmiColaboradorActionPerformed

    private void jmiColaboradorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiColaboradorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            abrirGUIColaborador();
        }
    }//GEN-LAST:event_jmiColaboradorKeyPressed

    private void jmiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutoActionPerformed
        abrirGUICadProdutos();
    }//GEN-LAST:event_jmiProdutoActionPerformed

    private void jmiProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            abrirGUICadProdutos();
        }
    }//GEN-LAST:event_jmiProdutoKeyPressed

    private void jmiManuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManuProdutoActionPerformed
        abrirGUIManutencaoProdutos();
    }//GEN-LAST:event_jmiManuProdutoActionPerformed

    private void jmiManuProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiManuProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           abrirGUIManutencaoProdutos();
        }
    }//GEN-LAST:event_jmiManuProdutoKeyPressed

    private void jmiManuColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManuColaboradorActionPerformed
        abrirGUIManutencaoColaborador();
    }//GEN-LAST:event_jmiManuColaboradorActionPerformed

    private void jmiManuColaboradorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiManuColaboradorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           abrirGUIManutencaoColaborador();
        }
    }//GEN-LAST:event_jmiManuColaboradorKeyPressed

    private void jmiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteActionPerformed
        abrirGUIClientes();
    }//GEN-LAST:event_jmiClienteActionPerformed

    private void jmiClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           abrirGUIClientes();
        }
    }//GEN-LAST:event_jmiClienteKeyPressed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
       dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiSairKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           dispose();
        }
    }//GEN-LAST:event_jmiSairKeyPressed

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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JDesktopPane jdpAreaDeTrabalho;
    private javax.swing.JMenuItem jmiCliente;
    private javax.swing.JMenuItem jmiColaborador;
    private javax.swing.JMenuItem jmiFornecedor;
    private javax.swing.JMenuItem jmiManuColaborador;
    private javax.swing.JMenuItem jmiManuProduto;
    private javax.swing.JMenuItem jmiProduto;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent ife) {

    }

    @Override
    public void internalFrameClosing(InternalFrameEvent ife) {

    }

    @Override
    public void internalFrameClosed(InternalFrameEvent ife) {
        if ( ife.getInternalFrame() instanceof GUICadProdutos){
            flagGUICadProdutos = false;
        }else if( ife.getInternalFrame() instanceof  GUIManutencaoProdutos){
             flagGUIManutencaoProdutos = false;
        }else if( ife.getInternalFrame() instanceof  GUIManutencaoColaborador){
             flagGUIManutencaoColaborador = false;
        }else if( ife.getInternalFrame() instanceof  GUIClientes){
            flagGUIClientes = false;
        }
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent ife) {

    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent ife) {

    }

    @Override
    public void internalFrameActivated(InternalFrameEvent ife) {

    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent ife) {

    }
}
