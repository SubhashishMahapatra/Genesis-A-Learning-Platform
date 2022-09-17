package screens;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import org.apache.commons.io.FileUtils;

import constants.Role;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class Download extends javax.swing.JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 public Download(Role role) {
	        initComponents();
	    }
	 
 public Download() {
     initComponents();
     getContentPane().setBackground(Color.GRAY);
     getContentPane().setLayout(null);
     getContentPane().add(TitlePanel);
     getContentPane().add(jButton5);
     getContentPane().add(lblNewLabel);
     getContentPane().add(lblPoc_1);
     getContentPane().add(lblPcpf);
     getContentPane().add(lblDbms);
     getContentPane().add(lblPoc);
     getContentPane().add(btnNewButton_1_1_1_1);
     getContentPane().add(progressBar_4);
     getContentPane().add(btnNewButton_1_1);
     getContentPane().add(progressBar_2);
     getContentPane().add(btnNewButton);
     getContentPane().add(btnNewButton_1);
     getContentPane().add(progressBar_1);
     getContentPane().add(progressBar);
     getContentPane().add(btnNewButton_1_1_1);
     getContentPane().add(progressBar_3);
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
     
     jButton5 = new JButton();
     jButton5.setBounds(129, 88, 518, 210);
     jButton5.setIcon(new ImageIcon("/Users/devanshu/Desktop/Workspace/JAVA/Mini Project/icon2.jpeg"));
     jButton5.setBackground(UIManager.getColor("Button.select"));
     
     TitlePanel = new JPanel();
     TitlePanel.setBounds(0, 0, 800, 62);
     TitlePanel.setBackground(new Color(51, 51, 51));
     
     JLabel lblLibrary = new JLabel();
     lblLibrary.setText("DOWNLOAD BOOK");
     lblLibrary.setHorizontalTextPosition(SwingConstants.CENTER);
     lblLibrary.setHorizontalAlignment(SwingConstants.CENTER);
     lblLibrary.setForeground(Color.WHITE);
     lblLibrary.setFont(lblLibrary.getFont().deriveFont(lblLibrary.getFont().getStyle() | Font.BOLD, lblLibrary.getFont().getSize() + 29f));
     GroupLayout gl_TitlePanel = new GroupLayout(TitlePanel);
     gl_TitlePanel.setHorizontalGroup(
     	gl_TitlePanel.createParallelGroup(Alignment.LEADING)
     		.addGroup(gl_TitlePanel.createSequentialGroup()
     			.addGap(116)
     			.addComponent(lblLibrary, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
     			.addContainerGap(134, Short.MAX_VALUE))
     );
     gl_TitlePanel.setVerticalGroup(
     	gl_TitlePanel.createParallelGroup(Alignment.TRAILING)
     		.addGroup(gl_TitlePanel.createSequentialGroup()
     			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     			.addComponent(lblLibrary)
     			.addContainerGap())
     );
     TitlePanel.setLayout(gl_TitlePanel);
     
     progressBar = new JProgressBar(0,100);
     progressBar.setBounds(481, 335, 166, 20);
     progressBar.setStringPainted(true);
     
     
     btnNewButton = new JButton("DOWNLOAD");
     btnNewButton.setBounds(319, 335, 129, 29);
     btnNewButton.addActionListener(new ActionListener() 
     {
     	public void actionPerformed(ActionEvent e)
     	{
     		int i = 0;
     		if (i<101)
     		{
     			i=i+100;
     			progressBar.setValue(i);
     		}
     		else
     		{
     			JOptionPane.showMessageDialog(null, "done");
     		}
     		
     		String fileLink = "file:///Users/devanshu/Desktop/SAMPLE/UPLOAD/DSA.zip";
     		String oppath = "/Users/devanshu/Desktop/SAMPLE/DOWNLOAD/DSA.zip";
     		      try 
     		      	{
     		    	  	FileUtils.copyURLToFile(new URL(fileLink), new File(oppath));
     		      	}
     		      	catch (IOException e1) 
     		      	{
     		      		// TODO Auto-generated catch block
     		      		e1.printStackTrace();
     		      	}
     		  }
     	}
     );
     
     lblNewLabel = new JLabel("DSA");
     lblNewLabel.setBounds(140, 322, 86, 40);
     lblNewLabel.setFont(new Font("Apple Chancery", Font.BOLD, 34));
     
     lblDbms = new JLabel("DBMS");
     lblDbms.setBounds(140, 382, 106, 40);
     lblDbms.setFont(new Font("Apple Chancery", Font.BOLD, 34));
     
     lblPoc = new JLabel("POC");
     lblPoc.setBounds(140, 453, 86, 40);
     lblPoc.setFont(new Font("Apple Chancery", Font.BOLD, 34));
     
     progressBar_1 = new JProgressBar(0, 100);
     progressBar_1.setBounds(481, 402, 166, 20);
     progressBar_1.setStringPainted(true);
     
     btnNewButton_1 = new JButton("DOWNLOAD");
     btnNewButton_1.setBounds(319, 395, 129, 29);
     btnNewButton_1.addActionListener(new ActionListener() 
     {
     	public void actionPerformed(ActionEvent e)
     	{
     		int i = 0;
     		if (i<101)
     		{
     			i=i+100;
     			progressBar_1.setValue(i);
     		}
     		else
     		{
     			JOptionPane.showMessageDialog(null, "done");
     		}
     		
     		String fileLink = "file:///Users/devanshu/Desktop/SAMPLE/UPLOAD/DBMS.zip";
     		String oppath = "/Users/devanshu/Desktop/SAMPLE/DOWNLOAD/DBMS.zip";
     		      try 
     		      	{
     		    	  	FileUtils.copyURLToFile(new URL(fileLink), new File(oppath));
     		      	}
     		      	catch (IOException e1) 
     		      	{
     		      		// TODO Auto-generated catch block
     		      		e1.printStackTrace();
     		      	}
     		  }
     	}
     );
     
     progressBar_2 = new JProgressBar(0, 100);
     progressBar_2.setBounds(481, 466, 166, 20);
     progressBar_2.setStringPainted(true);
     
     btnNewButton_1_1 = new JButton("DOWNLOAD");
     btnNewButton_1_1.setBounds(327, 466, 121, 29);
     btnNewButton_1_1.addActionListener(new ActionListener() 
     {
     	public void actionPerformed(ActionEvent e)
     	{
     		int i = 0;
     		if (i<101)
     		{
     			i=i+100;
     			progressBar_2.setValue(i);
     		}
     		else
     		{
     			JOptionPane.showMessageDialog(null, "done");
     		}
     		
     		
     		String fileLink = "file:///Users/devanshu/Desktop/SAMPLE/UPLOAD/POC.zip";
     		String oppath = "/Users/devanshu/Desktop/SAMPLE/DOWNLOAD/DBMS.zip";
     		      try 
     		      	{
     		    	  	FileUtils.copyURLToFile(new URL(fileLink), new File(oppath));
     		      	}
     		      	catch (IOException e1) 
     		      	{
     		      		// TODO Auto-generated catch block
     		      		e1.printStackTrace();
     		      	}
     		  }
     	}
     );
     
     lblPcpf = new JLabel("PCPF");
     lblPcpf.setBounds(140, 518, 123, 40);
     lblPcpf.setFont(new Font("Apple Chancery", Font.BOLD, 34));
     
     lblPoc_1 = new JLabel("MATHS");
     lblPoc_1.setBounds(140, 590, 150, 40);
     lblPoc_1.setFont(new Font("Apple Chancery", Font.BOLD, 34));
     
     progressBar_3 = new JProgressBar(0, 100);
     progressBar_3.setBounds(481, 538, 166, 20);
     progressBar_3.setStringPainted(true);
     
     btnNewButton_1_1_1 = new JButton("DOWNLOAD");
     btnNewButton_1_1_1.setBounds(327, 531, 121, 29);
     btnNewButton_1_1_1.addActionListener(new ActionListener() 
     {
     	public void actionPerformed(ActionEvent e)
     	{
     		int i = 0;
	     		if (i<101)
	     		{
	     			i=i+100;
	     			progressBar_3.setValue(i);
	     		}
	     		else
	     		{
	     			JOptionPane.showMessageDialog(null, "done");
	     		}
	     		
     		String fileLink = "file:///Users/devanshu/Desktop/SAMPLE/UPLOAD/PCPF.zip";
     		String oppath = "/Users/devanshu/Desktop/SAMPLE/DOWNLOAD/PCPF.zip";
     		      try 
     		      	{
     		    	  	FileUtils.copyURLToFile(new URL(fileLink), new File(oppath));
     		      	}
     		      	catch (IOException e1) 
     		      	{
     		      		// TODO Auto-generated catch block
     		      		e1.printStackTrace();
     		      	}
     		  }
     	}
     );
     
     progressBar_4 = new JProgressBar(0, 100);
     progressBar_4.setBounds(481, 587, 166, 20);
     progressBar_4.setStringPainted(true);
     
     btnNewButton_1_1_1_1 = new JButton("DOWNLOAD");
     btnNewButton_1_1_1_1.setBounds(327, 587, 121, 29);
     btnNewButton_1_1_1_1.addActionListener(new ActionListener() 
     {
     	public void actionPerformed(ActionEvent e)
     	{
     		int i = 0;
     		if (i<101)
     		{
     			i=i+100;
     			progressBar_4.setValue(i);
     		}
     		else
     		{
     			JOptionPane.showMessageDialog(null, "done");
     		}
     		
     		String fileLink = "file:///Users/devanshu/Desktop/SAMPLE/UPLOAD/MATHS.zip";
     		String oppath = "/Users/devanshu/Desktop/SAMPLE/DOWNLOAD/MATHS.zip";
     		      try 
     		      	{
     		    	  	FileUtils.copyURLToFile(new URL(fileLink), new File(oppath));
     		      	}
     		      	catch (IOException e1) 
     		      	{
     		      		// TODO Auto-generated catch block
     		      		e1.printStackTrace();
     		      	}
     		  }
     	}
     );
     setMaximumSize(new java.awt.Dimension(800, 680));
     setMinimumSize(new java.awt.Dimension(800, 680));

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
 private JPanel TitlePanel;
 private JButton jButton5;
 private JLabel lblNewLabel;
 private JLabel lblPoc_1;
 private JLabel lblPcpf;
 private JLabel lblDbms;
 private JLabel lblPoc;
 private JButton btnNewButton_1_1_1_1;
 private JProgressBar progressBar_4;
 private JButton btnNewButton_1_1;
 private JProgressBar progressBar_2;
 private JButton btnNewButton;
 private JButton btnNewButton_1;
 private JProgressBar progressBar_1;
 private JProgressBar progressBar;
 private JButton btnNewButton_1_1_1;
 private JProgressBar progressBar_3;
}