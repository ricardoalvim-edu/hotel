/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.sistemahotel.view.cadastro.CadastroAcomodacao;

/**
 *
 * @author GILIARD
 */
public class HomeAdm extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public HomeAdm() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btCadAco = new javax.swing.JButton();
        btCadCatAco = new javax.swing.JButton();
        btCadFun = new javax.swing.JButton();
        btVerFun = new javax.swing.JButton();
        btVerAco = new javax.swing.JButton();
        btCadReserv = new javax.swing.JButton();
        btVerReserv = new javax.swing.JButton();
        btCancelarReserva = new javax.swing.JButton();
        btCadProd = new javax.swing.JButton();
        btVerTodosProd = new javax.swing.JButton();
        btVerCatProd = new javax.swing.JButton();
        btReservHoje = new javax.swing.JButton();
        btReservSem = new javax.swing.JButton();
        btReservMes = new javax.swing.JButton();
        btCheckIn = new javax.swing.JButton();
        btCheckOut = new javax.swing.JButton();
        btRealizaBackup = new javax.swing.JButton();
        btRestoreBackup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTEL SYSTEM - Gerenciador de Hospedagem");

        jLabel1.setText("Painel de Gerenciamento");

        jLabel2.setText("Olá Usuário x");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("MENU"));

        btCadAco.setText("Cadastrar Acomodação");
        btCadAco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadAcoActionPerformed(evt);
            }
        });

        btCadCatAco.setText("Cadastrar Categorias de Acomodações");

        btCadFun.setText("Cadastrar Funcionários");

        btVerFun.setText("Ver funcionários");

        btVerAco.setText("Ver acomodações");

        btCadReserv.setText("Cadastrar Reservas");

        btVerReserv.setText("Ver Reservas");

        btCancelarReserva.setText("Cancelar Reserva");

        btCadProd.setText("Cadastrar Produto");

        btVerTodosProd.setText("Todos os produtos");

        btVerCatProd.setText("Cadastro de Categorias de Produtos");

        btReservHoje.setText("Ver resevas para hoje");

        btReservSem.setText("Ver reservas para esta semana");

        btReservMes.setText("Ver reservas para este mês");

        btCheckIn.setText("Checkin");

        btCheckOut.setText("Checkout");

        btRealizaBackup.setText("Realizar Backup");
        btRealizaBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRealizaBackupActionPerformed(evt);
            }
        });

        btRestoreBackup.setText("Restaurar Backup");
        btRestoreBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestoreBackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadAco)
                            .addComponent(btCadFun)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btReservHoje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(btCadProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCadReserv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCadCatAco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVerFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVerReserv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVerTodosProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btReservSem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVerAco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCancelarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVerCatProd, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(btReservMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btCheckIn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCheckOut))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btRealizaBackup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRestoreBackup)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadAco)
                    .addComponent(btCadCatAco)
                    .addComponent(btVerAco))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadFun)
                    .addComponent(btVerFun))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadReserv)
                    .addComponent(btVerReserv)
                    .addComponent(btCancelarReserva))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadProd)
                    .addComponent(btVerTodosProd)
                    .addComponent(btVerCatProd))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btReservHoje)
                    .addComponent(btReservSem)
                    .addComponent(btReservMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCheckIn)
                    .addComponent(btCheckOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRealizaBackup)
                    .addComponent(btRestoreBackup))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadAcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadAcoActionPerformed
        // TODO add your handling code here:
        CadastroAcomodacao cadastro = new CadastroAcomodacao();
        cadastro.setVisible(true);
    }//GEN-LAST:event_btCadAcoActionPerformed

    private void btRealizaBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRealizaBackupActionPerformed
        // TODO add your handling code here:
        criarBackupBanco("C:\\Users\\ricar\\Desktop\\backupHotel.sql");        
    }//GEN-LAST:event_btRealizaBackupActionPerformed

    private void btRestoreBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestoreBackupActionPerformed
        // TODO add your handling code here:
        restauraBackupBanco("C:\\Users\\ricar\\Desktop\\backupHotel.sql");
    }//GEN-LAST:event_btRestoreBackupActionPerformed

    public static void restauraBackupBanco(String local){
        final List<String> comandos = new ArrayList<String>();        
           
       comandos.add("C:\\Arquivos de programas\\PostgreSQL\\9.4\\bin\\pg_restore.exe"); //testado no windows xp  
         
         
       comandos.add("-i");        
       comandos.add("-h");        
       comandos.add("localhost");    //ou   comandos.add("192.168.0.1");   
       comandos.add("-p");        
       comandos.add("5432");        
       comandos.add("-U");        
       comandos.add("postgres");        
       comandos.add("-d");        
       comandos.add("hotel");       
       comandos.add("-v");        
           
       comandos.add(local);   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.    
  
       ProcessBuilder pb = new ProcessBuilder(comandos);        
           
       pb.environment().put("PGPASSWORD", "root");     //Somente coloque sua senha           
           
       try {        
           final Process process = pb.start();        
       
           final BufferedReader r = new BufferedReader(        
               new InputStreamReader(process.getErrorStream()));        
           String line = r.readLine();        
           while (line != null) {        
           System.err.println(line);        
           line = r.readLine();        
           }        
           r.close();        
       
           process.waitFor();      
           process.destroy();   
           JOptionPane.showMessageDialog(null,"Backup restaurado com sucesso!");    
       
       } catch (IOException e) {        
           e.printStackTrace();        
       } catch (InterruptedException ie) {        
           ie.printStackTrace();        
       }           
    }
    public static void criarBackupBanco(String local)
    {
        final List<String> comandos = new ArrayList<String>();   
        comandos.add("C:\\Arquivos de programas\\PostgreSQL\\9.4\\bin\\pg_dump.exe");      
             
           comandos.add("-i");        
           comandos.add("-h");        
           comandos.add("localhost");       
           comandos.add("-p");        
           comandos.add("5432");        
           comandos.add("-U");        
           comandos.add("postgres");        
           comandos.add("-F");        
           comandos.add("c");        
           comandos.add("-b");        
           comandos.add("-v");        
           comandos.add("-f");        
               
           comandos.add(local);   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.    
           comandos.add("hotel");        
           ProcessBuilder pb = new ProcessBuilder(comandos);        
               
           pb.environment().put("PGPASSWORD", "root");      //Somente coloque sua senha           
               
           try {        
               final Process process = pb.start();        
           
               final BufferedReader r = new BufferedReader(        
                   new InputStreamReader(process.getErrorStream()));        
               String line = r.readLine();        
               while (line != null) {        
               System.err.println(line);        
               line = r.readLine();        
               }        
               r.close();        
           
               process.waitFor();      
               process.destroy();   
               JOptionPane.showMessageDialog(null,"Realizado o backup com sucesso!");    
           
           } catch (IOException e) {        
               e.printStackTrace();        
           } catch (InterruptedException ie) {        
               ie.printStackTrace();        
           }           
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadAco;
    private javax.swing.JButton btCadCatAco;
    private javax.swing.JButton btCadFun;
    private javax.swing.JButton btCadProd;
    private javax.swing.JButton btCadReserv;
    private javax.swing.JButton btCancelarReserva;
    private javax.swing.JButton btCheckIn;
    private javax.swing.JButton btCheckOut;
    private javax.swing.JButton btRealizaBackup;
    private javax.swing.JButton btReservHoje;
    private javax.swing.JButton btReservMes;
    private javax.swing.JButton btReservSem;
    private javax.swing.JButton btRestoreBackup;
    private javax.swing.JButton btVerAco;
    private javax.swing.JButton btVerCatProd;
    private javax.swing.JButton btVerFun;
    private javax.swing.JButton btVerReserv;
    private javax.swing.JButton btVerTodosProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
