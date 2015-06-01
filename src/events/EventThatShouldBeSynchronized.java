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
�v�nement lanc� par les boutons "Envoi Synchronis�"
des Applications.
******************************************************/

package events;

public class EventThatShouldBeSynchronized extends EventForAll implements IEventSynchronized {
	
	private static final long serialVersionUID = 6603201529319860113L;
	
	private int targetConnectorNumber;	// connecteur cible de l'�v�nement

	public EventThatShouldBeSynchronized(String m){
		super(m);
		this.targetConnectorNumber = 1;	// connecteur cible initialis� � 1
	}
	
	public int getTargetConnectorNumber() {
		return this.targetConnectorNumber;
	}
	
	/*
	 * M�thode permettant d'incr�menter le num�ro du connecteur cible courant(passer au connecteur suivant).
	 * */
	public void incrementTargetConnectorNumber() {
		this.targetConnectorNumber += 1;
	}
	
}
