package screens;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import constants.Role;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Menu extends javax.swing.JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 public Menu(Role role) {
	        initComponents();
	    }
	 
 public Menu() {
     initComponents();
     getContentPane().setBackground(Color.GRAY);
 }

	
	
	
 private void initComponents() {

     jPanel1 = new javax.swing.JPanel();
     jFrame1 = new javax.swing.JFrame();
     jFrame2 = new javax.swing.JFrame();

     
     javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
     jPanel1.setLayout(jPanel1Layout);
     jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 100, Short.MAX_VALUE)
     );
     jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 100, Short.MAX_VALUE)
     );

     javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
     jFrame1.getContentPane().setLayout(jFrame1Layout);
     jFrame1Layout.setHorizontalGroup(
         jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 400, Short.MAX_VALUE)
     );
     jFrame1Layout.setVerticalGroup(
         jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 300, Short.MAX_VALUE)
     );

     javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
     jFrame2.getContentPane().setLayout(jFrame2Layout);
     jFrame2Layout.setHorizontalGroup(
         jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 400, Short.MAX_VALUE)
     );
     jFrame2Layout.setVerticalGroup(
         jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 300, Short.MAX_VALUE)
     );

     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     setBackground(new java.awt.Color(204, 204, 204));
     setResizable(false);
     
     JPanel TitlePanel = new JPanel();
     TitlePanel.setBackground(new Color(51, 51, 51));
     
     JLabel lblLibrary = new JLabel();
     lblLibrary.setText("MENU");
     lblLibrary.setHorizontalTextPosition(SwingConstants.CENTER);
     lblLibrary.setHorizontalAlignment(SwingConstants.CENTER);
     lblLibrary.setForeground(Color.WHITE);
     lblLibrary.setFont(lblLibrary.getFont().deriveFont(lblLibrary.getFont().getStyle() | Font.BOLD, lblLibrary.getFont().getSize() + 29f));
     GroupLayout gl_TitlePanel = new GroupLayout(TitlePanel);
     gl_TitlePanel.setHorizontalGroup(
     	gl_TitlePanel.createParallelGroup(Alignment.TRAILING)
     		.addGap(0, 1200, Short.MAX_VALUE)
     		.addGroup(gl_TitlePanel.createSequentialGroup()
     			.addContainerGap()
     			.addComponent(lblLibrary, GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
     			.addContainerGap())
     );
     gl_TitlePanel.setVerticalGroup(
     	gl_TitlePanel.createParallelGroup(Alignment.LEADING)
     		.addGap(0, 62, Short.MAX_VALUE)
     		.addGroup(gl_TitlePanel.createSequentialGroup()
     			.addContainerGap()
     			.addComponent(lblLibrary)
     			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     );
     TitlePanel.setLayout(gl_TitlePanel);
     
     JPanel panel = new JPanel();
         
     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
     layout.setHorizontalGroup(
     	layout.createParallelGroup(Alignment.LEADING)
     		.addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
     		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
     			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE)
     			.addContainerGap())
     );
     layout.setVerticalGroup(
     	layout.createParallelGroup(Alignment.LEADING)
     		.addGroup(layout.createSequentialGroup()
     			.addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
     			.addPreferredGap(ComponentPlacement.RELATED)
     			.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     );
     
     JButton jButton5_1_1 = new JButton();
     jButton5_1_1.setIcon(new ImageIcon("/Users/devanshu/Desktop/Workspace/JAVA/Mini Project/HMenu.jpeg"));
     jButton5_1_1.setBackground(UIManager.getColor("Button.select"));
     panel.add(jButton5_1_1);
     getContentPane().setLayout(layout);

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
         java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     //</editor-fold>

     /* Create and display the form */
     java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
             new AboutUs().setVisible(true);
         }
     });
 }
 private javax.swing.JFrame jFrame1;
 private javax.swing.JFrame jFrame2;
 private javax.swing.JPanel jPanel1;
}