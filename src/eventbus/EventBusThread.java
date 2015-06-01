/******************************************************
 Cours : 				LOG735
 Session : 				Été 2015
 Groupe : 				01
 Projet : 				Laboratoire 2
 Étudiants : 			Huy-Son Pham
 						Antoine McNabb-Baltar
 Code(s) perm. : 		PHAH20118704
 						MCNA06089101
 					
 Date création : 		21 mai 2015
 Date dern. modif. : 	21 mai 2015
******************************************************
Thread qui achemine les événements contenus sur le bus
d'événements aux Communicators qui sont enregistrés.
******************************************************/

package eventbus;

import java.util.ArrayList;
import java.util.List;

import events.IEvent;

public class EventBusThread extends Thread implements IEventBusThread {
	private List<IEventBusCommunicator> lstComm = new ArrayList<IEventBusCommunicator>();
	private EventBusServerThread server;
	private List<IEvent> eventsToSend = new ArrayList<IEvent>();
	
	public EventBusThread(int port) {
		server = new EventBusServerThread(port, this);
		server.start();
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				synchronized(eventsToSend) {
					if (eventsToSend.size() > 0) {
						System.out.println("Envoie de l'événement " + eventsToSend.get(0).toString());
						for(IEventBusCommunicator ievc : lstComm)
							ievc.sendToListener(eventsToSend.get(0));
						eventsToSend.remove(0);
					}
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void addEvent(IEvent ie) {
		eventsToSend.add(ie);
	}

	public void attachCommunicator(IEventBusCommunicator iebc) {
		lstComm.add(iebc);
	}
	
}
