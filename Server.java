import java.net.*;

class ServerManager extends Thread{
    ServerSocket ss;
    String cname;
    ServerManager(Socket s,String st){
        super();
        this.ss=ss;
        cname=st;
        start();
    }
    public void run(){

    }

}
public class Server {
    ServerSocket ss;
    Server(){
        try {
            ss = new ServerSocket(6666);
            int count=1; // For keeping count of number of Client
            Socket s;
            System.out.println("Server Started!");
            do{
                s=ss.accept();//establishes connection and waits for the client
                System.out.println("Client Connected :"+count);
                ServerManager re=new ServerManager(s,"Client "+count++);
            }while(true);
          //  ss.close();
        }catch(Exception e){}
    }
    public static void main(String []args){

        new Server();
    }
}
