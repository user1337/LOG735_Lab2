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
Ex�cutable de Application Deux. � l'ex�cution, l'objet
tente de se connecter � [IP]:12045 pour �tablir
un lien avec le bus d'�v�nements.

D�lai de traitement des �v�nements : 2 secondes.
�v�nement synchronis� : affiche le mot "Avez".
******************************************************/

package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import events.IEventSynchronized;
import events.IPartTwoEvent;

public class MainPartTwo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String ip = JOptionPane.showInputDialog("Entrez le IP du EventBus", "127.0.0.1");

		List<Class> listenedEvents = new ArrayList<Class>();
		listenedEvents.add(IPartTwoEvent.class);
		listenedEvents.add(IEventSynchronized.class);
		
		// On indique que le connecteur est en deuxi�me position(2) pour le traitement des �v�nements synchronis�s.
		EventBusConnector bus = new EventBusConnector(listenedEvents, ip, 12045, 2);
		
		UIMainWindow window = new UIMainWindow(bus, "App Deux", "Avez", 2);
		bus.addObserver(window);
		
		bus.start();
		window.setVisible(true);
	}

}
