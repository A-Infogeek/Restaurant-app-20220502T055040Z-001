import java.net.*;
public class Admin extends javax.swing.JFrame {

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageBoard; 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private   ServerSocket serverSocket;
    public Admin() {
        jScrollPane1 = new javax.swing.JScrollPane();
          messageBoard = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(800,800);
        getContentPane().setLayout(null);

         messageBoard.setColumns(20);
         messageBoard.setRows(5);
         messageBoard.setBackground(new java.awt.Color(255, 250, 250));
         messageBoard.setFont(new java.awt.Font("Segoe Print", 0, 18)); 
        jScrollPane1.setViewportView( messageBoard);
        jScrollPane1.setBounds(70, 150, 613, 435);
        getContentPane().add(jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Admin panel");
        jLabel1.setBounds(261, 25, 180, 38);
        getContentPane().add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Connected Users");
        jLabel2.setBounds(66, 120, 175, 26);
        getContentPane().add(jLabel2);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Connect To server");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(90, 610, 220, 30);
        getContentPane().add(jButton1);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(490, 610, 160, 30);
        getContentPane().add(jButton2);
        jLabel3.setIcon(new javax.swing.ImageIcon("Images\\isolated-black-brick-wall.jpg")); // NOI18N
        jLabel3.setBounds(0, 0, 1280, 980);
        getContentPane().add(jLabel3);
}
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          connect();

    }  
     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          dispose();
          new LoginPage().setVisible(true);
    }                                                    
    public void connect(){
           try {
            serverSocket = new ServerSocket(6666);  
            messageBoard.append("Server Connected.\n"); 
            messageBoard.append("Waiting for the clients...\n");
            new ClientAccept().start(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {

                    new Admin().setVisible(true); 
    }                  
                  

class ClientAccept extends Thread {
        public void run() {
            int count =1;
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();  
                       messageBoard.append("Client  Connected..."+count+"\n");
                       count++; 
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }}
}