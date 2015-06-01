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
Exécutable de Application Trois. À l'exécution, l'objet
tente de se connecter à [IP]:12045 pour établir
un lien avec le bus d'événements.

Délai de traitement des événements : 1 seconde.
Événement synchronisé : affiche le mot "Réussi".
******************************************************/

package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import events.IEventSynchronized;
import events.IPartThreeEvent;

public class MainPartThree {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String ip = JOptionPane.showInputDialog("Entrez le IP du EventBus", "127.0.0.1");

		List<Class> listenedEvents = new ArrayList<Class>();
		listenedEvents.add(IPartThreeEvent.class);
		listenedEvents.add(IEventSynchronized.class);
		
		// On indique que le connecteur est en troisième position(3) pour le traitement des évènements synchronisés.
		EventBusConnector bus = new EventBusConnector(listenedEvents, ip, 12045, 3);
		
		UIMainWindow window = new UIMainWindow(bus, "App Trois", "Reussi!", 1);
		bus.addObserver(window);
		
		bus.start();
		window.setVisible(true);
	}

}
