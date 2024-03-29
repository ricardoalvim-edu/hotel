/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.view.cadastro;

import java.util.ArrayList;
import java.util.List;
import org.sistemahotel.Controller.ControllerTelefone;
import org.sistemahotel.Model.Telefone;
import org.sistemahotel.Model.AgendaContato;
import org.sistemahotel.view.JanelaAbstrata;
import org.sistemahotel.view.MyTableModel.TableModelTelefone;

/**
 *
 * @author GILIARD
 */
public class CadastroTelefone extends JanelaAbstrata<Telefone> {
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTitulo = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpCadastrarTelefone = new javax.swing.JPanel();
        tfDDI = new javax.swing.JTextField();
        tfDDD = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpTabTelefones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabTelefone = new javax.swing.JTable();
        jpEditar = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jpNavegar = new javax.swing.JPanel();
        btPrimeiro = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        jpTitulo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNome.setText("NomeProprietarioContatos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cadastrar telefone para:");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCadastrarTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        tfDDI.setText(" ");
        tfDDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDDIActionPerformed(evt);
            }
        });

        tfDDD.setText(" ");

        tfTelefone.setText(" ");

        jLabel12.setText("Telefone");

        jLabel11.setText("DDD");

        jLabel10.setText("DDI");

        javax.swing.GroupLayout jpCadastrarTelefoneLayout = new javax.swing.GroupLayout(jpCadastrarTelefone);
        jpCadastrarTelefone.setLayout(jpCadastrarTelefoneLayout);
        jpCadastrarTelefoneLayout.setHorizontalGroup(
            jpCadastrarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastrarTelefoneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpCadastrarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDDI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(14, 14, 14)
                .addGroup(jpCadastrarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCadastrarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jpCadastrarTelefoneLayout.setVerticalGroup(
            jpCadastrarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarTelefoneLayout.createSequentialGroup()
                .addGroup(jpCadastrarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastrarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDDI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jpTabTelefones.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefones"));

        tabTelefone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabTelefone);

        javax.swing.GroupLayout jpTabTelefonesLayout = new javax.swing.GroupLayout(jpTabTelefones);
        jpTabTelefones.setLayout(jpTabTelefonesLayout);
        jpTabTelefonesLayout.setHorizontalGroup(
            jpTabTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpTabTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTabTelefonesLayout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jpTabTelefonesLayout.setVerticalGroup(
            jpTabTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
            .addGroup(jpTabTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpTabTelefonesLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jpEditar.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar"));
        jpEditar.setLayout(new java.awt.GridLayout());

        btSalvar.setText("SALVAR");
        btSalvar.setPreferredSize(new java.awt.Dimension(73, 50));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jpEditar.add(btSalvar);

        btExcluir.setText("EXCLUIR");
        btExcluir.setPreferredSize(new java.awt.Dimension(73, 50));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jpEditar.add(btExcluir);

        btNovo.setText("NOVO");
        btNovo.setPreferredSize(new java.awt.Dimension(73, 50));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jpEditar.add(btNovo);

        jpNavegar.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegar"));
        jpNavegar.setLayout(new java.awt.GridLayout());

        btPrimeiro.setText("PRIMEIRO");
        btPrimeiro.setPreferredSize(new java.awt.Dimension(73, 50));
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });
        jpNavegar.add(btPrimeiro);

        btAnterior.setText("ANTERIOR");
        btAnterior.setPreferredSize(new java.awt.Dimension(73, 50));
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });
        jpNavegar.add(btAnterior);

        btProximo.setText("PRÓXIMO");
        btProximo.setPreferredSize(new java.awt.Dimension(73, 50));
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });
        jpNavegar.add(btProximo);

        btUltimo.setText("ÚLTIMO");
        btUltimo.setPreferredSize(new java.awt.Dimension(73, 50));
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
            }
        });
        jpNavegar.add(btUltimo);

        jpTitulo1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE TELEFONE");
        jpTitulo1.add(jLabel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCadastrarTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpNavegar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTabTelefones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpCadastrarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpTabTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpNavegar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDDIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDDIActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       /*
        O método adicionarTelefone está declarado na classe Cadastro de Telefone.
        nele o telefone é salvo na base de dados e  atualizado no JTable
        */
        adicionarTelefone(getView());
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        removeTelefone(getView());
        setView(controle.exibeAtual());
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        setView(controle.novo());
    }//GEN-LAST:event_btNovoActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        // TODO add your handling code here:
        setView(controle.exibePrimeiro());
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        // TODO add your handling code here:
        setView(controle.exibeAnterior());
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        // TODO add your handling code here:
        setView(controle.exibeProximo());
    }//GEN-LAST:event_btProximoActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        // TODO add your handling code here:
        setView(controle.exibeUltimo());
    }//GEN-LAST:event_btUltimoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTelefone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCadastrarTelefone;
    private javax.swing.JPanel jpEditar;
    private javax.swing.JPanel jpNavegar;
    private javax.swing.JPanel jpTabTelefones;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JTable tabTelefone;
    private javax.swing.JTextField tfDDD;
    private javax.swing.JTextField tfDDI;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
    Telefone currentView;
    
    /**
     * Creates new form CadastroTelefone
     */
    public CadastroTelefone(){
        // somente para exemplo
    }
    
    public CadastroTelefone(AgendaContato proprietario) {
        initComponents();
        
        this.controle = new ControllerTelefone(proprietario);
        
        setTableModelTelefone();
        setDateTableTelefone(controle.listAll());
        
        currentView = controle.exibePrimeiro();
        setView(currentView);
        lbNome.setText(proprietario.getNomeProprietarioAgenda());
    }
    
    @Override
    protected void setView(Telefone objeto) {
        if(objeto == null){
            setView(controle.novo());
        }else{
            currentView = objeto;
            tfDDD.setText(objeto.getDdd());
            tfDDI.setText(objeto.getDdi());
            tfTelefone.setText(objeto.getTelefone());
        }
    }

    @Override
    protected Telefone getView() {
        currentView.setDdd(tfDDD.getText());
        currentView.setDdi(tfDDI.getText());
        currentView.setTelefone(tfTelefone.getText());
        
        return currentView;
    }
    
    private void adicionarTelefone(Telefone telefone){
        //adiciona registro à lista de objetos
        TableModelTelefone model = (TableModelTelefone) tabTelefone.getModel();
        if(!controle.listAll().contains(telefone)){
            controle.listAll().add(telefone);
            model.addTelefone(telefone);
        }else{
            model.updateTelefone(telefone);
        }
        
        controle.salvar(telefone);
 
    }
    
    private void removeTelefone(Telefone telefone){
        TableModelTelefone model = (TableModelTelefone) tabTelefone.getModel();
        
        model.removeTelefone(telefone);
        
        controle.excluir(telefone);
        
        setView(controle.exibeAtual());
       
    }
    
    private void setTableModelTelefone(){
        //Cria um novo Table model toda vez que esse método for chamado, ou apenas atualiza o table model
        TableModelTelefone tabTelefones = new TableModelTelefone();
        tabTelefone.setModel(tabTelefones);
                
    }
    
    private void setDateTableTelefone(List<Telefone> lista){
        if(lista == null){
            // Essa gambiarra é da brava
            ((ControllerTelefone) controle).setListaTelefone(new ArrayList<>());
        }
        TableModelTelefone model = (TableModelTelefone)tabTelefone.getModel();
        model.setRows(lista);
    }
    
}
