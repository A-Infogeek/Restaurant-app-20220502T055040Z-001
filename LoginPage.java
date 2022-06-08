import javax.swing.*;
import java.sql.*;
import java.net.*;
public class LoginPage extends JFrame {
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    
    public LoginPage() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280, 980);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204,70));
        jPanel1.setLayout(null);
        jPanel1.setBounds(790, 420, 350, 400);

        jLabel2.setFont(new java.awt.Font("Harrington", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Sign In");
        jLabel2.setBounds(130, 30, 90, 40);
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Harrington", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Password");
        jLabel3.setBounds(40, 170, 150, 30);
        jPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Harrington", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Username");
        jLabel4.setBounds(40, 110, 150,30);
        jPanel1.add(jLabel4);

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField2.setBounds(190, 110, 130, 30);
        jPanel1.add(jTextField2);

        jPasswordField1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPasswordField1.setPreferredSize(new java.awt.Dimension(90, 25));
        jPasswordField1.setBounds(190, 170, 130, 30);
        jPanel1.add(jPasswordField1);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Harrington", 0, 11)); // NOI18N
        jButton1.setText("Forgot Password");
        jButton1.setBounds(207, 330, 120, 25);
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 102, 153));
        jButton2.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Log In");
        jButton2.setBounds(120, 240, 120, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jButton3.setText("Sign Up");
        jButton3.setBounds(40, 330, 100, 25);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        getContentPane().add(jPanel1);

        jLabel5.setFont(new java.awt.Font("Juice ITC", 1, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setText("The Foodhub Restaurant");
        jLabel5.setBounds(10, 20, 450, 90);
        add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Harrington", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("Life is too short for eating boring food.");
        jLabel6.setBounds(10, 150, 600, 50);
        add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Harrington", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setText("Just try once at our restaurant.");
        jLabel7.setBounds(80, 200, 500, 50);
        add(jLabel7);

        jLabel1.setIcon(new javax.swing.ImageIcon("Images\\Chinahasopened1280x940.jpeg")); // NOI18N
        jLabel1.setBounds(0, 0, 1340, 940);
        getContentPane().add(jLabel1);
    }
     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

            String admin = new String("Admin");
            String admpass = new String("12345");

            String user = jTextField2.getText();
            String pass = new String(jPasswordField1.getPassword());

            if(user.equals(admin) && pass.equals(admpass))
            {
                   dispose();
                   new Admin().setVisible(true);
            }
            else{    
           try {
        Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopj_project","root","root@123456");
       Statement stmt=con.createStatement();

        if (user != null && pass != null) {
            String sql = "select * from signup_user_data where username='" + user + "' and password='" + pass + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
            try{
            Socket s=new Socket("localhost",6666);
            System.out.println("You are connected!");
            new Homepage().setVisible(true);
            s.close();
             }catch(Exception e){}  
            } else {
                 JOptionPane.showMessageDialog(this," Invalid user");
            }
        }

    } catch (SQLException err) {
        JOptionPane .showMessageDialog(this, err.getMessage());
    }catch(Exception err){
       JOptionPane.showMessageDialog(this, err.getMessage());
    }
    }}  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
           new Signup().setVisible(true);
    }
    public static void main(String args[]) {

                LoginPage f = new LoginPage();
                f.setVisible(true);
        }
}
