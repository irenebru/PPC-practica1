/**
 * 
 */
package ppcpractica1;

import java.net.*;
import java.io.*;


/**
 * @author irene
 *
 */
public class servidor {

	/**
	 * @param args
	 */
	
	public static void manejaPeticion (Socket s) throws IOException{
		DataInputStream sIn;
		PrintStream sOut;
		
		sIn = new DataInputStream (s.getInputStream());
		sOut = new PrintStream (s.getOutputStream());
		String texto = sIn.readLine();
		sOut.println(texto);
		
		sIn.close();
		sOut.close();
		s.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket s = null;
		Socket cliente = null;
		
		try {
			s = new ServerSocket (9999);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		while (true) {
			try {
				cliente = s.accept();
				manejaPeticion(cliente);
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
