import javax.swing.*;
public class Signup extends JFrame {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;

    public Signup() {
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,1040, 720);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Harrington", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204,204,204));
        jLabel3.setText("Sign Up");
        jLabel3.setBounds(400, 40, 180, 60);
        getContentPane().add(jLabel3);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204,80));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);
        jPanel1.setBounds(260, 130, 500, 500);

        jLabel2.setFont(new java.awt.Font("Harrington", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255,153,255));
        jLabel2.setText("Username");
        jLabel2.setBounds(60, 60, 150, 30);
        jPanel1.add(jLabel2);

        jLabel5.setFont(new java.awt.Font("Harrington", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255,153,255));
        jLabel5.setText("Password");
        jLabel5.setBounds(60, 110, 170, 30);
        jPanel1.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Harrington", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255,153,255));
        jLabel6.setText("Email");
        jLabel6.setBounds(60, 160, 190, 30);
        jPanel1.add(jLabel6);

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.setBounds(270, 260, 170, 30);
        jPanel1.add(jTextField1);

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField2.setBounds(270, 60, 170, 30);
        jPanel1.add(jTextField2);

        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField4.setBounds(270, 160, 170, 30);
        jPanel1.add(jTextField4);

        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField5.setBounds(270, 360, 170, 30);
        jPanel1.add(jTextField5);

        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField6.setBounds(270, 310, 170, 30);
        jPanel1.add(jTextField6);

        jPasswordField1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPasswordField1.setBounds(270, 110, 170, 30);
        jPanel1.add(jPasswordField1);

        jLabel7.setFont(new java.awt.Font("Harrington", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255,153,255));
        jLabel7.setText("Mobile");
        jLabel7.setBounds(60, 210, 210, 30);
        jPanel1.add(jLabel7);

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField3.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField3.setBounds(270, 210, 170, 30);
        jPanel1.add(jTextField3);

        jLabel8.setFont(new java.awt.Font("Harrington", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255,153,255));
        jLabel8.setText("Address");
        jLabel8.setBounds(60, 260, 230, 30);
        jPanel1.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255,153,255));
        jLabel9.setText("Security Question");
        jLabel9.setBounds(60, 310, 250, 30);
        jPanel1.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Harrington", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255,153,255));
        jLabel10.setText("Answer");
        jLabel10.setBounds(60, 360, 270, 30);
        jPanel1.add(jLabel10);

        jButton1.setBackground(new java.awt.Color(204,255,153));
        jButton1.setFont(new java.awt.Font("Harrington", 1, 28)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Submit");
        jButton1.setBounds(200, 410, 120, 30);
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setFont(new java.awt.Font("Harrington", 1, 22)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("Back");
        jButton2.setBounds(360, 460, 100, 30);
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setFont(new java.awt.Font("Harrington", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("Sign In");
        jButton3.setBounds(60, 460, 100, 30);
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        getContentPane().add(jPanel1);

        jLabel1.setFont(new java.awt.Font("Harrington", 1, 28)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("SignUp.jpg")); // NOI18N
        jLabel1.setBounds(0, 0, 1024, 684);
        getContentPane().add(jLabel1);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
           dispose();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
           dispose();
    }
    public static void main(String args[]) {
                new Signup().setVisible(true);
    }
}
