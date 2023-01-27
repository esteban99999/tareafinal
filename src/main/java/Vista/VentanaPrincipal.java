/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Asignatura;
import Modelo.Carrera;
import Modelo.Universidad;
import Servicio.AsignaturaServiceImpl;
import Servicio.CarreraServiceImpl;
import Servicio.UniversidadServiceImpl;
import java.util.List;
import javax.swing.JInternalFrame;

/**
 *
 * @author Esteban
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaUniversidadCrear ventanaUniversidad;
    private VentanaUniversidadModificar ventanaUniversidadModificar;
    private VentanaUniversidadEliminar ventanaUniversidadEliminar;
    private VentanaUniversidadListar ventanaUniversidadListar;

    private VentanaCarreraCrear ventanaCarrera;
    private VentanaCarreraModificar ventanaCarreraModificar;
    private VentanaCarreraEliminar ventanaCarreraEliminar;
    private VentanaCarreraListar ventanaCarreraListar;

    private VentanaAsignaturaCrear ventanaAsignatura;
    private VentanaAsignaturaModificar ventanaAsignaturaModificar;
    private VentanaAsignaturaEliminar ventanaAsignaturaEliminar;
    private VentanaAsignaturaListar ventanaAsignaturaListar;
    

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));

        jMenu2.setText("Universidad");

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem11.setText("Eliminar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem3.setText("Listar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Carrera");

        jMenuItem5.setText("Crear");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Modificar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem12.setText("Eliminar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem7.setText("Listar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Asignatura");

        jMenuItem8.setText("Crear");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Modificar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem13.setText("Eliminar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem10.setText("Listar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.ventanaUniversidadListar = new VentanaUniversidadListar();

        ventanaUniversidadListar.setVisible(true);

        ventanaUniversidadListar.setResizable(true);
        ventanaUniversidadListar.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaUniversidadListar.setClosable(true);
        ventanaUniversidadListar.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaUniversidadListar);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        this.ventanaCarreraEliminar = new VentanaCarreraEliminar();

        ventanaCarreraEliminar.setVisible(true);

        ventanaCarreraEliminar.setResizable(true);
        ventanaCarreraEliminar.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaCarreraEliminar.setClosable(true);
        ventanaCarreraEliminar.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaCarreraEliminar);

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.ventanaUniversidad = new VentanaUniversidadCrear();

        ventanaUniversidad.setVisible(true);

        ventanaUniversidad.setResizable(true);
        ventanaUniversidad.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaUniversidad.setClosable(true);
        ventanaUniversidad.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaUniversidad);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        this.ventanaUniversidadModificar = new VentanaUniversidadModificar();

        ventanaUniversidadModificar.setVisible(true);

        ventanaUniversidadModificar.setResizable(true);
        ventanaUniversidadModificar.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaUniversidadModificar.setClosable(true);
        ventanaUniversidadModificar.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaUniversidadModificar);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

        this.ventanaUniversidadEliminar = new VentanaUniversidadEliminar();

        ventanaUniversidadEliminar.setVisible(true);

        ventanaUniversidadEliminar.setResizable(true);
        ventanaUniversidadEliminar.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaUniversidadEliminar.setClosable(true);
        ventanaUniversidadEliminar.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaUniversidadEliminar);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.ventanaCarrera = new VentanaCarreraCrear();

        ventanaCarrera.setVisible(true);

        ventanaCarrera.setResizable(true);
        ventanaCarrera.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaCarrera.setClosable(true);
        ventanaCarrera.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaCarrera);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.ventanaCarreraModificar = new VentanaCarreraModificar();

        ventanaCarreraModificar.setVisible(true);

        ventanaCarreraModificar.setResizable(true);
        ventanaCarreraModificar.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaCarreraModificar.setClosable(true);
        ventanaCarreraModificar.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaCarreraModificar);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.ventanaCarreraListar = new VentanaCarreraListar();

        ventanaCarreraListar.setVisible(true);

        ventanaCarreraListar.setResizable(true);
        ventanaCarreraListar.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaCarreraListar.setClosable(true);
        ventanaCarreraListar.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaCarreraListar);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
  this.ventanaAsignatura = new VentanaAsignaturaCrear();

        ventanaAsignatura.setVisible(true);

        ventanaAsignatura.setResizable(true);
        ventanaAsignatura.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaAsignatura.setClosable(true);
        ventanaAsignatura.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaAsignatura);




        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
this.ventanaAsignaturaModificar = new VentanaAsignaturaModificar();

        ventanaAsignaturaModificar.setVisible(true);

        ventanaAsignaturaModificar.setResizable(true);
        ventanaAsignaturaModificar.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaAsignaturaModificar.setClosable(true);
        ventanaAsignaturaModificar.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaAsignaturaModificar);


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
this.ventanaAsignaturaEliminar = new VentanaAsignaturaEliminar();

        ventanaAsignaturaEliminar.setVisible(true);

        ventanaAsignaturaEliminar.setResizable(true);
        ventanaAsignaturaEliminar.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaAsignaturaEliminar.setClosable(true);
        ventanaAsignaturaEliminar.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaAsignaturaEliminar);


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
  this.ventanaAsignaturaListar = new VentanaAsignaturaListar();

        ventanaAsignaturaListar.setVisible(true);

        ventanaAsignaturaListar.setResizable(true);
        ventanaAsignaturaListar.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        ventanaAsignaturaListar.setClosable(true);
        ventanaAsignaturaListar.setIconifiable(true);

        this.jDesktopPane1.add(this.ventanaAsignaturaListar);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
              
                UniversidadServiceImpl universidadServiceImpl=new UniversidadServiceImpl();
                List<Universidad> universidadList= universidadServiceImpl.recuperarArchivo("C:/Netbeans1/universidad.dat");
                universidadServiceImpl.setUniversidadList(universidadList);
                   System.out.print(universidadList);
                /*CarreraServiceImpl carreraServiceImpl=new CarreraServiceImpl();
                List<Carrera> carreralist= carreraServiceImpl.recuperarArchivo("C:/Netbeans1/carrera.dat");
                carreraServiceImpl.setCarreraList(carreralist);
                AsignaturaServiceImpl asignaturaServiceImpl=new AsignaturaServiceImpl();
                List<Asignatura> asignaturalist= asignaturaServiceImpl.recuperarArchivo("C:/Netbeans1/asignatura.dat");
               System.out.print(universidadList);
                asignaturaServiceImpl.setAsignaturaList(asignaturalist);*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
