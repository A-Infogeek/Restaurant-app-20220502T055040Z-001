import java.net.Socket;

public class Client {
    public static void main(String []args){
        try{
            Socket s=new Socket("localhost",6666);
          System.out.println("You are connected!");
            new LoginPage().setVisible(true);
            s.close();
        }catch(Exception e){}

    }
}
