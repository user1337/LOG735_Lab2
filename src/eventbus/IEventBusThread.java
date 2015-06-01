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
 Date dern. modif. : 	21 mai 2015
******************************************************
Interface pour EventBusThread.
******************************************************/

package eventbus;

import events.IEvent;

public interface IEventBusThread {
	void attachCommunicator(IEventBusCommunicator iebc);
	void addEvent(IEvent ie);
}
