/*
 * An <Alex Tumiri> production
 */
package views;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Alex Tumiri
 */
public class view extends javax.swing.JFrame {

    public view() {
        beauty(this);
        initComponents();
        borderRadiusWindow(this);
        positionWindow(this);
    }
    
    /**
     * subrutina para quitarle el marco por defecto a la ventana
     * @param instance 
     */
    public static void beauty(view instance){
        instance.setUndecorated(true);
    }
    
    /**
     * subrutina para renderizar los bordes de la ventana
     * @param instance 
     */
    public static void borderRadiusWindow(view instance){
        Shape borderRadius = new RoundRectangle2D.Double(0,0,instance.getBounds().width, instance.getBounds().height,25,25); 
        AWTUtilities.setWindowShape(instance, borderRadius);
    }
    
    /**
     * subrutina para posicionar la ventana dinamicamente segun la pantalla
     * @param instance 
     */
    public static void positionWindow(view instance){
        int heightScreen = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int widthScreen = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        
        // [width => 210,  height => 111] size of JFrame
        int positionHeight = heightScreen - 141;
        int positionWidth = widthScreen - 230;
        
        instance.setLocation(positionWidth, positionHeight);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        app = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 5, 28));
        panel1.setForeground(new java.awt.Color(255, 255, 255));

        app.setFont(new java.awt.Font("Candara Light", 0, 60)); // NOI18N
        app.setForeground(new java.awt.Color(255, 255, 255));
        app.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        app.setText("<caster/>");
        app.setToolTipText("");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel app;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables

    public void openView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
