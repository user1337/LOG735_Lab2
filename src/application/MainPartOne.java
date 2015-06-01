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
 Date dern. modif. : 	1 juin 2015
******************************************************
Exécutable de Application Un. À l'exécution, l'objet
tente de se connecter à [IP]:12045 pour établir
un lien avec le bus d'événements.

Délai de traitement des événements : 3 secondes.
Événement synchronisé : affiche le mot "Vous".
******************************************************/

package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import events.IEventSynchronized;
import events.IPartOneEvent;

public class MainPartOne {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String ip = JOptionPane.showInputDialog("Entrez le IP du EventBus", "127.0.0.1");

		List<Class> listenedEvents = new ArrayList<Class>();
		listenedEvents.add(IPartOneEvent.class);
		listenedEvents.add(IEventSynchronized.class);
		
		// On indique que le connecteur est en première position(1) pour le traitement des évènements synchronisés.
		EventBusConnector bus = new EventBusConnector(listenedEvents, ip, 12045, 1);
		
		UIMainWindow window = new UIMainWindow(bus, "App Un", "Vous", 3);
		bus.addObserver(window);
		
		bus.start();
		window.setVisible(true);
	}

}
