import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client{
	public static void main(String[] args){
		try{

         Socket s=new Socket("localhost",6666);
         DataOutputStream dout = new DataOutputStream(s.getOutputStream());
         DataInputStream dis = new DataInputStream(s.getInputStream());
         //dout.writeUTF("Hello Server");
         Scanner st = new Scanner(System.in);
         String input = st.nextLine();
         dout.writeUTF(input);
         String str = (String)dis.readUTF();
         System.out.println("From Server : "+str);
         dout.flush();
         s.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}