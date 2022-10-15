/**
 * 
 */
package ppcpractica1;

import java.net.*;
import java.io.*;
/**
 * @author Irene Leonor Bru Santa
 *
 */
public class cliente {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket miCliente;
		DataInputStream entrada;
		DataOutputStream salida;
		
		try {
			miCliente = new Socket ("localhost", 9999);
			entrada = new DataInputStream(miCliente.getInputStream());
			salida = new DataOutputStream (miCliente.getOutputStream());
			
			
			salida.writeBytes("Hola mundo\n");
			System.out.println(entrada.readLine());
			
			entrada.close();
			salida.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
