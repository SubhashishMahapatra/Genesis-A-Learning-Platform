package screens;

import com.formdev.flatlaf.FlatLightLaf;
import constants.Role;
import java.net.URL;
import java.sql.Connection;
import javax.swing.ImageIcon;
import repository.DBConnection;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MainScreen extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    

    int deviceWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int deviceHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

    @SuppressWarnings("unused")
	private final Connection conn = new DBConnection().connect();
    URL iconURL = getClass().getResource("/assets/college_mang_icon.png");
    ImageIcon icon = new ImageIcon(iconURL);

    private void customizeComponents() {
        setLocationRelativeTo(this);
    }

    public MainScreen() {
        initComponents();
        customizeComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ToLabel = new javax.swing.JLabel();
        WelcomeLabel = new javax.swing.JLabel();
        RegisterLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        BannerLabel = new javax.swing.JLabel();
        ApplyButton = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("constants/strings"); // NOI18N
        setTitle(bundle.getString("APP_NAME")); // NOI18N
        setIconImage(icon.getImage());
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        ToLabel.setFont(ToLabel.getFont().deriveFont(ToLabel.getFont().getStyle() | java.awt.Font.BOLD, ToLabel.getFont().getSize()+29));
        ToLabel.setForeground(new java.awt.Color(60, 185, 145));
        ToLabel.setText(bundle.getString("TO")); // NOI18N

        WelcomeLabel.setFont(WelcomeLabel.getFont().deriveFont(WelcomeLabel.getFont().getStyle() | java.awt.Font.BOLD, WelcomeLabel.getFont().getSize()+29));
        WelcomeLabel.setForeground(new java.awt.Color(60, 185, 145));
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText(bundle.getString("WELCOME")); // NOI18N
        WelcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        

        LoginButton.setFont(LoginButton.getFont().deriveFont(LoginButton.getFont().getStyle() | java.awt.Font.BOLD, LoginButton.getFont().getSize()+5));
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btn300x60.png"))); // NOI18N
        LoginButton.setText("LOGIN HERE");
        LoginButton.setToolTipText("");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginButtonMousePressed(evt);
            }
        });

        BannerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BannerLabel.setIcon(new ImageIcon(MainScreen.class.getResource("/assets/logo1.png"))); // NOI18N
        BannerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ApplyButton.setFont(ApplyButton.getFont().deriveFont(ApplyButton.getFont().getStyle() | java.awt.Font.BOLD, ApplyButton.getFont().getSize()+5));
        ApplyButton.setForeground(new java.awt.Color(255, 255, 255));
        ApplyButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApplyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btn300x60.png"))); // NOI18N
        ApplyButton.setText(" APPLY NOW");
        ApplyButton.setToolTipText("");
        ApplyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ApplyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ApplyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ApplyButtonMousePressed(evt);
            }
        });
        
        RegisterLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 19));
        RegisterLabel.setForeground(new java.awt.Color(60, 185, 145));
        RegisterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterLabel.setText("No Account? Apply Now"); // NOI18N
        RegisterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        
        label = new JLabel("");
        label.setIcon(new ImageIcon(MainScreen.class.getResource("/assets/reg_icon.png")));
        label.setBackground(new Color(46, 139, 87));
        
        JLabel AppNameLabel = new JLabel();
        AppNameLabel.setText("GENESIS");
        AppNameLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        AppNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        AppNameLabel.setForeground(new Color(60, 185, 145));
        AppNameLabel.setFont(AppNameLabel.getFont().deriveFont(AppNameLabel.getFont().getStyle() | Font.BOLD, AppNameLabel.getFont().getSize() + 29f));
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(488)
        					.addComponent(WelcomeLabel)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(ToLabel))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(221)
        					.addComponent(BannerLabel)))
        			.addContainerGap(281, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(0, 484, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(ApplyButton, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
        					.addGap(34)
        					.addComponent(label, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(LoginButton, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(RegisterLabel)))
        			.addGap(222))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(448)
        			.addComponent(AppNameLabel, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(WelcomeLabel)
        				.addComponent(ToLabel))
        			.addGap(37)
        			.addComponent(AppNameLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(BannerLabel)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(LoginButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        				.addComponent(RegisterLabel))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(ApplyButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        				.addComponent(label, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMousePressed
        this.dispose();
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
    }//GEN-LAST:event_LoginButtonMousePressed

    private void ApplyButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplyButtonMousePressed
        StudentApplicationForm applicationForm = new StudentApplicationForm(Role.ADMIN);
        applicationForm.setVisible(true);
    }//GEN-LAST:event_ApplyButtonMousePressed

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MainScreen().setVisible(true);
        });
    }
    private javax.swing.JLabel ApplyButton;
    private javax.swing.JLabel BannerLabel;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel ToLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel RegisterLabel;
    private JLabel label;
}
