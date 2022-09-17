package screens;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import constants.Role;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Library extends javax.swing.JFrame{

	private static final long serialVersionUID = 1L;

	  
	 
 public Library(Role role) {
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
     lblLibrary.setText("LIBRARY");
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
     
     JButton issueBooks = new JButton();
     issueBooks.setFont(new Font("Georgia", Font.BOLD, 19));
     issueBooks.setIcon(new ImageIcon("/Users/devanshu/Desktop/Workspace/JAVA/Mini Project/result.png"));
     issueBooks.setText(" Issue Book");
     issueBooks.setBackground(UIManager.getColor("Button.select"));
     issueBooks.addMouseListener(new java.awt.event.MouseAdapter() {
         
 		public void mousePressed(java.awt.event.MouseEvent evt) {
 			issueBooks(evt);
          }

 		private void issueBooks(java.awt.event.MouseEvent evt)
 		{
 			
 			// TODO Auto-generated method stub
 			BookIssuingScreen BookIssuingScreen = new BookIssuingScreen(null);
 	    	BookIssuingScreen.setVisible(true);
 			
 		}
      });
     
     
     JButton downloadBtn = new JButton();
     downloadBtn.setIcon(new ImageIcon(Library.class.getResource("/assets/download.png")));
     downloadBtn.setText("Download Book");
     downloadBtn.setFont(new Font("Georgia", Font.BOLD, 19));
     downloadBtn.setBackground(UIManager.getColor("Button.select"));
     downloadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
        
		public void mousePressed(java.awt.event.MouseEvent evt) {
			downloadBtn(evt);
         }

		private void downloadBtn(java.awt.event.MouseEvent evt)
		{
			
			// TODO Auto-generated method stub
			Download Download = new Download();
			Download.setVisible(true);
			
		}
     });
     
     
         
     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
     layout.setHorizontalGroup(
     	layout.createParallelGroup(Alignment.TRAILING)
     		.addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
     		.addGroup(layout.createSequentialGroup()
     			.addContainerGap()
     			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
     				.addComponent(downloadBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     				.addComponent(issueBooks, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
     			.addGap(252))
     );
     layout.setVerticalGroup(
     	layout.createParallelGroup(Alignment.LEADING)
     		.addGroup(layout.createSequentialGroup()
     			.addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
     			.addGap(53)
     			.addComponent(issueBooks, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
     			.addGap(36)
     			.addComponent(downloadBtn, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
     			.addContainerGap(71, Short.MAX_VALUE))
     );
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
         java.util.logging.Logger.getLogger(Download.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Download.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Download.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Download.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     //</editor-fold>

     /* Create and display the form */
     java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
             new Download().setVisible(true);
         }
     });
 }
 private javax.swing.JFrame jFrame1;
 private javax.swing.JFrame jFrame2;
 private javax.swing.JPanel jPanel1;
}