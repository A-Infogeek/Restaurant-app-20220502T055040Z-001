public class Homepage extends javax.swing.JFrame {

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;

    public Homepage() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(1280,980);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,150));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102,120));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102,120));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Home");
        jLabel2.setBounds(90, -5, 170, 60);
        jPanel2.add(jLabel2);

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setOpaque(true);
        jLabel3.setBounds(0,0,10,50);
        jPanel2.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon("Images\\Png\\home.png")); // NOI18N
        jLabel4.setBounds(30, 0, 50, 50);
        jPanel2.add(jLabel4);
        jPanel2.setBounds(0, 120, 260, 50);
        jPanel1.add(jPanel2);


        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Menu");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jLabel5.setBounds(90, -5, 170, 60);
        jPanel3.add(jLabel5);

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setOpaque(true);
        jLabel6.setBounds(0, 0, 10, 50);
        jPanel3.add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon("Images\\Png\\Menu.png")); // NOI18N
        jLabel7.setBounds(30, 0, 50, 50);
        jPanel3.add(jLabel7);
        jPanel3.setBounds(0, 170, 260, 50);
        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102,120));
        jPanel4.setToolTipText("");
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        
        jPanel4.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Making Order");
        jLabel8.setBounds(90, -5, 170, 60);
        jPanel4.add(jLabel8);

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setOpaque(true);
        jLabel9.setBounds(0, 0, 10, 50);
        jPanel4.add(jLabel9);

        jLabel10.setIcon(new javax.swing.ImageIcon("Images\\Png\\notif.png")); // NOI18N
        jLabel10.setBounds(30, 0, 50, 50);
        jPanel4.add(jLabel10);
        jPanel4.setBounds(0, 220, 260, 50);
        jPanel1.add(jPanel4);
        jPanel5.setBackground(new java.awt.Color(102, 102, 102,120));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Cart");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jLabel11.setBounds(90, -5, 170, 60);
        jPanel5.add(jLabel11);

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setOpaque(true);
        jLabel12.setBounds(0, 0, 10, 50);
        jPanel5.add(jLabel12);

        jLabel13.setIcon(new javax.swing.ImageIcon("Images\\Png\\Cart.png")); // NOI18N
        jLabel13.setBounds(30, 0, 50, 50);
        jPanel5.add(jLabel13);
        jPanel5.setBounds(0, 270, 260, 50);
        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102,120));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText("Place Order");
        jLabel14.setBounds(90, -5, 170, 60);
        jPanel6.add(jLabel14);

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setOpaque(true);
        jLabel15.setBounds(0, 0, 10, 50);
        jPanel6.add(jLabel15);

        jLabel16.setIcon(new javax.swing.ImageIcon("Images\\Png\\delivery.png")); // NOI18N
        jLabel16.setBounds(30, 0, 50, 50);
        jPanel6.add(jLabel16);
        jPanel6.setBounds(0, 320, 260, 50);
        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102,120));
        jPanel7.setToolTipText("");
        jPanel7.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 255));
        jLabel17.setText("View Bills");
        jLabel17.setBounds(90, -5, 170, 60);
        jPanel7.add(jLabel17);

        jLabel18.setBackground(new java.awt.Color(204, 204, 255));
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setOpaque(true);
        jLabel18.setBounds(0, 0, 10, 50);
        jPanel7.add(jLabel18);

        jLabel19.setIcon(new javax.swing.ImageIcon("Images\\Png\\Stats.png")); // NOI18N
        jLabel19.setBounds(30, 0, 50, 50);
        jPanel7.add(jLabel19);
        jPanel7.setBounds(0, 370, 260, 50);
        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102,120));
        jPanel8.setToolTipText("");
        jPanel8.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 255, 255));
        jLabel20.setText("About Us");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jLabel20.setBounds(90, -5, 170, 60);
        jPanel8.add(jLabel20);

        jLabel21.setBackground(new java.awt.Color(204, 204, 255));
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setOpaque(true);
        jLabel21.setBounds(0, 0, 10, 50);
        jPanel8.add(jLabel21);

        jLabel22.setIcon(new javax.swing.ImageIcon("Images\\Png\\Help.png")); // NOI18N
        jLabel22.setBounds(30, 0, 50, 50);
        jPanel8.add(jLabel22);
        jPanel8.setBounds(0, 470, 260, 50);
        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102,120));
        jPanel9.setToolTipText("");
        jPanel9.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 255, 255));
        jLabel23.setText("Setting");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jLabel23.setBounds(90, -5, 170, 60);
        jPanel9.add(jLabel23);

        jLabel24.setBackground(new java.awt.Color(204, 204, 255));
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setOpaque(true);
        jLabel24.setBounds(0, 0, 10, 50);
        jPanel9.add(jLabel24);

        jLabel25.setIcon(new javax.swing.ImageIcon("Images\\Png\\Setting.png")); // NOI18N
        jLabel25.setBounds(30, 0, 50, 50);
        jPanel9.add(jLabel25);
        jPanel9.setBounds(0, 420, 260, 50);
        jPanel1.add(jPanel9);

        jPanel11.setBackground(new java.awt.Color(102, 102, 102,120));
        jPanel11.setToolTipText("");
        jPanel11.setLayout(null);

        jLabel28.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 255, 255));
        jLabel28.setText("Logout");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jLabel28.setBounds(90, -5, 170, 60);
        jPanel11.add(jLabel28);

        jLabel29.setBackground(new java.awt.Color(204, 204, 255));
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setOpaque(true);
        jLabel29.setBounds(0, 0, 10, 50);
        jPanel11.add(jLabel29);

        jLabel30.setIcon(new javax.swing.ImageIcon("Images\\Png\\closing.png")); // NOI18N
        jLabel30.setBounds(30, 0, 50, 50);
        jPanel11.add(jLabel30);
        jPanel11.setBounds(0, 720, 260, 50);
        jPanel1.add(jPanel11);
        jPanel1.setBounds(0, 0, 260, 980);
        getContentPane().add(jPanel1);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51,150));
        jPanel10.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 204, 204));
        jLabel26.setText("Welcome to our Restaurents");
        jLabel26.setBounds(120, 50, 550, 60);
        jPanel10.add(jLabel26);

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Segoe Script", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 204, 0));
        jLabel27.setText("<html>Our Promise to you provide a professional, yet<br>homey, style, of hospitality that makes all guests<br>Whether leisure or business travelers, feel safe.<br>Welcome and happy to be here. <br>A warm meal, a clean and comfortable place to <br>stay, a smile and a pleasent attitude can turn <br>strangers into friends.</html>");
        jLabel27.setBounds(90, 120, 630, 310);
        jPanel10.add(jLabel27);
        jPanel10.setBounds(410, 210, 770, 460);
        getContentPane().add(jPanel10);

        jLabel1.setIcon(new javax.swing.ImageIcon("Images\\pexels-lisa-fotios-776538.jpg")); // NOI18N
        jLabel1.setBounds(0, 0, 1280, 980);
        getContentPane().add(jLabel1);


    }                 

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        new MenuPage().setVisible(true);
    }                                    

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {                                      
        dispose();
        new LoginPage().setVisible(true);
    }                                     

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        dispose();
    //    new OrderPage().setVisible(true);
    }                                                                    

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {                                      
       dispose();
     //   new Cart().setVisible((true));
    }                                     

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {                                      
         dispose();
       // new AboutUs().setVisible((true));
    }                                     

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {                                      
           dispose();
      //  new Settings().setVisible((true));
    }                                     

    public static void main(String args[]) {
  
               new Homepage().setVisible(true);
    }
                  
}
