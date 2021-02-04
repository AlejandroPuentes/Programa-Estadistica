/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba_Estadistica;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.crypto.AEADBadTagException;

/**
 *
 * @AlejoPuentes
 */
public class principal extends javax.swing.JFrame {

    Prueba_Mann_Whitney pb;
    String muestra1;
    String muestra2;
    ArrayList<Integer> datos1;
    ArrayList<Integer> datos2;
    public principal() {
        initComponents();
        pb = new Prueba_Mann_Whitney();
        datos1 =  new  ArrayList<>();
        datos2 = new ArrayList<>();        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFielMuestra2 = new javax.swing.JTextField();
        JTextFieldMuestra1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnMues1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMues2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDatos = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnDatos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnRegistroM = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Muestra 1");

        btnMues1.setText("ingresar");
        btnMues1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMues1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 51, 255));
        jLabel2.setText("Muestra 2");

        btnMues2.setText("ingresar");
        btnMues2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMues2ActionPerformed(evt);
            }
        });

        jTextAreaDatos.setColumns(20);
        jTextAreaDatos.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDatos);

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Prueba Mann Whitney para muestras no emparejadas");

        btnDatos.setText("Realizar Prueba ");
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(102, 255, 102));
        jLabel4.setText("Datos");

        jLabel5.setForeground(new java.awt.Color(204, 51, 255));
        jLabel5.setText("Datos");

        btnRegistroM.setText("Registrar");
        btnRegistroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroMActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/descarga.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/descarga.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/descarga.jpg"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/descarga.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnMues1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                                    .addComponent(JTextFieldMuestra1))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jTextFielMuestra2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextField3))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(208, 208, 208)
                                                .addComponent(btnMues2)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(281, 281, 281)
                                        .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(btnRegistroM)))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(btnRegistroM)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFielMuestra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextFieldMuestra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMues2)
                    .addComponent(btnMues1))
                .addGap(18, 18, 18)
                .addComponent(btnDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMues1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMues1ActionPerformed
        // TODO add your handling code here:
        try {
            pb.observacion1(Integer.parseInt(JTextFieldMuestra1.getText()));
            
            datos1.add(Integer.parseInt(JTextFieldMuestra1.getText()));
            JTextFieldMuestra1.setText(null);
        } catch (NumberFormatException e) {
            
        }
        
    }//GEN-LAST:event_btnMues1ActionPerformed

    private void btnMues2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMues2ActionPerformed
        // TODO add your handling code here:
        try {
            pb.observacion2(Integer.parseInt(jTextFielMuestra2.getText()));
            datos2.add(Integer.parseInt(jTextFielMuestra2.getText()));
            jTextFielMuestra2.setText(null);
        } catch (NumberFormatException e) {
            
        }
       
    }//GEN-LAST:event_btnMues2ActionPerformed

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        // TODO add your handling code here:
        pb.mescla();
        double rango[][]=pb.Vectrango();
        int tama =pb.contadorr;
        var fuente=new Font("Dialog", Font.ITALIC, 18);
        jTextAreaDatos.setFont( fuente ) ;
        jTextAreaDatos.setForeground(Color.BLUE);
        jTextAreaDatos.append( "Hipotesis nula: " ) ;
        
        
        jTextAreaDatos.append("Puede concluirse al nivel de significancia 0.05 que en el grupo de la mañana el\n" +
                                "rendimiento sea menor que en el grupo de la tarde"+"\n\n");
        jTextAreaDatos.append("Hipotesis nula H0: grupo de la manana tiene rendimiento menor que el de la tarde\n" +
                              "Hipostesis alternativa H1: el grupo de la manana no tiene rendimiento menor que el de la tarde"+"\n\n");
        
        double U=pb.Umedia(),R1=pb.rango1(),R2=pb.rango2(),Med=pb.mediaPobla(),des=pb.desviacionEstandar(),Z=pb.Zestandar(),emp=pb.calculazacum(pb.Zestandar());
        jTextAreaDatos.append("             -----------------------------"+"\n");
        jTextAreaDatos.append("                     "+muestra1+"\n");
        jTextAreaDatos.append("             -----------------------------"+"\n");
        for(Integer d1:datos1){
            jTextAreaDatos.append(d1+"   |  ");
        }
        
        jTextAreaDatos.append("\n\n");
        
        jTextAreaDatos.append("             -----------------------------"+"\n");
        jTextAreaDatos.append("                     "+muestra2+"\n");
        jTextAreaDatos.append("             -----------------------------"+"\n");
        
        for(Integer d2:datos2){
            jTextAreaDatos.append(d2+"   |  ");
        }
        jTextAreaDatos.append("\n\n");
        
        jTextAreaDatos.append("se muestra las clasificaciones con sus respectivos rangos  \n");
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j<tama; j++){
                jTextAreaDatos.append(String.valueOf(rango[i][j])+"    |    ");
            }
            jTextAreaDatos.append("\n"); 
        }        
        jTextAreaDatos.append("Los rangos respectivos con cada grupo son"+"\n");
        jTextAreaDatos.append("             -----------------------------"+"\n");
        jTextAreaDatos.append("                     "+muestra1+"\n");
        jTextAreaDatos.append("             -----------------------------"+"\n");
        for (int i = 0; i < pb.obs1.size(); i++){           
            jTextAreaDatos.append(pb.obs1.get(i).rango+"     ");
        }
        jTextAreaDatos.append("\n");
        jTextAreaDatos.append("suma de rangos R1: "+R1);
        jTextAreaDatos.append("\n\n");
        
        jTextAreaDatos.append("             -----------------------------\n");
        jTextAreaDatos.append("                     "+muestra2+"\n");
        jTextAreaDatos.append("             -----------------------------\n");
        for (int i = 0; i < pb.obs2.size(); i++){           
            jTextAreaDatos.append(pb.obs2.get(i).rango+"     ");
        }
        jTextAreaDatos.append("\n");
        jTextAreaDatos.append("suma de rangos R2: "+R2);
        jTextAreaDatos.append("\n");
        
        
        
        jTextAreaDatos.append("             -----------------------------\n");
        jTextAreaDatos.append("                  Datos Obtenidos"+"\n");
        jTextAreaDatos.append("             -----------------------------\n");
        
        //String.format("%.3f", valor)
        //(double)Math.round(number * 100d) / 100d
        jTextAreaDatos.append("U = "+U+"\n");
        jTextAreaDatos.append("R1 = "+R1+"\n");
        jTextAreaDatos.append("R2 = "+R2+"\n");
        jTextAreaDatos.append("Media Poblacional = "+Med+"\n");
        jTextAreaDatos.append("Desviacion Estandar = "+des+"\n");
        jTextAreaDatos.append("Z = "+Z+"\n");
        
        jTextAreaDatos.append("             -----------------------------\n");
        jTextAreaDatos.append("                 Conclusion"+"\n");
        jTextAreaDatos.append("             -----------------------------\n");
        
        jTextAreaDatos.append("Simulando la funcion de Excel que me da la funcion de distribucion de probabilidad normal obtenemos  que p para una cola sera\n 1 - NormsDist( "+String.format("%.3f", Z)+" ) y da como resultado "+String.format("%.3f",(1-emp) ));
        if (((1-emp)<0.05)||(((1-emp)>(-0.05)))){
            jTextAreaDatos.append("por tanto se puede decir que P <0.05 se concluye que el desempeno del "+muestra1+"\n no es tan bueno como el de "+muestra2+" por tanto acepta la hipotesis a un nivel de significancia del 5%");
        }else{
            jTextAreaDatos.append("se rechaza la hipotisis nula debido a que como es P > 0.05 \n se concluye que el desempeno del "+muestra1+" es tan bueno como el de"+muestra2+"");
        }

       
       
        
    }//GEN-LAST:event_btnDatosActionPerformed

    private void btnRegistroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroMActionPerformed
        muestra1 = jTextField2.getText();
        muestra2 = jTextField3.getText();
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
    }//GEN-LAST:event_btnRegistroMActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFieldMuestra1;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnMues1;
    private javax.swing.JButton btnMues2;
    private javax.swing.JButton btnRegistroM;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDatos;
    private javax.swing.JTextField jTextFielMuestra2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
