package bd_registro;
import javax.swing.JOptionPane;
import java.sql.*;

public class Registro extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstance();
    
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registros a BD");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        combo_ingenierias = new javax.swing.JComboBox<>();
        registrar_btn = new javax.swing.JButton();
        actualizar_btn = new javax.swing.JButton();
        consultar_btn = new javax.swing.JButton();
        verificar_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        buscar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        modificar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Digite su nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 28, 110, 26));

        jLabel2.setText("Digite su telefono:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 67, 110, 26));

        jLabel3.setText("Digite su profesion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 106, 110, 26));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 30, 181, -1));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 69, 180, -1));

        combo_ingenierias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesion", "Ingenieria de sistemas", "Ingenieria industrial", "Ingenieria civil", "Ingenieria electrica", "Ingenieria quimica" }));
        combo_ingenierias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_ingenieriasActionPerformed(evt);
            }
        });
        getContentPane().add(combo_ingenierias, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 108, 181, -1));

        registrar_btn.setText("Registrar");
        registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(registrar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 45, 190, -1));

        actualizar_btn.setText("Actualizar");
        actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 190, -1));

        consultar_btn.setText("Consultar");
        consultar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(consultar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 334, 118, 48));

        verificar_btn.setText("Verificar si hay datos");
        verificar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(verificar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 334, -1, 48));

        informacion.setColumns(20);
        informacion.setRows(5);
        jScrollPane1.setViewportView(informacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 145, 510, 170));

        jLabel4.setText("Digite el id a buscar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 120, 30));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 160, 30));

        buscar_btn.setText("Buscar");
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 160, 30));

        eliminar_btn.setText("Eliminar");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 140, 50));

        modificar_btn.setText("Modificar");
        modificar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(modificar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 140, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void combo_ingenieriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ingenieriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_ingenieriasActionPerformed

    private void registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_btnActionPerformed
        try {
            
            Connection conexion = conectar.conectarBD();
            //PreparedStatement sirve para CRUD en una BD
            PreparedStatement insertar = conexion.prepareStatement("insert into empleados values(?,?,?,?)");
            
            insertar.setString(1, "0");
            // trim separa los espacion innecesarios de una cadena
            insertar.setString(2, txt_nombre.getText().trim());
            insertar.setString(3, txt_telefono.getText().trim());
            insertar.setString(4, combo_ingenierias.getSelectedItem().toString());
            insertar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
            conectar.cerrarConexion();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_registrar_btnActionPerformed

    private void actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btnActionPerformed
        txt_nombre.setText("");
        txt_telefono.setText("");
    }//GEN-LAST:event_actualizar_btnActionPerformed

    private void verificar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificar_btnActionPerformed
        try {
            Connection conexion = conectar.conectarBD();
            PreparedStatement seleccionar = conexion.prepareStatement("select * from empleados");
            
            // resulset crea consultas a la bd
            ResultSet consulta = seleccionar.executeQuery();
            
            if (consulta.next()) {
                JOptionPane.showMessageDialog(null, "Mi BD si tiene datos");
            } else {
                JOptionPane.showMessageDialog(null, "Mi BD esta vacia");
            }
            
            conectar.cerrarConexion();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_verificar_btnActionPerformed

    private void consultar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_btnActionPerformed
        informacion.setText("");
        
        try {
            Connection conexion = conectar.conectarBD();
            PreparedStatement seleccionar = conexion.prepareStatement("select * from empleados");
            ResultSet consulta = seleccionar.executeQuery();
            
            while (consulta.next()) {
                informacion.append(consulta.getString(1));
                informacion.append("                   ");
                informacion.append(consulta.getString(2));
                informacion.append("                   ");
                informacion.append(consulta.getString(3));
                informacion.append("                   ");
                informacion.append(consulta.getString(4));
                informacion.append("\n");
            }
            
            conectar.cerrarConexion();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_consultar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        try {
            Connection conexion = conectar.conectarBD();
            PreparedStatement eliminar = conexion.prepareStatement("delete from empleados where id = ?");
            eliminar.setString(1, txt_buscar.getText().trim());
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            eliminar.executeUpdate();
            
            conectar.cerrarConexion();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void modificar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_btnActionPerformed
        try {
            Connection conexion = conectar.conectarBD();
            String ID = txt_buscar.getText().trim();
            PreparedStatement modificar = conexion.prepareStatement("update empleados set nombre = ?, telefono = ?, profesion = ? where id = " + ID);
            
            modificar.setString(1, txt_nombre.getText().trim());
            modificar.setString(2, txt_telefono.getText().trim());
            modificar.setString(3, combo_ingenierias.getSelectedItem().toString());
            modificar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            
            conectar.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_modificar_btnActionPerformed

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        try {
            Connection conexion = conectar.conectarBD();
            PreparedStatement buscar = conexion.prepareStatement("select * from empleados where id = ?");
            buscar.setString(1, txt_buscar.getText().trim());
            
            ResultSet consulta = buscar.executeQuery();
            while (consulta.next()) {
                txt_nombre.setText(consulta.getString("nombre"));
                txt_telefono.setText(consulta.getString("telefono"));
                combo_ingenierias.setSelectedItem(consulta.getString("profesion"));
            }
            
            JOptionPane.showMessageDialog(null, "Se encontraron los datos");
            conectar.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buscar_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_btn;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JComboBox<String> combo_ingenierias;
    private javax.swing.JButton consultar_btn;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JTextArea informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar_btn;
    private javax.swing.JButton registrar_btn;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JButton verificar_btn;
    // End of variables declaration//GEN-END:variables
}
