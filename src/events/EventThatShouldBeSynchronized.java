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
Événement lancé par les boutons "Envoi Synchronisé"
des Applications.
******************************************************/

package events;

public class EventThatShouldBeSynchronized extends EventForAll implements IEventSynchronized {
	
	private static final long serialVersionUID = 6603201529319860113L;
	
	private int targetConnectorNumber;	// connecteur cible de l'évènement

	public EventThatShouldBeSynchronized(String m){
		super(m);
		this.targetConnectorNumber = 1;	// connecteur cible initialisé à 1
	}
	
	public int getTargetConnectorNumber() {
		return this.targetConnectorNumber;
	}
	
	/*
	 * Méthode permettant d'incrémenter le numéro du connecteur cible courant(passer au connecteur suivant).
	 * */
	public void incrementTargetConnectorNumber() {
		this.targetConnectorNumber += 1;
	}
	
}
