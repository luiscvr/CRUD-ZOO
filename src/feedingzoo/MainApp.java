/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedingzoo;

import java.sql.ResultSet;
import java.sql.SQLException;


public class MainApp extends javax.swing.JFrame {

    //private final String USER = "usr210215739";
    //private final String PASS = "pw210215739";
    private final String USER = "postgres";
    private final String PASS = "pelotas15";
    final private Database db;

    /**
     * Creates new form MainApp
     */
    public MainApp() {
        //Abrir la conexión a la base de datos
        db = Database.getDatabase(USER, PASS);
        initComponents();
        this.setSize(800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem13 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuInsertar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        menuBrowse = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        menuDelete = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuInsertar.setText("Insertar");

        jMenuItem1.setText("Animal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuInsertar.add(jMenuItem1);

        jMenuItem2.setText("Comida");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuInsertar.add(jMenuItem2);

        jMenuItem3.setText("Staff");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuInsertar.add(jMenuItem3);

        jMenuItem4.setText("Alimentacion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuInsertar.add(jMenuItem4);

        jMenuItem5.setText("Hora Alimentacion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuInsertar.add(jMenuItem5);

        jMenuItem19.setText("Evento");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        menuInsertar.add(jMenuItem19);

        menuBar.add(menuInsertar);

        menuBrowse.setText("Browse");
        menuBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBrowseActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Animal");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuBrowse.add(jMenuItem6);

        jMenuItem7.setText("Comida");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuBrowse.add(jMenuItem7);

        jMenuItem8.setText("Alimentacion");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuBrowse.add(jMenuItem8);

        jMenuItem9.setText("hora alimentacion");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuBrowse.add(jMenuItem9);

        jMenuItem10.setText("Recibe");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuBrowse.add(jMenuItem10);

        jMenuItem17.setText("Staff");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        menuBrowse.add(jMenuItem17);

        jMenuItem18.setText("Utiliza");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        menuBrowse.add(jMenuItem18);

        menuBar.add(menuBrowse);

        menuDelete.setText("Borrar");

        jMenuItem11.setText("Alimentacion");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem11);

        jMenuItem12.setText("Animal");
        jMenuItem12.setToolTipText("");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem12);

        jMenuItem14.setText("Comida");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem14);

        jMenuItem15.setText("Hora Alimentacion");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem15);

        jMenuItem16.setText("Recibe");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem16);

        jMenuItem21.setText("Staff");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem21);

        jMenuItem22.setText("Utiliza");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem22);

        menuBar.add(menuDelete);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed


        final String sql = "SELECT id_animal, especie , espacio_asignado , "
                + "habitat, nombre_animal, descripcion FROM animal ORDER BY nombre_animal";

        final String labels[] = {"id", "especie", "espacio_asignado",
            "habitat", "nombre_animal"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new ZooTablesListener(db, "animal"));

            TableBrowser browser = new TableBrowser("Zoo", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
            rs.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        InsertAnimal dlg = new InsertAnimal(this, db);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        DeleteAlimentacion dialog = new DeleteAlimentacion(new javax.swing.JFrame(), db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        InsertComida dialogo = new InsertComida(this, db);
        dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        final String sql = "SELECT id_comida, nombre_comida , tipo , "
                + "ubicacion FROM comida ORDER BY nombre_comida";

        final String labels[] = {"id", "nombre_comida", "tipo",
            "ubicacion"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new ZooTablesListener(db,"comida"));

            TableBrowser browser = new TableBrowser("Zoo", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
            rs.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        final String sql = "SELECT id_alimentacion, hora_alimentacion , fecha_alimentacion , "
                + "racion, id_staff FROM alimentacion ORDER BY id_alimentacion";

        final String labels[] = {"id_alimentacion", "hora_alimentacion", "fecha_alimentacion",
            "racion","id_staff"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new ZooTablesListener(db,"alimentacion"));

            TableBrowser browser = new TableBrowser("Zoo", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
            rs.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        final String sql = "SELECT  id_animal_alimentado, hora_alimento "
                + "FROM hora_alimentacion ORDER BY id_animal_alimentado";

        final String labels[] = {"id_animal_alimentado", "hora_alimentacion"};
        
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new ZooTablesListener(db,"hora_alimentacion"));

            TableBrowser browser = new TableBrowser("Zoo", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
            rs.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        final String sql = "SELECT  id_animal, id_alimentacion "
                + "FROM recibe ORDER BY id_animal";

        final String labels[] = {"id_animal", "id_alimentacion"};
        
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new ZooTablesListener(db,"recibe"));

            TableBrowser browser = new TableBrowser("Zoo", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
            rs.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void menuBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrowseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBrowseActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        DeleteAnimal dialog = new DeleteAnimal(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
                final String sql = "SELECT id_staff, nombre_staff , genero , "
                + "fecha_nac, direccion, telefono FROM staff ORDER BY id_staff";

        final String labels[] = {"id_staff", "nombre_staff","genero","fecha_nac","direccion","telefono"};
        
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new ZooTablesListener(db,"staff"));

            TableBrowser browser = new TableBrowser("Zoo", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
            rs.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
                final String sql = "SELECT id_comida, id_alimentacion "
                        +"FROM utiliza ORDER BY id_comida";

        final String labels[] = {"id_comida", "id_alimentacion"};
        
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new ZooTablesListener(db,"utiliza"));

            TableBrowser browser = new TableBrowser("Zoo", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
            rs.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        InsertStaff dialogo = new InsertStaff(this, db);
        dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        InsertAlimentacion dialogo = new InsertAlimentacion(this, db);
        dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        InsertHoraAlimentacion dialogo = new InsertHoraAlimentacion(this, db);
        dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        InsertEvento dialogo = new InsertEvento(this, db);
        dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        DeleteComida dialogo = new DeleteComida(this, db);
        dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        DeleteHoraAlimentacion dialogo = new DeleteHoraAlimentacion(this, db);
        dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
         DeleteRecibe dialogo = new DeleteRecibe(this, db);
         dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
       DeleteStaff dialogo = new DeleteStaff(this, db);
       dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
       DeleteUtiliza dialogo = new DeleteUtiliza(this, db);
       dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed


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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBrowse;
    private javax.swing.JMenu menuDelete;
    private javax.swing.JMenu menuInsertar;
    // End of variables declaration//GEN-END:variables

}
