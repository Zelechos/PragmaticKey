/*
 * An <Alex Tumiri> production
 */
package views;

import app.KeyCaster;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.RoundRectangle2D;
import java.net.URI;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

/**
 *
 * @author Alex Tumiri
 */
public class View extends javax.swing.JFrame implements NativeKeyListener, WindowListener, ClipboardOwner{

    private static String text = "";
    
    public View() {
        beauty(this);
        positionWindow(this);
        initComponents();
        borderRadiusWindow(this);
        keyCaster(this);
        register_Window();
        addWindowListener(this);
        this.setAlwaysOnTop(true);
    }

    /**
     * subrutina para mejorar la U/X
     * @param instance 
     */
    
    public static void beauty(View instance){
        instance.setUndecorated(true);
        instance.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.85f));
    }
    
    /**
     * subrutina para renderizar los bordes de la ventana
     * @param instance 
     */
    public static void borderRadiusWindow(View instance){
        Shape borderRadius = new RoundRectangle2D.Double(0,0,instance.getBounds().width, instance.getBounds().height,25,25); 
        AWTUtilities.setWindowShape(instance, borderRadius);
    }
    
    /**
     * subrutina para posicionar la ventana dinamicamente segun la pantalla
     * @param instance 
     */
    public static void positionWindow(View instance){
        int heightScreen = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int widthScreen = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();

        // [width => 244,  height => 127] size of JFrame
        int positionHeight = heightScreen - 157;
        int positionWidth = widthScreen - 264;
        
        instance.setLocation(positionWidth, positionHeight);
    }
    
    /**
     * subrutina para crear un oyente de teclado global
     * @param instance 
     */
    public void keyCaster(View instance){
        GlobalScreen.addNativeKeyListener(this);
    }
    
    /**
     * subrutina para limpiar el caster(JLabel)
     */
    public void cleanText(){
        caster.setText("");
    }
    
    /**
     * subrutina para cambio el estado del texto del caster(JLabel)
     * @param text 
     */
    public void changeState(String text){
        caster.setText(text);
    }

    /**
     * subrutina para obtener la ventana global para ejecutar el keyCaster
     */
    public void register_Window() {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.out.println("Code Crash =>"+ ex);
        }
    }
    
    /**
     * subrutina para abrir la pagina web de mi proyecto
     */
    public void openWeb(){
        try{
            Desktop.getDesktop().browse(new URI("https://github.com/Zelechos/PragmaticKey"));
        }catch(Exception error){
            System.out.println(error);
        }
    }
    
    /**
     * subrutina para copiar el link de la web con solo un boton
     * @param link
     */
    public void copyLink(String link){
        StringSelection copylink = new StringSelection(link);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copylink, this);
    }
        
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new java.awt.Panel();
        separtor = new javax.swing.JLabel();
        caster = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        accommodate = new javax.swing.JLabel();
        link = new javax.swing.JLabel();
        web = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 5, 28));
        setName("app"); // NOI18N
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        container.setBackground(new java.awt.Color(0, 5, 28));
        container.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        container.setForeground(new java.awt.Color(255, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(255, 121));
        container.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                containerMousePressed(evt);
            }
        });
        container.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                containerMouseDragged(evt);
            }
        });

        separtor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/line.gif"))); // NOI18N
        separtor.setToolTipText("");

        caster.setBackground(new java.awt.Color(255, 255, 255));
        caster.setFont(new java.awt.Font("Candara Light", 0, 60)); // NOI18N
        caster.setForeground(new java.awt.Color(255, 255, 255));
        caster.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caster.setToolTipText("");
        caster.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        caster.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                casterMouseDragged(evt);
            }
        });
        caster.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                casterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                casterFocusLost(evt);
            }
        });
        caster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casterMousePressed(evt);
            }
        });
        caster.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                casterKeyPressed(evt);
            }
        });

        closeButton.setForeground(new java.awt.Color(204, 204, 204));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        accommodate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vista.png"))); // NOI18N
        accommodate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accommodateMouseClicked(evt);
            }
        });

        link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/link.png"))); // NOI18N
        link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkMouseClicked(evt);
            }
        });

        web.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enviar.png"))); // NOI18N
        web.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addComponent(accommodate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(web)
                                .addGap(38, 38, 38)))
                        .addComponent(link)
                        .addGap(32, 32, 32)
                        .addComponent(closeButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caster, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(separtor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(caster, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separtor, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeButton)
                            .addComponent(accommodate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(web))
                    .addComponent(link))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_casterKeyPressed
    }//GEN-LAST:event_casterKeyPressed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    int c_X, c_Y;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
    }//GEN-LAST:event_formMousePressed

    private void containerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerMousePressed
        c_X = evt.getX();
        c_Y = evt.getY();
    }//GEN-LAST:event_containerMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    }//GEN-LAST:event_formMouseDragged

    private void containerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerMouseDragged
        int coordinate_X = evt.getXOnScreen();
        int coordinate_Y = evt.getYOnScreen();
        this.setLocation(coordinate_X-c_X, coordinate_Y-c_Y);
    }//GEN-LAST:event_containerMouseDragged

    private void casterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casterMousePressed
        c_X = evt.getX();
        c_Y = evt.getY();
    }//GEN-LAST:event_casterMousePressed

    private void casterMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casterMouseDragged
        int coordinate_X = evt.getXOnScreen();
        int coordinate_Y = evt.getYOnScreen();
        this.setLocation(coordinate_X-c_X, coordinate_Y-c_Y);
    }//GEN-LAST:event_casterMouseDragged

    private void casterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_casterFocusGained
    }//GEN-LAST:event_casterFocusGained

    private void casterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_casterFocusLost
    }//GEN-LAST:event_casterFocusLost

    private void accommodateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accommodateMouseClicked
        positionWindow(this);
    }//GEN-LAST:event_accommodateMouseClicked

    private void webMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webMouseClicked
        openWeb();
    }//GEN-LAST:event_webMouseClicked

    private void linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMouseClicked
        copyLink("https://github.com/Zelechos/PragmaticKey");
    }//GEN-LAST:event_linkMouseClicked

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accommodate;
    private javax.swing.JLabel caster;
    private javax.swing.JLabel closeButton;
    private java.awt.Panel container;
    private javax.swing.JLabel link;
    private javax.swing.JLabel separtor;
    private javax.swing.JLabel web;
    // End of variables declaration//GEN-END:variables

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
        text += KeyCaster.keySymbol(nke);
        String response = KeyCaster.cuttingText(text);
        cleanText();
        changeState(response);
    }
    
    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {}

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {}

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {}
    
}