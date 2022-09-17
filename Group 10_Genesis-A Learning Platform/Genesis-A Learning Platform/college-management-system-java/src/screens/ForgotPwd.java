package screens;

import com.formdev.flatlaf.FlatLightLaf;
import constants.Role;
import constants.Strings;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import repository.DBConnection;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


public class ForgotPwd extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    URL iconURL = getClass().getResource("/assets/college_mang_icon.png");
    ImageIcon icon = new ImageIcon(iconURL);

    Connection conn = new DBConnection().connect();
    private void customizeComponents() {
        setLocationRelativeTo(this);
    }

    public ForgotPwd() {
    	
        initComponents();
        customizeComponents();
    }

    private void forgotPwd(java.awt.event.ActionEvent event) {
        if (UsernameTextField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Username Field Is Empty!!!");
        } else if (NewPasswordTextField.getPassword().length <= 0) {
            JOptionPane.showMessageDialog(null, "Password Field Is Empty!!!");
        } else {
            
            final String admin_sql = "UPDATE admins SET password=? WHERE usesrname=?";
            final String faculty_sql = "UPDATE faculty SET password=? WHERE registration_no=?";
            final String student_sql = "UPDATE student SET password=? WHERE registration_no=?";

            String role = RoleComboBox.getSelectedItem().toString();
            @SuppressWarnings("unused")
			Role role_id = null;
            @SuppressWarnings("deprecation")
			String pstr = NewPasswordTextField.getText();
            String name = UsernameTextField.getText();
            try {
                switch (role) {
                    case "ADMIN":
                    case "admin":
                        role_id = Role.ADMIN;
                        PreparedStatement ad = conn.prepareStatement(admin_sql);
                        ad.setString(1, pstr);
                        ad.setString(2, name);
                        ad.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Password has been successfully changed");

                        break;
                        
                    case "FACULTY":
                    case "faculty":
                        role_id = Role.FACULTY;
                        PreparedStatement fac = conn.prepareStatement(faculty_sql);
                        fac.setString(1, pstr);
                        fac.setString(2, name);
                        fac.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Password has been successfully changed");

                        break;
                    case "STUDENT":
                    case "student":
                        role_id = Role.STUDENT;
                        PreparedStatement stu = conn.prepareStatement(student_sql);
                        stu.setString(1, pstr);
                        stu.setString(2, name);
                        stu.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Password has been successfully changed");
                        
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        BannerLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        NewPasswordLabel = new javax.swing.JLabel();
        NewPasswordTextField = new javax.swing.JPasswordField();
        RoleLabel = new javax.swing.JLabel();
        RoleComboBox = new javax.swing.JComboBox<>();
        ButtonPanel = new javax.swing.JPanel();
        UpdateButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Strings.getAPP_NAME());
        setIconImage(icon.getImage());
        setMaximumSize(new java.awt.Dimension(680, 620));
        setMinimumSize(new java.awt.Dimension(680, 620));
        setName("LoginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        TitlePanel.setBackground(new java.awt.Color(51, 51, 51));

        TitleLabel.setFont(TitleLabel.getFont().deriveFont(TitleLabel.getFont().getStyle() | java.awt.Font.BOLD, TitleLabel.getFont().getSize()+29));
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("constants/strings"); // NOI18N
        TitleLabel.setText(bundle.getString("LOGIN")); // NOI18N
        TitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BannerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BannerLabel.setIcon(new ImageIcon(ForgotPwd.class.getResource("/assets/forgot.png"))); // NOI18N
        BannerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BannerLabel.setMaximumSize(new java.awt.Dimension(320, 200));
        BannerLabel.setMinimumSize(new java.awt.Dimension(320, 200));
        BannerLabel.setPreferredSize(new java.awt.Dimension(320, 200));

        UsernameLabel.setFont(UsernameLabel.getFont().deriveFont(UsernameLabel.getFont().getStyle() | java.awt.Font.BOLD, UsernameLabel.getFont().getSize()+3));
        UsernameLabel.setForeground(new java.awt.Color(60, 185, 145));
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText(bundle.getString("USERNAME")); // NOI18N
        UsernameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        UsernameTextField.setFont(UsernameTextField.getFont().deriveFont(UsernameTextField.getFont().getSize()+1f));
        UsernameTextField.setToolTipText(bundle.getString("USERNAME")); // NOI18N

        NewPasswordLabel.setFont(NewPasswordLabel.getFont().deriveFont(NewPasswordLabel.getFont().getStyle() | java.awt.Font.BOLD, NewPasswordLabel.getFont().getSize()+3));
        NewPasswordLabel.setForeground(new java.awt.Color(60, 185, 145));
        NewPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewPasswordLabel.setText(bundle.getString("NEW_PASSWORD")); // NOI18N
        NewPasswordLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RoleLabel.setFont(RoleLabel.getFont().deriveFont(RoleLabel.getFont().getStyle() | java.awt.Font.BOLD, RoleLabel.getFont().getSize()+3));
        RoleLabel.setForeground(new java.awt.Color(60, 185, 145));
        RoleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoleLabel.setText(bundle.getString("ROLE")); // NOI18N
        RoleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RoleComboBox.setFont(RoleComboBox.getFont().deriveFont(RoleComboBox.getFont().getStyle() | java.awt.Font.BOLD, RoleComboBox.getFont().getSize()+1));
        RoleComboBox.setForeground(new java.awt.Color(51, 51, 51));
        RoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "FACULTY", "STUDENT" }));

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanelLayout.setHorizontalGroup(
        	BodyPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(BodyPanelLayout.createSequentialGroup()
        			.addGap(123)
        			.addGroup(BodyPanelLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(UsernameLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
        				.addComponent(RoleLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
        				.addComponent(NewPasswordLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(BodyPanelLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(RoleComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(UsernameTextField)
        				.addComponent(NewPasswordTextField, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(155, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
        			.addContainerGap(271, Short.MAX_VALUE)
        			.addComponent(BannerLabel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        			.addGap(209))
        );
        BodyPanelLayout.setVerticalGroup(
        	BodyPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(BannerLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
        			.addGroup(BodyPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(UsernameLabel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(UsernameTextField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(BodyPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(NewPasswordLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(NewPasswordTextField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(BodyPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(RoleComboBox, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(RoleLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        BodyPanel.setLayout(BodyPanelLayout);

        UpdateButton.setFont(UpdateButton.getFont().deriveFont(UpdateButton.getFont().getStyle() | java.awt.Font.BOLD, UpdateButton.getFont().getSize()+3));
        UpdateButton.setText(bundle.getString("UPDATE")); // NOI18N
        UpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UpdateButton.setOpaque(false);
        UpdateButton.setPreferredSize(new java.awt.Dimension(180, 40));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(UpdateButton);
        
        BackButton.setFont(BackButton.getFont().deriveFont(BackButton.getFont().getStyle() | java.awt.Font.BOLD, BackButton.getFont().getSize()+3));
        BackButton.setText(bundle.getString("BACK")); 
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackButton.setOpaque(false);
        BackButton.setPreferredSize(new java.awt.Dimension(180, 40));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(BackButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        forgotPwd(evt);
    }//GEN-LAST:event_LoginButtonActionPerformed
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
    	this.dispose();
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
    }//GEN-LAST:event_LoginButtonActionPerformed

    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new LoginScreen().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BannerLabel;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel NewPasswordLabel;
    private javax.swing.JPasswordField NewPasswordTextField;
    private javax.swing.JComboBox<String> RoleComboBox;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    // End of variables declaration//GEN-END:variables
}
