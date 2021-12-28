import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Server{
public static void main(String[] args){
try{

    ServerSocket ss = new ServerSocket(6666);
    Socket s=ss.accept();
    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    Scanner st = new Scanner(System.in);
    String str = (String)dis.readUTF();
    System.out.println("From Client : "+str);
    String input = st.nextLine();
    dout.writeUTF(input);

    dout.flush();
    ss.close();

}catch(Exception e)
{
     System.out.println(e);
}
}
}