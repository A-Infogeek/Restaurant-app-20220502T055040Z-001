public class MenuPage extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;

    public MenuPage() {
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(1280,980);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Menupage");
        jLabel2.setBounds(560, 30, 260, 60);
        getContentPane().add(jLabel2);

        jLabel4.setIcon(new javax.swing.ImageIcon("Images\\Drinks\\lemon.jpg")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLabel4.setBounds(960, 150, 250, 175);
        getContentPane().add(jLabel4);

        jLabel6.setIcon(new javax.swing.ImageIcon("Images\\Fast Food\\pizza.jpg")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jLabel6.setBounds(360, 150,250, 175);
        getContentPane().add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon("Images\\Desserts\\dessert-main-image-molten-cake-0fbd4f2_copy_250x175.jpg")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jLabel7.setBounds(660, 150, 250, 175);
        getContentPane().add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon("Images\\Menu bar\\1651489128888_copy_250x175.jpg")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jLabel8.setBounds(60, 150, 250, 175);
        getContentPane().add(jLabel8);

        jLabel10.setIcon(new javax.swing.ImageIcon("Images\\Menu bar\\snacks.jpg")); // NOI18N
        jLabel10.setBounds(530, 440, 250, 175);
        getContentPane().add(jLabel10);

        jLabel11.setIcon(new javax.swing.ImageIcon("Images\\Menu bar\\colddrink.jpg")); // NOI18N
        jLabel11.setBounds(840, 440, 250, 175);
       getContentPane().add(jLabel11);

        jLabel12.setIcon(new javax.swing.ImageIcon("Images\\Menu bar\\Salad.jpg")); // NOI18N
        jLabel12.setBounds(220, 440, 250, 175);
        getContentPane().add(jLabel12);

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jButton1.setText("Hompage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(540, 820, 170, 45);
        getContentPane().add(jButton1);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Fast Foods");
        jLabel1.setToolTipText("");
        jLabel1.setBounds(420, 350, 130,40);
        getContentPane().add(jLabel1);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Desserts");
        jLabel3.setToolTipText("");
        jLabel3.setBounds(740, 340, 130,40);
        getContentPane().add(jLabel3);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Beverages");
        jLabel5.setToolTipText("");
        jLabel5.setBounds(1010, 340, 130,40);
        getContentPane().add(jLabel5);

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setText("Salad");
        jLabel9.setToolTipText("");
        jLabel9.setBounds(320, 630, 130,40);
        getContentPane().add(jLabel9);

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Snacks");
        jLabel13.setToolTipText("");
        jLabel13.setBounds(620, 640, 130,40);
        getContentPane().add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 204));
        jLabel14.setText("Cold Drinks");
        jLabel14.setToolTipText("");
        jLabel14.setBounds(920, 640, 130,40);
        getContentPane().add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 204));
        jLabel15.setText("Main Dishes");
        jLabel15.setToolTipText("");
        jLabel15.setBounds(110, 340, 130,40);
        getContentPane().add(jLabel15);

        jLabel17.setIcon(new javax.swing.ImageIcon("Images\\isolated-black-brick-wall.jpg")); // NOI18N
        jLabel17.setBounds(0, 0, 1280, 980);
        getContentPane().add(jLabel17);

    }                        

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        dispose();
        new IndianThali().setVisible(true);
    }                                    

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                     
         dispose();
       new FastFoods().setVisible(true);
    }                                    

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
         dispose();
        new Desserts().setVisible(true);
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        dispose();
        new Beverages().setVisible(true);
    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
       new Homepage().setVisible(true);
    }                                        

    public static void main(String args[]) {
                new MenuPage().setVisible(true);

    }                 
}
