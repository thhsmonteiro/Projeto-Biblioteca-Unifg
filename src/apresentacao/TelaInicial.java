/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import javax.swing.SwingConstants;

/**
 *
 * @author Paulo Victor
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        menuGlobal = new javax.swing.JMenuBar();
        cadastrar = new javax.swing.JMenu();
        cadastroAluno = new javax.swing.JMenuItem();
        cadastroFuncionario = new javax.swing.JMenuItem();
        cadastroLivro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadastroAluno1 = new javax.swing.JMenuItem();
        cadastroFuncionario1 = new javax.swing.JMenuItem();
        cadastroLivro1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Biblioteca");

        jTextField1.setText("Digite o nome do Aluno");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("Emprestar Livro");

        jButton3.setText("Devolver Livro");

        jButton4.setText("Buscar Livro");

        jButton5.setText("Cadastrar Aluno");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Visualizar Dados");

        cadastrar.setText("Cadastrar");

        cadastroAluno.setText("Aluno");
        cadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAlunoActionPerformed(evt);
            }
        });
        cadastrar.add(cadastroAluno);

        cadastroFuncionario.setText("Funcionário");
        cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFuncionarioActionPerformed(evt);
            }
        });
        cadastrar.add(cadastroFuncionario);

        cadastroLivro.setText("Livro");
        cadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroLivroActionPerformed(evt);
            }
        });
        cadastrar.add(cadastroLivro);

        menuGlobal.add(cadastrar);

        jMenu2.setText("Editar");

        cadastroAluno1.setText("Aluno");
        cadastroAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAluno1ActionPerformed(evt);
            }
        });
        jMenu2.add(cadastroAluno1);

        cadastroFuncionario1.setText("Funcionário");
        cadastroFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFuncionario1ActionPerformed(evt);
            }
        });
        jMenu2.add(cadastroFuncionario1);

        cadastroLivro1.setText("Livro");
        jMenu2.add(cadastroLivro1);

        menuGlobal.add(jMenu2);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuGlobal.add(menuSair);

        setJMenuBar(menuGlobal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAlunoActionPerformed
       dispose();
       CadastrarAluno frame = new CadastrarAluno();
       frame.setVisible(true);
    }//GEN-LAST:event_cadastroAlunoActionPerformed

    private void cadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFuncionarioActionPerformed
        dispose();
        CadastroFuncionario frame = new CadastroFuncionario();
        frame.setVisible(true);
    }//GEN-LAST:event_cadastroFuncionarioActionPerformed

    private void cadastroAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAluno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroAluno1ActionPerformed

    private void cadastroFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFuncionario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroFuncionario1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       dispose();
       CadastrarAluno frame = new CadastrarAluno();
       frame.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroLivroActionPerformed
        dispose();
        CadastrarLivro frame = new CadastrarLivro();
        frame.setVisible(true);
    }//GEN-LAST:event_cadastroLivroActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        
    }//GEN-LAST:event_menuSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastrar;
    private javax.swing.JMenuItem cadastroAluno;
    private javax.swing.JMenuItem cadastroAluno1;
    private javax.swing.JMenuItem cadastroFuncionario;
    private javax.swing.JMenuItem cadastroFuncionario1;
    private javax.swing.JMenuItem cadastroLivro;
    private javax.swing.JMenuItem cadastroLivro1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuGlobal;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}