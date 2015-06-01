/******************************************************
 Cours : 				LOG735
 Session : 				�t� 2015
 Groupe : 				01
 Projet : 				Laboratoire 2
 �tudiants : 			Huy-Son Pham
 						Antoine McNabb-Baltar
 Code(s) perm. : 		PHAH20118704
 						MCNA06089101
 					
 Date cr�ation : 		21 mai 2015
 Date dern. modif. : 	1 juin 2015
******************************************************
Classe qui s'occupe de g�rer le thread pour l'ouverture du serveur
etde l'�coute de la conenxion de multiple clients.
******************************************************/

package eventbus;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EventBusServerThread extends Thread {
	private int port;
	private ServerSocket serverSocket;
	private IEventBusThread eventBus;
	
	public EventBusServerThread(int port, IEventBusThread eventBus)
	{
		this.port = port;
		this.eventBus = eventBus;
	}
	
	public void run()
	{ 
		try { 
			serverSocket = new ServerSocket(port); 
        } 
		catch (IOException e) 
        { 
			System.err.println("On ne peut pas �couter au  port: " + port + "."); 
			System.exit(1); 
        } 

		while(true) {
			Socket clientSocket = null; 
			System.out.println ("Le serveur " + port + " est en marche, Attente de la connexion.....");
	
			try { 
				clientSocket = serverSocket.accept(); 
	        } 
			catch (IOException e) 
	        { 
				System.err.println("Accept de " + port + " a �chou�."); 
				System.exit(1); 
	        } 
			
			EventBusCommunicator ebc = new EventBusCommunicator(clientSocket, eventBus);
			ebc.start();
			eventBus.attachCommunicator(ebc);
		}
	}
}
